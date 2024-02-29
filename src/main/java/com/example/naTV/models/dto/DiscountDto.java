package com.example.naTV.models.dto;

import com.example.naTV.base.BaseDto;
import lombok.*;

import java.time.LocalDate;

@AllArgsConstructor
@Getter
@Setter
@NoArgsConstructor
@ToString
public class DiscountDto extends BaseDto {
    double percent;
    int days;
    String definition;
    LocalDate start_date;
    LocalDate end_date;

}
