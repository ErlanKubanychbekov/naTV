package com.example.naTV.models.entity;

import com.example.naTV.base.BaseEntity;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Table(name = "tb_order_book")
@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
@ToString
@AllArgsConstructor
@RequiredArgsConstructor
public class OrderBook extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    Long id;
    LocalDate book_date;
    @ManyToOne
    Order order;
    @ManyToOne
    Channel channel;
    BigDecimal price;

}
