package com.jose.ejercicios24to31;

import java.util.Random;

public class HernandezHerreraJoseDomingoAct25MatricesOrillas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Random alt = new Random();
		int row = alt.nextInt(6) + 5;
		int col = alt.nextInt(6) + 5;
		int[][] matriz = new int[row][col];
		int sum = 0;

		// impresion de matriz completa
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[0].length; j++) {
				int cont = alt.nextInt(10) + 1;
				matriz[i][j] = cont;
				System.out.printf("[%4d]", matriz[i][j]);

			}
			System.out.println("");
		}

		System.out.println("#################################");

		// impresion de matriz orillas
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[0].length; j++) {
				if (i == 0 || i == row - 1 || j == 0 || j == col - 1) {
					sum += matriz[i][j];
					System.out.printf("[%4d]", matriz[i][j]);
				} else {
					System.out.print("[    ]");
				}

			}
			System.out.println("");
		}

		System.out.printf("Suma de los números que se encuentran en las orillas: %d", sum);

	}

}
