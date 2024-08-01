package com.example.demo;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
@Component("engineBean")
public class Engine {
	
	private String power;
	private Integer combustionEngines;
	


	public void start() {
		System.out.println("Engine is started");
	}

}
