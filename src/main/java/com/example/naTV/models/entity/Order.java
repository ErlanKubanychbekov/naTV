package com.example.naTV.models.entity;

import com.example.naTV.base.BaseEntity;
import com.example.naTV.models.enums.Status;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.math.BigDecimal;

@Entity
@Table(name = "tb_order")
@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
@ToString
@AllArgsConstructor
@RequiredArgsConstructor
@Builder
public class Order extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    Long id;

    String text;
    BigDecimal total_price;
    @ManyToOne
    User user;
    @Enumerated(EnumType.STRING)
    Status status;
    @Override
    protected void onreate() {
        super.onreate();
        status = Status.ACTIVE;
    }




}
