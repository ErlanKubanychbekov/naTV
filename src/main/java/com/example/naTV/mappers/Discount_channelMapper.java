package com.example.naTV.mappers;

import com.example.naTV.base.BaseMapper;
import com.example.naTV.models.dto.DiscountChannelDto;
import com.example.naTV.models.entity.DiscountChannel;
import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;

@Mapper(injectionStrategy = InjectionStrategy.CONSTRUCTOR,componentModel = "spring")
public interface Discount_channelMapper extends BaseMapper<DiscountChannel, DiscountChannelDto> {


}
