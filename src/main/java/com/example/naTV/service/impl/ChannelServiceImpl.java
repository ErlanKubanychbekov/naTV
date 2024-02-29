package com.example.naTV.service.impl;

import com.example.naTV.base.BaseServiceImpl;
import com.example.naTV.dao.ChannelRepository;
import com.example.naTV.mappers.ChannelMapper;
import com.example.naTV.models.dto.ChannelDto;
import com.example.naTV.models.entity.Channel;
import com.example.naTV.models.enums.Status;
import com.example.naTV.models.request.ChannelCreateRequest;
import com.example.naTV.service.ChannelService;
import org.springframework.stereotype.Service;

@Service

public class ChannelServiceImpl extends BaseServiceImpl<Channel, ChannelRepository, ChannelDto, ChannelMapper>
        implements ChannelService {


    public ChannelServiceImpl(ChannelRepository rep, ChannelMapper mapper) {
        super(rep, mapper);
    }


    public ChannelDto create(ChannelCreateRequest request) {
        Channel channel = Channel.builder()

                .name(request.getName())
                .price(request.getPrice())
                .rating(request.getRating())
                .build();
        return save(mapper.toDto(channel,context));
    }

    @Override
    public boolean delete(ChannelDto e) {
        e.setStatus(Status.DELETED);
        return super.delete(e);

    }

    @Override
    public ChannelDto update(ChannelDto e) {
        ChannelDto dto = findById(e.getId());
        dto.setStatus(e.getStatus());
        dto.setRating(e.getRating());
        dto.setName(e.getName());
        dto.setPrice(e.getPrice());


        return super.update(dto);

    }
}
