package com.psl.training.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Vehicle {
	public String name;
	public String color;
	public int noOfWheels;
	
	@Autowired(required = false)
//	@Qualifier(value = "eng")
	public Engine engine ;
		
	@Autowired(required = false)
	public Engine electricEngine ;
	
	@Autowired
	Accessory accessries;
	
	
	public Vehicle(String name, String color) {
		this.name=name;
		this.color=color;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setNoOfWheels(int noOfWheels) {
		this.noOfWheels = noOfWheels;
	}
	
	public int getNoOfWheels() {
		return noOfWheels;
	}
	public String getName() {
		return name;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getColor() {
		return color;
	}

	public void setEngine(Engine engine) {
		this.engine = engine;
	}
	public Engine getEngine() {
		return engine;
	}
	
	public void setElectricEngine(Engine electricEngine) {
		this.electricEngine = electricEngine;
	}
	
	public Engine getElectricEngine() {
		return electricEngine;
	}
	public Accessory getAccessries() {
		return accessries;
	}
	public void setAccessries(Accessory accessries) {
		this.accessries = accessries;
	}
}
