package com.example.weatherdb.service;

import com.example.weatherdb.dto.ResponseDto;
import com.example.weatherdb.entity.CurrentEntity;
import com.example.weatherdb.entity.LocationEntity;
import com.example.weatherdb.mapper.WeatherMapperImpl;
import com.example.weatherdb.repository.CurrentRepository;
import com.example.weatherdb.repository.LocationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DBService {
    @Autowired
    private CurrentRepository currentRepository;

    @Autowired
    private LocationRepository locationRepository;

    @Autowired
    private WeatherMapperImpl weatherMapper;

    public void saveLocation(ResponseDto responseDto) {
        LocationEntity locationEntity = weatherMapper.LocDtoToEntity(responseDto);
        LocationEntity byName = locationRepository.findByName(locationEntity.getName());
        if (byName == null) {
            locationRepository.save(locationEntity);
            CurrentEntity currentEntity = weatherMapper.CurrDtoToEntity(responseDto, locationEntity);
            currentRepository.save(currentEntity);
        } else {
            CurrentEntity currentEntity = weatherMapper.CurrDtoToEntity(responseDto, byName);
            currentRepository.save(currentEntity);
        }

    }
}
