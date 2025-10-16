package com.jose.listas;

import java.util.ArrayList;

public class Listas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> nombres = new ArrayList<String>();
		
		// agregar nombres
		nombres.add("Elemento 1");
		nombres.add("Elemento 2");
		nombres.add("Elemento 3");
		
		// tamaño de lista
		System.out.printf("Tamaño de la lista: %d%n", nombres.size());
		
		// obtener valor
		System.out.printf("Indice 2: %s%n", nombres.get(1));
		
		// recorrer
		for(String n : nombres) {
			System.out.printf("%s %n", n);
		}

		System.out.println("");
		System.out.println("---------------------------");

		// agregar por indice
		nombres.add(1, "Elemento 4");

		// recorrer
		for(String n : nombres) {
			System.out.printf("%s %n", n);
		}
		
		//remove(obtiene y elimina) clear(dos formas) isEmpty 

	}

}
