package com.example.naTV.base;

import jakarta.persistence.MappedSuperclass;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
@MappedSuperclass
public abstract class BaseServiceImpl<E extends BaseEntity,
        R extends  BaseRep<E>,
        D extends BaseDto,
        M extends BaseMapper<E,D>>
        implements BaseService<D> {

    protected final R rep;
    protected final M mapper;

    @Autowired
    protected CycleAvoidingMappingContext context;


    public BaseServiceImpl(R rep, M mapper) {
        this.rep = rep;
        this.mapper = mapper;
    }


    @Override
    public D save(D e) {
        return mapper.toDto(rep.save(mapper.toEntity(e,context)),context);
    }

    @Override
    public D findById(Long id) {
        return mapper.toDto(rep.findById(id).orElseThrow(()->new RuntimeException("Empty entity")),context);
    }

    @Override
    public List<D> findAll() {
        return mapper.toDtos(rep.findAll(),context);
    }

    @Override
    public D update(D e) {

        D d = findById(e.getId());

            d.setAddDate(e.getAddDate());
            d.setUpdateDate(e.getUpdateDate());


        return mapper.toDto(rep.saveAndFlush(mapper.toEntity(d,context)),context);
    }

    @Override
    public boolean delete(D e) {
        try {


            save(e);
            return true;
        }catch (Exception ex){
            throw new RuntimeException("Не удалось удалить объект");
        }


    }
}
