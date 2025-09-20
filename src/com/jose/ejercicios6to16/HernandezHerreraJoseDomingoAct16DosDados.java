package com.jose.ejercicios6to16;

import java.util.Random;

public class HernandezHerreraJoseDomingoAct16DosDados {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random alt = new Random();
		int contIgual = 0;
		int contDif = 0;

		for (int i = 0; i < 20; i++) {
			int dado1 = alt.nextInt(6) + 1;
			int dado2 = alt.nextInt(6) + 1;
			System.out.printf("Tiro de dado num. %d: %d%n", i+1, dado1);
			System.out.printf("Tiro de dado num. %d: %d%n", i+1, dado2);
			System.out.println("");
			
			if(dado1 == dado2) contIgual++;
				else contDif++;
		}
		System.out.printf("Los dados salieron iguales %d de veces.%n", contIgual);
		System.out.printf("Los daos salieron diferentes %d de veces %n", contDif);

		if (contIgual > contDif) {
			System.out.println("Los dados salieron iguales más veces.");
		} else if (contDif > contIgual) {
			System.out.println("Los dados salieron diferentes más veces.");
		} else {
			System.out.println("Los dados cayeron las misma cantidad de veces diferentes que iguales.");
		}

	}

}
