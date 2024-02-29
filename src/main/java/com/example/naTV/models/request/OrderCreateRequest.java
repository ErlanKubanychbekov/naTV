package com.example.naTV.models.request;

import com.example.naTV.models.enums.Status;
import lombok.Data;

import java.math.BigDecimal;

@Data
public class OrderCreateRequest {
    String text;
    BigDecimal total_price;
    Status status;

    UserCreateRequest user;
}
