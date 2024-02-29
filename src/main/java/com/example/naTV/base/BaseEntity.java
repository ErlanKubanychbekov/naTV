package com.example.naTV.base;


import jakarta.persistence.MappedSuperclass;
import jakarta.persistence.PrePersist;
import jakarta.persistence.PreUpdate;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@MappedSuperclass
public abstract class BaseEntity {

    protected LocalDate addDate;
    protected LocalDate updateDate;





    @PrePersist
    protected void onreate(){
        addDate= LocalDate.now();
        updateDate = LocalDate.now();
    }
    @PreUpdate
    protected void onupdate(){
        updateDate = LocalDate.now();
    }
}
