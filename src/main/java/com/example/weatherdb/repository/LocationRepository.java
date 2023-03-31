package com.example.weatherdb.repository;

import com.example.weatherdb.entity.LocationEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LocationRepository extends JpaRepository<LocationEntity, Long> {

    public LocationEntity findByName(String name);
}
