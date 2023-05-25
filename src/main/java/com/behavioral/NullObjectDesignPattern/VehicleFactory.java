package com.behavioral.NullObjectDesignPattern;

public class VehicleFactory {
	public static Vehicle createVehicle(String type) {
		if(type.equals("car")) {
			return new Car();
		}
		
		return new NullVehicle();
	}
}
