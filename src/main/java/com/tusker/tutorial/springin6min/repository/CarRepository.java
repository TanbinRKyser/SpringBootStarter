package com.tusker.tutorial.springin6min.repository;

import com.tusker.tutorial.springin6min.model.Car;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarRepository extends JpaRepository<Car, Long> {
}
