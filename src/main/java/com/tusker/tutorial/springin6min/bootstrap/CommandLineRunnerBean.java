package com.tusker.tutorial.springin6min.bootstrap;

import com.tusker.tutorial.springin6min.model.Car;
import com.tusker.tutorial.springin6min.repository.CarRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.stream.Stream;

@Component("commandLineRunner")
@Order(1)
public class CommandLineRunnerBean implements CommandLineRunner {
    private CarRepository carRepository;

    public CommandLineRunnerBean( CarRepository carRepository ) {
        this.carRepository = carRepository;
    }

    @Override
    public void run( String... args ) throws Exception {
        Stream.of( "Focus", "Fiesta", "Mustang", "GT" )
                .forEach( name -> carRepository.save( new Car( name ) )  );

        carRepository.findAll().forEach( System.out :: println );
    }
}
