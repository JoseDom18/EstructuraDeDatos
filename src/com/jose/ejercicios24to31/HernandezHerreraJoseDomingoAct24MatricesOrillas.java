package com.jose.ejercicios24to31;

import java.util.Random;

public class HernandezHerreraJoseDomingoAct24MatricesOrillas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Random alt = new Random();
		int row = alt.nextInt(6) + 5;
		int col = alt.nextInt(6) + 5;
		int[][] matriz = new int[row][col];

		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[0].length; j++) {
				int cont = alt.nextInt(1000) + 1;
				matriz[i][j] = cont;
				System.out.printf("[%4d]", matriz[i][j]);

			}
			System.out.println("");
		}

	}

}
