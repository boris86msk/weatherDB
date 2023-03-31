package com.example.weatherdb.repository;

import com.example.weatherdb.entity.CurrentEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CurrentRepository extends JpaRepository<CurrentEntity, Long> {
}
