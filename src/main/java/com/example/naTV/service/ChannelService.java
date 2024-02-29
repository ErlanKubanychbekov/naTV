package com.example.naTV.service;

import com.example.naTV.base.BaseService;
import com.example.naTV.models.dto.ChannelDto;
import com.example.naTV.models.request.ChannelCreateRequest;

public interface ChannelService extends BaseService<ChannelDto> {
    ChannelDto create(ChannelCreateRequest request);

}
