package com.example.carapplication.Controller;

import com.example.carapplication.Dto.CarRequestDto;
import com.example.carapplication.Dto.CarResponseDto;
import com.example.carapplication.Service.CarServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v1/api/car")
@RequiredArgsConstructor
public class CarController {

    private final CarServiceImpl carServiceImpl;

    @GetMapping
    public List<CarResponseDto> findAll() {
        return carServiceImpl.findAll();
    }


    @PostMapping() //bu hisseni tuta bilmedim, sual verersen
    public void create(@RequestBody CarRequestDto carRequestDto) {
        carServiceImpl.createCar(carRequestDto);
    }

    @GetMapping("/{id}") // bu hissenide tam tutmadim
    public CarResponseDto getCarByID(@PathVariable Long id) {
        return carServiceImpl.getCarById(id);
    }

    @PutMapping("/{id}")
    public void update(@PathVariable Long id, @RequestBody CarRequestDto carRequestDto) {
        carServiceImpl.update(id, carRequestDto);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        carServiceImpl.delete(id);
    }


}