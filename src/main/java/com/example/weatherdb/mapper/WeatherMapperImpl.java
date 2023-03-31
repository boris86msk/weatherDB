package com.example.weatherdb.mapper;

import com.example.weatherdb.dto.CurrentDto;
import com.example.weatherdb.dto.LocationDto;
import com.example.weatherdb.dto.ResponseDto;
import com.example.weatherdb.entity.CurrentEntity;
import com.example.weatherdb.entity.LocationEntity;
import org.springframework.stereotype.Service;

import java.time.LocalDate;


@Service
public class WeatherMapperImpl implements WeatherMapper {

    @Override
    public LocationEntity LocDtoToEntity(ResponseDto responseDto) {
        LocationEntity locEn = new LocationEntity();
        LocationDto location = responseDto.getLocation();
        locEn.setName(location.getName());
        locEn.setRegion(location.getRegion());
        locEn.setCountry(location.getCountry());
        locEn.setLat(location.getLat());
        locEn.setLon(location.getLon());
        return locEn;
    }

    @Override
    public CurrentEntity CurrDtoToEntity(ResponseDto responseDto, LocationEntity le) {
        CurrentEntity curEn = new CurrentEntity();
        CurrentDto current = responseDto.getCurrent();
        LocalDate date = LocalDate.parse(responseDto.getLocation().getLocaltime().substring(0, 10));
        curEn.setLocalData(date);
        curEn.setTemp_c(Double.parseDouble(current.getTemp_c()));
        curEn.setWind_ms(Double.parseDouble(current.getWind_kph()) / 3.6);
        curEn.setGust_ms(Double.parseDouble(current.getGust_kph()) / 3.6);
        curEn.setWind_dir(current.getWind_dir());
        curEn.setPressure_mb(Double.parseDouble(current.getPressure_mb()));
        curEn.setHumidity(Integer.parseInt(current.getHumidity()));
        curEn.setCloud(Integer.parseInt(current.getCloud()));
        curEn.setUv(Double.parseDouble(current.getUv()));
        curEn.setLocationEntity(le);
        return curEn;
    }

}
