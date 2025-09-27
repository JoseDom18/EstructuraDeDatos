package com.jose.ejercicios17to23;

import java.util.Random;

public class HernandezHerreraJoseDomingoAct19Tombola {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Random alt = new Random();
		int sacar = 8;
		int menor5 = 0;
		int mayorIgual5 = 0;
		
		for (int i = 0; i < sacar; i++) {
			int pelota = alt.nextInt(10)+1;

			System.out.printf("%d.- Pelota: %d%n", i + 1, pelota);

			if (pelota < 5) {
				menor5++;
			} else {
				mayorIgual5++;
			}
			
		}

		System.out.printf("Saliron %d pelotas menores a 5.%n", menor5);
		System.out.printf("Saliron %d pelotas mayores o iguales a 5.%n", mayorIgual5);
		
		if (menor5 > mayorIgual5) {
			System.out.println("Salieron más pelotas menores a 5.");
		} else if (mayorIgual5 > menor5){

			System.out.println("Salieron más pelotas mayores o iguales a 5.");

		 } else {
			 System.out.println("Salieron el mimos número de veces pelotas menores y mayores que 5.");
		 }

	}

}
