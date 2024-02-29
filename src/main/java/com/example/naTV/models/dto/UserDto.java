package com.example.naTV.models.dto;

import com.example.naTV.base.BaseDto;
import com.example.naTV.models.enums.Status;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@Data
@NoArgsConstructor
@ToString
public class UserDto extends BaseDto {
    String fio;
    String email;
    String phone_num;
     Status status;
}
