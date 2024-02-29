package com.example.naTV.models.request;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class ChannelCreateRequest {
    String name;
    BigDecimal price;
    double rating;
}
