package com.example.naTV.mappers;

import com.example.naTV.base.BaseMapper;
import com.example.naTV.models.dto.OrderBookDto;
import com.example.naTV.models.entity.OrderBook;
import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;

@Mapper(injectionStrategy = InjectionStrategy.CONSTRUCTOR,componentModel = "spring")
public interface OrderBookMapper extends BaseMapper<OrderBook, OrderBookDto> {


}
