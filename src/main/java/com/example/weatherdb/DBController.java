package com.example.weatherdb;

import com.example.weatherdb.dto.ResponseDto;
import com.example.weatherdb.service.DBService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DBController {

    @Autowired
    private DBService dbService;

    @PostMapping("/")
    public String save(@RequestBody ResponseDto responseDto) {
        dbService.saveLocation(responseDto);
        return "save OK";
    }
}
