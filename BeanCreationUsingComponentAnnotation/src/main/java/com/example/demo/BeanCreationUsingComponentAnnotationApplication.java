package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class BeanCreationUsingComponentAnnotationApplication {

	public static void main(String[] args) {
		SpringApplication.run(BeanCreationUsingComponentAnnotationApplication.class, args);
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.scan("com.example.demo");
		context.refresh();
		
		Movie tomCruise = context.getBean(Movie.class);
		System.out.println(tomCruise);
		context.close();
	}

}
