package com.behavioral.NullObjectDesignPattern;

public class NullVehicle implements Vehicle{

	@Override
	public int getSeatCapacity() {
		return 0;
	}

	@Override
	public int getFuelCapactiy() {
		return 0;
	}
	
}
