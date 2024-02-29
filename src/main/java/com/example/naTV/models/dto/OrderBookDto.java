package com.example.naTV.models.dto;

import com.example.naTV.base.BaseDto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.math.BigDecimal;
import java.time.LocalDate;

@AllArgsConstructor
@Data
@NoArgsConstructor
@ToString
public class OrderBookDto extends BaseDto {
    LocalDate book_date;

    OrderDto order;

    ChannelDto channel;
    BigDecimal price;
}
