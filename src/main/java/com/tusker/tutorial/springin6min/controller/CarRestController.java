package com.tusker.tutorial.springin6min.controller;

import com.tusker.tutorial.springin6min.model.Car;
import com.tusker.tutorial.springin6min.repository.CarRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController
class CarRestController {
	private CarRepository carRepository;

	public CarRestController( CarRepository carRepository ) {
		this.carRepository = carRepository;
	}

	@GetMapping("/api/cars")
    Collection<Car> getAllCars() throws Exception{
		return carRepository.findAll();
	}
}
