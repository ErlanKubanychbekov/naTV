package com.example.naTV.service;

import com.example.naTV.base.BaseService;
import com.example.naTV.models.dto.OrderDto;
import com.example.naTV.models.request.OrderCreateRequest;

import java.math.BigDecimal;

public interface OrderService extends BaseService<OrderDto> {

    OrderDto create(OrderCreateRequest request);
}
