package com.example.naTV.service.impl;

import com.example.naTV.dao.ChannelRepository;
import com.example.naTV.models.entity.Channel;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;
@ExtendWith(MockitoExtension.class)
@Transactional
@SpringBootTest(classes = SpringBootApplication.class)
class ChannelRepTest {


    @Autowired
    private ChannelRepository rep;

    @Test
    void saveChannel(){
        Channel channel=new Channel();
        channel.setId(1L);
        channel.setPrice(new BigDecimal(111));

        channel.setName("testName");
        channel.setRating(1);
        Channel result= rep.save(channel);

        assertEquals(channel.getName(),result.getName());
    }

}