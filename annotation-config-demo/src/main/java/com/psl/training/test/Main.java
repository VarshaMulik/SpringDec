package com.psl.training.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.psl.training.config.BeanConfig;
import com.psl.training.model.Vehicle;

public class Main {

	public static void main(String[] args) {
	
		
		//ApplicationContext context =new ClassPathXmlApplicationContext("beanConfig.xml");
		//ApplicationContext context =new ClassPathXmlApplicationContext("mybeansConfig.xml");
		ApplicationContext context= new AnnotationConfigApplicationContext(BeanConfig.class);
	  // Vehicle vehicle= (Vehicle) context.getBean("v1");
	 Vehicle vehicle= context.getBean(Vehicle.class);
	 // Vehicle vehicle= context.getBean(Vehicle.class);
	   System.out.println("name : "+vehicle.getName());
	   System.out.println("color : "+vehicle.getColor());
	   System.out.println("Engine Capacity :"+vehicle.getEngine().getCapacity());
	   System.out.println("Elect Engine Capacity :"+vehicle.getElectricEngine().getCapacity());
	   System.out.println("AccessoryName :"+vehicle.getAccessries().getName());

	}

}
