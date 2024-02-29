package com.example.naTV.controller;

import com.example.naTV.models.request.DiscountCreateRequest;
import com.example.naTV.service.DiscountService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/discount")
@RequiredArgsConstructor
public class DiscountController {
    private final DiscountService service;

    @PostMapping
    public ResponseEntity<?> save(DiscountCreateRequest request){
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
}
