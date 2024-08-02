package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.Setter;

@Getter
@Component("carBean")
public class Car {
	
	private String brandName;
	@Autowired
	private Engine engine;
	
	public void drive() {
		engine.start();
		System.out.println("Car is driven");
	}
}
