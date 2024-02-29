package com.example.naTV.models.entity;

import com.example.naTV.base.BaseEntity;
import com.example.naTV.models.enums.Status;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

@Entity
@Table(name = "tb_user")
@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
@ToString
@Builder
@AllArgsConstructor
@RequiredArgsConstructor
public class User  extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    Long id;
    String fio;
    String email;
    String phone_num;
    @Enumerated(EnumType.STRING)
    Status status;

    @Override
    protected void onreate() {
        super.onreate();
        status = Status.ACTIVE;
    }
}
