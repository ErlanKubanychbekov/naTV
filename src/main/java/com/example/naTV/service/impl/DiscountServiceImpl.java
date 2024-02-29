package com.example.naTV.service.impl;

import com.example.naTV.base.BaseServiceImpl;
import com.example.naTV.dao.DiscountRepository;
import com.example.naTV.mappers.DiscountMapper;
import com.example.naTV.models.dto.DiscountDto;
import com.example.naTV.models.entity.Discount;
import com.example.naTV.models.request.DiscountCreateRequest;
import com.example.naTV.service.DiscountService;
import org.springframework.stereotype.Service;

@Service
public class DiscountServiceImpl extends BaseServiceImpl<Discount, DiscountRepository, DiscountDto, DiscountMapper>
        implements DiscountService {

    public DiscountServiceImpl(DiscountRepository rep, DiscountMapper mapper) {
        super(rep, mapper);
    }

    public DiscountDto create(DiscountCreateRequest request){
        Discount discount = Discount.builder()
                .days(request.getDays())
                .definition(request.getDefinition())
                .start_date(request.getStartDate())
                .percent(request.getPercent())
                .end_date(request.getEndDate())
                .build();
        return save(mapper.toDto(discount,context));
    }
}
