package com.example.naTV.service;

import com.example.naTV.base.BaseService;
import com.example.naTV.models.dto.DiscountChannelDto;
import com.example.naTV.models.request.CreateDiscountChannelRequest;

public interface DiscountChannelService extends BaseService<DiscountChannelDto> {
    DiscountChannelDto create(CreateDiscountChannelRequest request);
}
