package com.psl.training;

import com.psl.training.model.Engine;

public class Vehicle {
	public String name;
	public String color;
	
	public Engine engine ;
	
	public Engine electricEngine ;

	public void setName(String name) {
		this.name = name;
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
}
