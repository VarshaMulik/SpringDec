package com.psl.training.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.psl.training.Vehicle;

public class Main {

	public static void main(String[] args) {
	
		
		ApplicationContext context =new ClassPathXmlApplicationContext("beanConfig.xml");
		//ApplicationContext context =new ClassPathXmlApplicationContext("mybeansConfig.xml");
		
	  // Vehicle vehicle= (Vehicle) context.getBean("v1");
		 Vehicle vehicle= context.getBean("v1",Vehicle.class);
	  // Vehicle vehicle= context.getBean(Vehicle.class);
	   System.out.println("name "+vehicle.getName());
	   System.out.println("color "+vehicle.getColor());
	   

	}

}
