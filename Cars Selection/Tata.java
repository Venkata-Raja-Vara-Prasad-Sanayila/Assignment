package com.cars.assignment.CarsComp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


@Component
public class Tata implements Cars{

	@Autowired()
	private Color color;

	@Autowired()
	private Tyre tyre;

	@Autowired()
	private Seat seat;

	@Value("Tata")
	String name;

	public void feature() {
		System.out.println("Car: " + this.name + "\nColor: " + color.getColor() + "\nTyre: " + tyre.getTyre()
				+ "\nSeat: " + seat.getSeat());
	}

       
}
