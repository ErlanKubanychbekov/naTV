package com.example.naTV.service.impl;

import com.example.naTV.base.BaseServiceImpl;
import com.example.naTV.dao.DiscountChannelRepository;
import com.example.naTV.mappers.ChannelMapper;
import com.example.naTV.mappers.DiscountMapper;
import com.example.naTV.mappers.Discount_channelMapper;
import com.example.naTV.models.dto.DiscountChannelDto;
import com.example.naTV.models.entity.DiscountChannel;
import com.example.naTV.models.request.CreateDiscountChannelRequest;
import com.example.naTV.service.ChannelService;
import com.example.naTV.service.DiscountChannelService;
import com.example.naTV.service.DiscountService;
import org.springframework.stereotype.Service;

@Service

public class DiscountChannelServiceImpl extends BaseServiceImpl<DiscountChannel,
        DiscountChannelRepository,
        DiscountChannelDto,
        Discount_channelMapper> implements DiscountChannelService {


    public DiscountChannelServiceImpl(DiscountChannelRepository rep, Discount_channelMapper mapper, DiscountService discountService, ChannelService channelService, DiscountMapper discountMapper, ChannelMapper channelMapper) {
        super(rep, mapper);
        this.discountService = discountService;
        this.channelService = channelService;
        this.discountMapper = discountMapper;
        this.channelMapper = channelMapper;
    }
    private final DiscountService discountService;
    private final ChannelService channelService;
    private  final DiscountMapper discountMapper;
    private final ChannelMapper channelMapper;


    @Override
    public DiscountChannelDto create(CreateDiscountChannelRequest request) {
        DiscountChannel discountChannel = DiscountChannel.builder()
                .discount(discountMapper.toEntity(discountService.findById(request.getDiscount()),context))
                .channel(channelMapper.toEntity(channelService.findById(request.getChannel()),context))

                .build();

        return save(mapper.toDto(discountChannel, context));

    }
}
