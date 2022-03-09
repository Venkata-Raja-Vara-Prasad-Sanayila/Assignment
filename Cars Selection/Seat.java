package com.cars.assignment.CarsComp;

import org.springframework.stereotype.Component;

@Component
public class Seat {
	
	public String seat;

	public void setSeat(String seat) {
		this.seat = seat;
	}
	
	public String getSeat() {
		return seat;
	}
	
}