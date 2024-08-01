package com.example.demo;

import org.springframework.stereotype.Component;

import lombok.Data;

@Component
@Data
public class Movie {
	
	private String movieId;
	private String movieName;
	private String movieActor;

}
