package com.tusker.tutorial.springin6min.bootstrap;

import com.tusker.tutorial.springin6min.model.Car;
import com.tusker.tutorial.springin6min.repository.CarRepository;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.stream.Stream;

@Component
@Order(2)
public class ApplicationRunnerBean implements ApplicationRunner {

    private CarRepository carRepository;

    public ApplicationRunnerBean( CarRepository carRepository ) {
        this.carRepository = carRepository;
    }

    @Override
    public void run( ApplicationArguments args ) throws Exception {
        Stream.of( "Prius", "Allion", "Premio", "Corolla" )
                .forEach( x -> carRepository.save( new Car( x ) ) );

        carRepository.findAll().forEach( System.out :: println );
    }
}
