package com.example.carapplication.Service;

import com.example.carapplication.Dto.CarRequestDto;
import com.example.carapplication.Dto.CarResponseDto;

import java.util.List;

public interface CarServiceImpl {
    public void createCar(CarRequestDto carRequestDto);

    CarResponseDto getCarById(Long id);
    List<CarResponseDto> findAll();
    public void update(Long id, CarRequestDto carRequestDto);

    public void delete(Long id);
}