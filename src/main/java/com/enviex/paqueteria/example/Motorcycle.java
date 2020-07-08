package com.enviex.paqueteria.example;

public class Motorcycle implements Automovil {

	String name;
	
	public Motorcycle(String name) {
		this.name = name;
	}
	
	@Override
	public String getName() {
		return name + " hermosa moto";
	}

	@Override
	public int getTires() {
		// TODO Auto-generated method stub
		return 2;
	}

}
