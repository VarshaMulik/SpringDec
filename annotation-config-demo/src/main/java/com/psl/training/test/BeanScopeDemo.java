package com.psl.training.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.psl.training.config.BeanConfig;
import com.psl.training.model.Vehicle;

public class BeanScopeDemo {
	public static void main(String[] args) {
		
		ApplicationContext context= new AnnotationConfigApplicationContext(BeanConfig.class);
		
		Vehicle v1=context.getBean(Vehicle.class);
		
		Vehicle v2=context.getBean(Vehicle.class);
		

		System.out.println(v1.getName());
		System.out.println("V1 Vehicle Color :"+v1.getColor());  //Red
		System.out.println("V2 Vehicle Color :"+v2.getColor()); //Blue
		System.out.println(v1.getAccessries().getName());
		System.out.println(v1);
		System.out.println(v2);
	}
}
