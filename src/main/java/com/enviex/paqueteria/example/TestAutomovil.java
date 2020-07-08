package com.enviex.paqueteria.example;
import com.enviex.paqueteria.example.Automovil;
import com.enviex.paqueteria.example.Car;
import com.enviex.paqueteria.example.Motorcycle;

public class TestAutomovil {

	public static void main(String[] args) {
		Automovil auto = new Car("bocho");
		
		System.out.println(auto.getName());
		System.out.println(auto.getTires());
		
		auto = new Motorcycle("harley davidson");
		
		System.out.println(auto.getName());
		System.out.println(auto.getTires());
	}
	
}
