package com.example.naTV.controller;

import com.example.naTV.models.dto.ChannelDto;
import com.example.naTV.models.request.ChannelCreateRequest;
import com.example.naTV.service.ChannelService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/api/v1/channel")
@RestController
@RequiredArgsConstructor
public class ChannelConroller {
    private final ChannelService service;

    @PostMapping
    public ResponseEntity<?> save(ChannelCreateRequest request){
        return ResponseEntity.ok(service.create(request));
    }

    @GetMapping("/getAll")
    public ResponseEntity<?> getAll(){
        return ResponseEntity.ok(service.findAll());
    }

    @GetMapping("/getById")
    public ResponseEntity<?> getById(@RequestParam Long id){
        return ResponseEntity.ok(service.findById(id));
    }
    @DeleteMapping
    public void deleteById(@RequestParam Long id ){
       service.delete(service.findById(id));
    }
    @PostMapping("/update")
    public ResponseEntity<?> update(ChannelDto dto){
        return ResponseEntity.ok(service.update(dto));
    }
}
