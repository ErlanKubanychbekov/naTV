package com.example.naTV.base;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

@NoRepositoryBean
public interface BaseRep <E extends BaseEntity> extends JpaRepository<E,Long> {

}
