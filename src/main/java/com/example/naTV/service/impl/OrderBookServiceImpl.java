package com.example.naTV.service.impl;

import com.example.naTV.base.BaseServiceImpl;
import com.example.naTV.dao.OrderBookReposinory;
import com.example.naTV.mappers.OrderBookMapper;
import com.example.naTV.models.dto.OrderBookDto;
import com.example.naTV.models.entity.OrderBook;
import com.example.naTV.service.ChannelService;
import com.example.naTV.service.OrderBookService;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Service
public class OrderBookServiceImpl extends BaseServiceImpl<OrderBook, OrderBookReposinory, OrderBookDto, OrderBookMapper>
        implements OrderBookService {

    public OrderBookServiceImpl(OrderBookReposinory rep, OrderBookMapper mapper, ChannelService channelService) {
        super(rep, mapper);
        this.channelService = channelService;
    }

    private final ChannelService channelService;
    @Override
    public BigDecimal getTotalPrice(Long channelId, String text) {
        BigDecimal y = channelService.findById(channelId).getPrice();

        int count = 0;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) != ' ') {
                count++;
            }
        }

        BigDecimal totalPrice = y.multiply(BigDecimal.valueOf(count));

        return totalPrice;

    }
}
