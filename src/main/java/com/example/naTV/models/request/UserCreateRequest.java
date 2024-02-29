package com.example.naTV.models.request;

import lombok.Data;

@Data
public class UserCreateRequest {
    String fio;
    String email;
    String phone_num;
}
