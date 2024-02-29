package com.example.naTV.models.request;

import lombok.Data;

import java.time.LocalDate;

@Data
public class DiscountCreateRequest {
    double percent;
    Integer days;
    String definition;
    LocalDate startDate;
    LocalDate endDate;
}
