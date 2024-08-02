package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("carBean")
public class Car {
	
	
	private Engine engine;
    
	@Autowired
	public void setEngine(Engine engine) {
		this.engine = engine;
	}
	
	public void drive() {
		engine.start();
		System.out.println("Car is driven");
	}
	

}
