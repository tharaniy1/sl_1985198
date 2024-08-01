package com.example.demo;

import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.Setter;

@Component("carBean")
@Getter
@Setter
public class Car {
	
	private String model;
	private String fuelType;
	private String mileage;
	
    public void test() {
    	System.out.println("Car is tested");
    }
}
