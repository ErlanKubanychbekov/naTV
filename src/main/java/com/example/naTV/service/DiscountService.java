package com.example.naTV.service;

import com.example.naTV.base.BaseService;
import com.example.naTV.models.dto.DiscountDto;
import com.example.naTV.models.request.DiscountCreateRequest;

public interface DiscountService extends BaseService<DiscountDto> {

    DiscountDto create(DiscountCreateRequest request);
}
