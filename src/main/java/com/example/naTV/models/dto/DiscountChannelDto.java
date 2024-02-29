package com.example.naTV.models.dto;

import com.example.naTV.base.BaseDto;
import lombok.*;

@AllArgsConstructor
@Setter
@Getter
@NoArgsConstructor
@ToString
public class DiscountChannelDto extends BaseDto {
    DiscountDto discount;

    ChannelDto channel;
}
