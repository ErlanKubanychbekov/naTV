package com.example.naTV.controller;

import com.example.naTV.models.request.CreateDiscountChannelRequest;
import com.example.naTV.service.DiscountChannelService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/discountChannel")
@RequiredArgsConstructor
public class DiscountChannelController {

    private final DiscountChannelService service;

    @PostMapping
    public ResponseEntity<?> save(CreateDiscountChannelRequest request){
        return  ResponseEntity.ok(service.create(request));
    }
}
