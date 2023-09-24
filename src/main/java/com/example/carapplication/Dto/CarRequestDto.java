package com.example.carapplication.Dto;

import lombok.Data;

import java.time.LocalDate;

@Data
public class CarRequestDto {
    private long id;
    private String model;
    private String maker;
    private String engine;
    private String carColor;
    private LocalDate year;
}