package com.example.AOP.Application;

import com.example.AOP.Model.ShapeService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AOPMain {

    public static void main(String[] args) {

        var context = new ClassPathXmlApplicationContext("Spring.xml");
        ShapeService service = context.getBean("shapeService",ShapeService.class);
        System.out.println(service.getCircle().getName());
        System.out.println(service.getTriangle().getName());
    }
}
