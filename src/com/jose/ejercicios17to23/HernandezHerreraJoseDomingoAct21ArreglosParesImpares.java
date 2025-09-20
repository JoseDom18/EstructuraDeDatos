package com.jose.ejercicios17to23;

import java.util.Random;

public class HernandezHerreraJoseDomingoAct21ArreglosParesImpares {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] numeros = new int[30];
		
		Random alt = new Random();
		
		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = alt.nextInt(51) + 50;
			System.out.printf("Numeros %d : %d.%n", i + 1, numeros[i]);
		}

		System.out.println("---------------------------------");
		System.out.println("Números pares:");
		int sumaPares = 0;
		
		for (int i = 0; i < numeros.length; i++) {
			if (numeros[i] % 2 == 0) {
				sumaPares += numeros[i];
				System.out.printf("Numeros %d : %d.%n", i + 1, numeros[i]);
			}
		}


		System.out.println("---------------------------------");
		System.out.println("Números impares:");
		int sumaImpares = 0;
		
		for (int i = 0; i < numeros.length; i++) {
			if (numeros[i] % 2 != 0) {
				sumaImpares += numeros[i];
				System.out.printf("Numeros %d : %d.%n", i + 1, numeros[i]);
			}
		}

		System.out.printf("Suma de Pares: %d%n", sumaPares);
		System.out.printf("Suma de impares: %d%n", sumaImpares);

	}

}
