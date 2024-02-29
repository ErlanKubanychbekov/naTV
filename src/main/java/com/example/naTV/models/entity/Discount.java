package com.example.naTV.models.entity;

import com.example.naTV.base.BaseEntity;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.time.LocalDate;

@Entity
@Table(name = "tb_discount")
@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
@ToString
@AllArgsConstructor
@RequiredArgsConstructor
@Builder
public class Discount extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    Long id;
    double percent;
    Integer days;
    String definition;
    LocalDate start_date;
    LocalDate end_date;


}
