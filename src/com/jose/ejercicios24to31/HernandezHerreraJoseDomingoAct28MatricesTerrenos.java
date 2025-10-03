package com.jose.ejercicios24to31;

import java.util.Random;

public class HernandezHerreraJoseDomingoAct28MatricesTerrenos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random alt = new Random();
		int dim = alt.nextInt(6) + 5;
		int[][] matriz = new int[dim][dim];
		int sumComp = 0;
		int sumPrin = 0;
		int sumInv = 0;
		int sumTerrenos = 0;
		int sumTHijo = 0;
		int sumTPublico = 0;

		// impresion de matriz completa
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[0].length; j++) {
				int cont = alt.nextInt(41) + 50;
				matriz[i][j] = cont;
				System.out.printf("[%d]", matriz[i][j]);
				sumComp += matriz[i][j];
				sumTerrenos++;

			}
			System.out.println("");
		}
		System.out.printf("Suma: %d%nTotal Terrenos: %d", sumComp, sumTerrenos);
		System.out.println("");

		System.out.println("##############################################################");
		System.out.println("");

		// impresion de matriz diagonal principal
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[0].length; j++) {
				if (i == j || i + j == matriz.length - 1 || i == 0 || i == matriz.length - 1 || j == 0 || j == matriz[0].length - 1 ) {
					sumPrin += matriz[i][j];
					System.out.printf("[%d]", matriz[i][j]);
					sumTHijo++;
				} else {
					System.out.print("[  ]");
				}

			}
			System.out.println("");
		}

		System.out.printf("Suma: %d%nTerrenos hijo: %d", sumPrin, sumTHijo);
		System.out.println("");

		System.out.println("##############################################################");
		System.out.println("");

		// impresion de matriz diagonal inversa
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[0].length; j++) {
				if (!(i == j || i + j == matriz.length - 1 || i == 0 || i == matriz.length - 1 || j == 0 || j == matriz[0].length - 1 )) {
					sumInv += matriz[i][j];
					System.out.printf("[%d]", matriz[i][j]);
					sumTPublico++;
				} else {
					System.out.print("[  ]");
				}

			}
			System.out.println("");
		}

		System.out.printf("Suma: %d%nSuma Terrenos publicos: %d", sumInv, sumTPublico);
		System.out.println("");

		System.out.println("##############################################################");
		


	}

}
