package com.jose.ejercicios17to23;

import java.util.Random;

public class HernandezHerreraJoseDomingoAct22ArreglosNoRepetidos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Random alt = new Random();
		int[] numeros = new int[20];
		int suma = 0;
		int posicion = 0;
		boolean existe = false;

		while (posicion < 20) {

			int num = alt.nextInt(31) + 30;
			System.out.printf("Número %d, ", num);

			for (int i = 0; i < posicion + 1; i++) {
				if (num == numeros[i]) {
					existe = true;
					System.out.println("Repetido");
					break;

				}
			}

			if (!existe) {
			numeros[posicion] = num;
			System.out.println("Agregado");
			posicion++;
			suma += num;
			}

			existe = false;
		}

		System.out.print("{ ");
		for(int a: numeros) {
			System.out.printf("%d, ", a);
		}
		System.out.printf("}%n");

		System.out.printf("Suma: %d%n", suma);
	}


}
