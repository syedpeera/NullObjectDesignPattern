package com.behavioral.NullObjectDesignPattern;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class NullObjectDesignPatternApplication {

	public static void main(String[] args) {
		SpringApplication.run(NullObjectDesignPatternApplication.class, args);
		Vehicle vehicle1 = VehicleFactory.createVehicle("car");
		System.out.println(vehicle1.getFuelCapactiy());
		System.out.println(vehicle1.getSeatCapacity());
		
		Vehicle vehicle2 = VehicleFactory.createVehicle("");
		System.out.println(vehicle2.getFuelCapactiy());
		System.out.println(vehicle2.getSeatCapacity());
	}
}
