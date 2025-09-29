package com.jose.ejercicios24to31;

import java.util.Random;

public class HernandezHerreraJoseDomingoAct26MatricezDiagonales {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random alt = new Random();
		int dim = alt.nextInt(6) + 5;
		int[][] matriz = new int[dim][dim];
		int sumComp = 0;
		int sumPrin = 0;
		int sumInv = 0;
		int sumAmbas = 0;

		// impresion de matriz completa
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[0].length; j++) {
				int cont = alt.nextInt(10);
				matriz[i][j] = cont;
				System.out.printf("[%d]", matriz[i][j]);
				sumComp += matriz[i][j];

			}
			System.out.println("");
		}
		System.out.printf("Suma: %d%n", sumComp);
		System.out.println("");

		System.out.println("##############################################################");
		System.out.println("");

		// impresion de matriz diagonal principal
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[0].length; j++) {
				if (i == j) {
					sumPrin += matriz[i][j];
					System.out.printf("[%d]", matriz[i][j]);
				} else {
					System.out.print("[ ]");
				}

			}
			System.out.println("");
		}

		System.out.printf("Suma: %d%n", sumPrin);
		System.out.println("");

		System.out.println("##############################################################");
		System.out.println("");

		// impresion de matriz diagonal inversa
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[0].length; j++) {
				if (i + j == matriz.length - 1) {
					sumInv += matriz[i][j];
					System.out.printf("[%d]", matriz[i][j]);
				} else {
					System.out.print("[ ]");
				}

			}
			System.out.println("");
		}

		System.out.printf("Suma: %d%n", sumInv);
		System.out.println("");

		System.out.println("##############################################################");
		System.out.println("");

		// impresion de matriz diagonal ambas
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[0].length; j++) {
				if (i + j == matriz.length - 1 || i == j) {
					sumAmbas += matriz[i][j];
					System.out.printf("[%d]", matriz[i][j]);
				} else {
					System.out.print("[ ]");
				}

			}
			System.out.println("");
		}

		System.out.printf("Suma: %d%n", sumAmbas);

	}

}
