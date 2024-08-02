package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class SetterBasedDiApplication {

	public static void main(String[] args) {
		SpringApplication.run(SetterBasedDiApplication.class, args);
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.refresh();
		context.scan("com.example.demo");
		
		Car car = context.getBean("carBean",Car.class);
		car.drive();
		context.close();
	}

}
