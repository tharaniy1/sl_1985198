package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Component
@Getter
@Setter
public class Car {
	
	private String brandName;
	private Engine engine;
	
	@Autowired
	public Car(String brandName, Engine engine) {
		this.brandName = brandName;
		this.engine = engine;
	}

	public void drive() {
		engine.start();
		System.out.println("Car is driving");
	}
}
