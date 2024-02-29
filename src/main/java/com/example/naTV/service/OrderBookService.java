package com.example.naTV.service;

import com.example.naTV.base.BaseService;
import com.example.naTV.models.dto.OrderBookDto;

import java.math.BigDecimal;

public interface OrderBookService extends BaseService<OrderBookDto> {
    BigDecimal getTotalPrice(Long channelId, String text);}
