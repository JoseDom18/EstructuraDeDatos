package com.jose.ejercicios17to23;

import java.util.Random;

public class HernandezHerreraJoseDomingoAct18Pirinola {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Random alt = new Random();
		int num4 = 0;
		int num5 = 0;
		
		int numLanzamiento = 20;
		
		for (int i = 0; i < numLanzamiento; i++) {
			int pirinola = alt.nextInt(5)+1;
			System.out.printf("Lanz. %d: %d%n",i + 1, pirinola);
			switch (pirinola) {
			case 4:
				num4++;
				break;
			case 5:
				num5++;
				break;
			}
		}
		
		System.out.printf("num 4: %d%nnum 5: %d%n",num4, num5);
		
		if (num4 > num5) {
			System.out.println("El 4 salio más veces");
		} else if (num5 > num4) {
			System.out.println("El 5 salio más veces");
		} else {
			System.out.println("Ambos numero salieron el mismo número de veces.");
		}

	}

}
