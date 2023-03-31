package com.example.weatherdb.dto;

import lombok.Data;

@Data
public class ConditionDto {
    private String text;
    private String icon;
    private String code;
}
