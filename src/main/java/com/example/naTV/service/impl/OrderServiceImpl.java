package com.example.naTV.service.impl;

import com.example.naTV.base.BaseServiceImpl;
import com.example.naTV.dao.OrderRepository;
import com.example.naTV.mappers.OrderMapper;
import com.example.naTV.models.dto.OrderDto;
import com.example.naTV.models.entity.Order;
import com.example.naTV.models.entity.User;
import com.example.naTV.models.request.OrderCreateRequest;
import com.example.naTV.service.ChannelService;
import com.example.naTV.service.OrderService;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Service

public class OrderServiceImpl extends BaseServiceImpl<Order, OrderRepository, OrderDto, OrderMapper>
        implements OrderService {

    public OrderServiceImpl(OrderRepository rep, OrderMapper mapper, ChannelService channelService) {
        super(rep, mapper);

    }




    @Override
    public OrderDto create(OrderCreateRequest request) {
        Order order = Order.builder()
                .text(request.getText())
                .user(User.builder()
                        .email(request.getUser().getEmail())
                        .fio(request.getUser().getFio())
                        .phone_num(request.getUser().getPhone_num())
                        .build())
                .total_price()

                .build();

        return mapper.toDto(order,context);
    }
}
