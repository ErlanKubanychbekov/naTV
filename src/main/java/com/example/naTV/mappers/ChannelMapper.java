package com.example.naTV.mappers;

import com.example.naTV.base.BaseMapper;
import com.example.naTV.models.dto.ChannelDto;
import com.example.naTV.models.entity.Channel;
import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;

@Mapper(injectionStrategy = InjectionStrategy.CONSTRUCTOR,componentModel = "spring")
public interface ChannelMapper extends BaseMapper<Channel, ChannelDto> {


}
