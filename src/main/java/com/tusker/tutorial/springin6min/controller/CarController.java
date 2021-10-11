package com.tusker.tutorial.springin6min.controller;

import com.tusker.tutorial.springin6min.model.Car;
import com.tusker.tutorial.springin6min.repository.CarRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Collection;

/**
 * spring-in-6-min
 * <p>
 * Created by User on 16-Sep-19
 */

@Controller
public class CarController {

    private final CarRepository carRepository;

    public CarController(CarRepository carRepository) {
        this.carRepository = carRepository;
    }

    @GetMapping("/cars")
    public String carList(Model model){
        model.addAttribute("cars", carRepository.findAll() );
        return "cars";
    }
}
