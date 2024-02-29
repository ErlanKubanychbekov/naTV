package com.example.naTV.models.entity;

import com.example.naTV.base.BaseEntity;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

@Entity
@Table(name = "tb_discount_channel")
@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
@ToString
@AllArgsConstructor
@RequiredArgsConstructor
@Builder
public class DiscountChannel extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    Long id;
    @ManyToOne
    Discount discount;
    @ManyToOne
    Channel channel;

    @Override
    protected void onreate() {
        super.onreate();
    }
}
