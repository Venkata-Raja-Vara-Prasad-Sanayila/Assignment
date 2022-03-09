package com.cars.assignment.CarsComp;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;



@Configuration
@ComponentScan(basePackages = { "com.cars.assignment.CarsComp" })
public class AppConfig {
	@Bean()
	public Tata getTata() {
		return new Tata();
	}
	
	@Bean()
	public Hyundai getHyundai() {
		return new Hyundai();
	}
	
	@Bean()
	public Honda getHonda() {
		return new Honda();
	}
	@Bean()
	public Color getColor() {
		return new Color();
	}
	@Bean()
	public Tyre getTyre() {
		return new Tyre();
	}
	@Bean()
	public Seat getSeat() {
		return new Seat();
	}
}
