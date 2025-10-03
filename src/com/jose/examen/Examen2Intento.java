package com.jose.examen;

import java.util.Random;

public class Examen2Intento {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// herbivoros
		Random alt = new Random();

		String[] herbivoros = { "Gacelas", "Ciervos", "Ñus" };
		String[] carnivoros = { "Leopardo", "Guepardo", "Martas" };
		int[] cuentaHer = { 16, 16, 16, 16 };
		int[] contadorHer = new int[4];
		String[][] gacelas = new String[4][4];
		String[][] ciervos = new String[4][4];
		String[][] nus = new String[4][4];
		String[][] leopardos = new String[4][4];
		int[] cuentaCar = { 16, 16, 16, 16 };
		int[] contadorCar = new int[4];
		String[][] guepardos = new String[4][4];
		String[][] martas = new String[4][4];

		gacelas[0][0] = herbivoros[0];
		ciervos[0][0] = herbivoros[1];
		nus[0][0] = herbivoros[2];
		leopardos[0][0] = carnivoros[0];
		guepardos[0][0] = carnivoros[1];
		martas[0][0] = carnivoros[2];

		int cont = 15;
		while (cont > 0) {
			int f = alt.nextInt(4);
			int c = alt.nextInt(4);
			int especie = alt.nextInt(3);
			if (gacelas[f][c] == null && cuentaHer[especie] > 0) {
				gacelas[f][c] = herbivoros[especie];
				cuentaHer[especie] = cuentaHer[especie] - 1;
				if (especie == 0)
					contadorHer[especie]++;
				cont--;
			}
		}

		cont = 15;
		while (cont > 0) {
			int f = alt.nextInt(4);
			int c = alt.nextInt(4);
			int especie = alt.nextInt(3);
			if (ciervos[f][c] == null && cuentaHer[especie] > 0) {
				ciervos[f][c] = herbivoros[especie];
				cuentaHer[especie] = cuentaHer[especie] - 1;
				if (especie == 1)
					contadorHer[especie]++;
				cont--;
			}
		}

		cont = 15;
		while (cont > 0) {
			int f = alt.nextInt(4);
			int c = alt.nextInt(4);
			int especie = alt.nextInt(3);
			if (nus[f][c] == null && cuentaHer[especie] > 0) {
				nus[f][c] = herbivoros[especie];
				cuentaHer[especie] = cuentaHer[especie] - 1;
				if (especie == 2)
					contadorHer[especie]++;
				cont--;
			}
		}

		cont = 15;
		while (cont > 0) {
			int f = alt.nextInt(4);
			int c = alt.nextInt(4);
			int especie = alt.nextInt(3);
			if (leopardos[f][c] == null && cuentaCar[especie] > 0) {
				leopardos[f][c] = carnivoros[especie];
				cuentaCar[especie]--;
				if (especie == 0)
					contadorCar[especie]++;
				cont--;
			}
		}

		cont = 15;
		while (cont > 0) {
			int f = alt.nextInt(4);
			int c = alt.nextInt(4);
			int especie = alt.nextInt(3);
			if (guepardos[f][c] == null && cuentaCar[especie] > 0) {
				guepardos[f][c] = carnivoros[especie];
				cuentaCar[especie] = cuentaCar[especie] - 1;
				if (especie == 1)
					contadorCar[especie]++;
				cont--;
			}
		}

		cont = 15;
		while (cont > 0) {
			int f = alt.nextInt(4);
			int c = alt.nextInt(4);
			int especie = alt.nextInt(3);
			if (martas[f][c] == null && cuentaCar[especie] > 0) {
				martas[f][c] = carnivoros[especie];
				cuentaCar[especie] = cuentaCar[especie] - 1;
				if (especie == 2)
					contadorCar[especie]++;
				cont--;
			}
		}
// imprimir corral gacelas
		for (int i = 0; i < gacelas.length; i++) {
			for (int j = 0; j < gacelas[0].length; j++) {
				System.out.printf("[%9s]", gacelas[i][j]);
			}
			System.out.println();
		}
		System.out.println("");
		System.out.printf("En el corral de Gacelas hay %d Gacelas", contadorHer[0] + 1);
		System.out.println("");
		System.out.println("");

		// imprimir corral ciervos
		for (int i = 0; i < ciervos.length; i++) {
			for (int j = 0; j < ciervos[0].length; j++) {
				System.out.printf("[%9s]", ciervos[i][j]);
			}
			System.out.println();
		}

		System.out.println("");
		System.out.printf("En el corral de Ciervos hay %d Ciervos", contadorHer[1] + 1);
		System.out.println("");
		System.out.println("");

		// imprimir corral ñus
		for (int i = 0; i < nus.length; i++) {
			for (int j = 0; j < nus[0].length; j++) {
				System.out.printf("[%9s]", nus[i][j]);
			}
			System.out.println();
		}

		System.out.println("");
		System.out.printf("En el corral de Ñus hay %d Ñus", contadorHer[2] + 1);
		System.out.println("");
		System.out.println("");

		// imprimir corral leopardos
		for (int i = 0; i < leopardos.length; i++) {
			for (int j = 0; j < leopardos[0].length; j++) {
				System.out.printf("[%9s]", leopardos[i][j]);
			}
			System.out.println();
		}

		System.out.println("");
		System.out.printf("En el corral de Leopardos hay %d Leopardos", contadorCar[0] + 1);
		System.out.println("");
		System.out.println("");

		// imprimir corral guepardos
		for (int i = 0; i < guepardos.length; i++) {
			for (int j = 0; j < guepardos[0].length; j++) {
				System.out.printf("[%9s]", guepardos[i][j]);
			}
			System.out.println();
		}

		System.out.println("");
		System.out.printf("En el corral de Guepardos hay %d Guepardos", contadorCar[1] + 1);
		System.out.println("");
		System.out.println("");

		// imprimir corral martas
		for (int i = 0; i < martas.length; i++) {
			for (int j = 0; j < martas[0].length; j++) {
				System.out.printf("[%9s]", martas[i][j]);
			}
			System.out.println();
		}

		System.out.println("");
		System.out.printf("En el corral de Martas hay %d Martas", contadorCar[2] + 1);
		System.out.println("");
		System.out.println("");

	}

}
