package com.tusker.tutorial.springin6min;

import com.tusker.tutorial.springin6min.model.Car;
import com.tusker.tutorial.springin6min.repository.CarRepository;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.stream.Stream;

@SpringBootApplication
public class SpringIn6MinApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringIn6MinApplication.class, args);
	}

	/*@Bean
	ApplicationRunner run( CarRepository carRepository){
		return args ->
				Stream.of( "Prius", "Premio", "Allion", "Corolla" )
				.forEach(
						x -> carRepository.save( new Car(x) )
				);
	}*/
}


