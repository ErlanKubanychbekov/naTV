package com.example.naTV.controller;

import com.example.naTV.service.OrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;

@RestController
@RequestMapping("/api/v1/Order")
@RequiredArgsConstructor

public class OrderController {
    private final OrderService service;


    @GetMapping("/getTotalPrice")
    public BigDecimal getTotalPrice(@RequestParam Long channelId, @RequestParam String text){
        return service.getTotalPrice(channelId,text);
    }
}
