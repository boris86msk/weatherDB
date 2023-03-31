package com.example.weatherdb.mapper;

import com.example.weatherdb.dto.ResponseDto;
import com.example.weatherdb.entity.CurrentEntity;
import com.example.weatherdb.entity.LocationEntity;

public interface WeatherMapper {
    public LocationEntity LocDtoToEntity(ResponseDto responseDto);

    public CurrentEntity CurrDtoToEntity(ResponseDto responseDto, LocationEntity le);
}
