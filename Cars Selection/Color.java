package com.cars.assignment.CarsComp;

import org.springframework.stereotype.Component;

@Component
public class Color {

	String color;
	
	public void setColor(String color) {
		System.out.print("Yess");
		this.color = color;
	}
	
	public String getColor() {
		return color;
	}

}