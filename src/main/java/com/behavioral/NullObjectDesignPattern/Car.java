package com.behavioral.NullObjectDesignPattern;

public class Car implements Vehicle{

	@Override
	public int getSeatCapacity() {
		return 4;
	}

	@Override
	public int getFuelCapactiy() {
		return 15;
	}

}
