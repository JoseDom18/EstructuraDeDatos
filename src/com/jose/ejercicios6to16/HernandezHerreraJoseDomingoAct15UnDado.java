package com.jose.ejercicios6to16;

import java.util.Random;

public class HernandezHerreraJoseDomingoAct15UnDado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random alt = new Random();
		int cont5 = 0;
		int cont6 = 0;

		for (int i = 0; i < 20; i++) {
			int dado = alt.nextInt(6) + 1;
			System.out.printf("Tiro de dado num. %d: %d%n", i+1, dado);
			if(dado == 5) {
				cont5++;
			} else if(dado == 6) {
				cont6++;
			}
		}
		System.out.printf("El 5 salio %d veces.%n", cont5);
		System.out.printf("El 6 salio %d veces.%n", cont6);

		if (cont5 > cont6) {
			System.out.println("Salio más veces el número 5");
		} else if (cont6 > cont5) {
			System.out.println("Salio más veces el número 6");
		} else {
			System.out.println("El 6 y el 5 salieron el mismo numero de veces.");
		}


	}

}
