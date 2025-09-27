package com.jose.ejercicios17to23;

import java.util.Random;

public class HernandezHerreraJoseDomingoAct20Jabalina {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random alt = new Random();
		int lanzar = 20;
		int menor75 = 0;
		int mayorIgual75 = 0;
		
		for (int i = 0; i < lanzar; i++) {
			int mts = alt.nextInt(39)+50;

			System.out.printf("%d.- Lanzamiento: %d mts%n", i + 1, mts);

			if (mts < 75) {
				menor75++;
			} else {
				mayorIgual75++;
			}
			
		}

		System.out.printf("Num de lanzamientos de menos de 75 mts: %d%n", menor75);
		System.out.printf("Num de lanzamientos de 75 mts o más: %d%n", mayorIgual75);
		
		if (menor75 > mayorIgual75) {
			System.out.println("Hubieron más lanzamientos de menos de 75 mts.");
		} else if (mayorIgual75 > menor75){

			System.out.println("Hubieron más lanzamientos de 75 mts o más.");

		 } else {
			 System.out.println("Hubieron el mismo numero de lanzamientos de más o menos de 75 mts.");
		 }

	}

}
