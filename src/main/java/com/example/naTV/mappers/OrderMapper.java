package com.example.naTV.mappers;

import com.example.naTV.base.BaseMapper;
import com.example.naTV.models.dto.OrderDto;
import com.example.naTV.models.entity.Order;
import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;

@Mapper(injectionStrategy = InjectionStrategy.CONSTRUCTOR,componentModel = "spring")
public interface OrderMapper extends BaseMapper<Order, OrderDto> {


}
