package com.example.naTV.models.entity;

import com.example.naTV.base.BaseEntity;

import com.example.naTV.models.enums.Status;
import lombok.*;
import lombok.experimental.FieldDefaults;


import jakarta.persistence.*;

import java.math.BigDecimal;

@Entity
@Table(name = "tb_channel")
@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
@ToString
@AllArgsConstructor
@RequiredArgsConstructor
@Builder
public class Channel extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    Long id;
    String name;
    BigDecimal price;
    double rating;
    @Enumerated(EnumType.STRING)
    Status status;

    @Override
    protected void onreate() {
        super.onreate();
        status = Status.ACTIVE;
    }
}
