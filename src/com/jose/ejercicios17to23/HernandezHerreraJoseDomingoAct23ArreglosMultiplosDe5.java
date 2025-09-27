package com.jose.ejercicios17to23;

import java.util.Random;

public class HernandezHerreraJoseDomingoAct23ArreglosMultiplosDe5 {
	public static void main(String[] args) {

		Random alt = new Random();
		int[] numeros = new int[10];
		int suma = 0;
		int posicion = 0;
		int rechazados = 0;

		while (posicion < 10) {

			int num = alt.nextInt(100) + 1;

			if (num % 5 == 0) {
				numeros[posicion] = num;
				posicion++;
				suma += num;
			} else {
				rechazados++;
			}

		}

		System.out.print("{ ");
		for (int a : numeros) {
			System.out.printf("%d, ", a);
		}
		System.out.printf("}%n");

		System.out.printf("Suma: %d%n", suma);
		System.out.printf("Rechazados: %d%n", rechazados);
	}
}
