package com.enviex.paqueteria.example;

public class Car implements Automovil {
	
	String name;
	
	public Car(String name) {
		this.name = name;
	}
	
	@Override
	public String getName() {
		return name;
	}

	@Override
	public int getTires() {
		// TODO Auto-generated method stub
		return 4;
	}
}
