package com.example.naTV.mappers;

import com.example.naTV.base.BaseMapper;
import com.example.naTV.models.dto.UserDto;
import com.example.naTV.models.entity.User;
import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;

@Mapper(injectionStrategy = InjectionStrategy.CONSTRUCTOR,componentModel = "spring")
public interface UserMapper extends BaseMapper<User, UserDto> {


}
