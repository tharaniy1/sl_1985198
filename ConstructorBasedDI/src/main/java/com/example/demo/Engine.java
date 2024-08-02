package com.example.demo;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Engine {
	
	private String power;
	private Integer brakes;
	
	
	public Engine(String power, Integer brakes) {
		this.power = power;
		this.brakes = brakes;
	}


	public void start() {
		System.out.println("Power of engine is "+power+" and no of brakes present is "+brakes);
	}

}
