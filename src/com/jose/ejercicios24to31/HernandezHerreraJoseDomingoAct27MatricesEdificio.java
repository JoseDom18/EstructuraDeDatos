package com.jose.ejercicios24to31;

import java.util.Random;

public class HernandezHerreraJoseDomingoAct27MatricesEdificio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random alt = new Random();
		int[][] edificio = new int[4][7];

		// rellenar matriz
		for (int i = 0; i < edificio.length - 1; i++) {
			for (int j = 0; j < edificio[0].length - 1; j++) {

				int alum = alt.nextInt(6) + 25;
				edificio[i][j] = alum;
				edificio[i][edificio[0].length -1] += edificio[i][j];
				edificio[edificio.length -1][j] += edificio[i][j];


			}
		}

		// imprimir matriz
		for (int i = 0; i < edificio.length; i++) {
			for (int j = 0; j < edificio[0].length; j++) {
				System.out.printf("[%3d]", edificio[i][j]);

			}
			System.out.println("");
		}

	}

}
