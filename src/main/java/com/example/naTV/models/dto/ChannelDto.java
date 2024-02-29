package com.example.naTV.models.dto;

import com.example.naTV.base.BaseDto;
import com.example.naTV.models.enums.Status;
import lombok.*;

import java.math.BigDecimal;

@AllArgsConstructor
@Getter
@Setter
@NoArgsConstructor
@ToString
public class ChannelDto  extends BaseDto {

    String name;
    BigDecimal price;
    double rating;
     Status status;
}
