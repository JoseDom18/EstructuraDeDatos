package com.jose.ejercicios24to31;

import java.util.Random;

public class HernandezHerreraJoseDomingoAct27MatricesEdificio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random alt = new Random();
		int[][] edificio = new int[4][7];
		int sumGrado = 0;
		int sumGrupo = 0;

		// rellenar matriz
		for (int i = 0; i < edificio.length - 1; i++) {
			for (int j = 0; j < edificio[0].length - 1; j++) {

				int alum = alt.nextInt(6) + 25;
				edificio[i][j] = alum;

			}
		}

	}

}
