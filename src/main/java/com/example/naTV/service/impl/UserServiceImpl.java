package com.example.naTV.service.impl;

import com.example.naTV.base.BaseServiceImpl;
import com.example.naTV.dao.UserRepository;
import com.example.naTV.mappers.UserMapper;
import com.example.naTV.models.dto.UserDto;
import com.example.naTV.models.entity.User;
import com.example.naTV.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl extends BaseServiceImpl<User,UserRepository, UserDto, UserMapper>
        implements UserService {
    public UserServiceImpl(UserRepository rep, UserMapper mapper) {
        super(rep, mapper);
    }
}
