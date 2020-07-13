package com.enviex.paqueteria.example;

import java.util.*;
public class list {
	
	public static void main (String[]args) {
 //new words "string" for list 
	String [] lista = {"que","pedro", "pinche", "pablo", "saca", "unas", "caguamas"};
	
	
	//order the word for alphabetic list
	
	List<String> listaCadenas=Arrays.asList(lista);
			Set<String> conju= new HashSet<String>(listaCadenas);
		listaCadenas.remove(listaCadenas);
	 
	
	for (String cadena : conju) {
		
		System.out.println (cadena );
	}

	
	
	 }	
}
