package com.jose.examen;

import java.util.Random;

public class HernandezHerreraJoseDomingoEvaluacion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[][][] cubo = new String[3][3][6];
		Random alt = new Random();

		// Asignar caras
		for (int i = 0; i < 6; i++) {
			cubo[1][1][i] = Colores.asignarColor(i);
		}

		while (Colores.blanco > 0 || Colores.amarillo > 0 || Colores.azul > 0 || Colores.rojo > 0 || Colores.verde > 0
				|| Colores.naranja > 0) {
			int r = alt.nextInt(3);
			int c = alt.nextInt(3);
			int cara = alt.nextInt(6);
			if (cubo[r][c][cara] == null) {
				int num = alt.nextInt(6);
				cubo[r][c][cara] = Colores.asignarColor(num);
				Colores.contador(cara, num);
			}
		}

		// impresion de caras
		for (int i = 0; i < cubo[0][0].length; i++) {
			for (int j = 0; j < cubo.length; j++) {
				for (int k = 0; k < cubo[0].length; k++) {
					System.out.printf("[%8s]", cubo[j][k][i]);
				}
				System.out.println("");

			}
			System.out.println("");
			// imprimir sumas de lado
			System.out.printf("En la cara color %s hay %d elementos %ss%n", cubo[1][1][i],
					Colores.devolverCantidad(cubo[1][1][i]) + 1, cubo[1][1][i]);
			System.out.println("");
		}

	}

}

class Colores {

	static int blanco = 9;
	static int amarillo = 9;
	static int azul = 9;
	static int rojo = 9;
	static int verde = 9;
	static int naranja = 9;
	static int contB = 0;
	static int contA = 0;
	static int contAz = 0;
	static int contR = 0;
	static int contV = 0;
	static int contN = 0;

	int limite;
	int contador;
	String nombre;

	static String asignarColor(int alt) {
		String[] colores = { "Blanco", "Amarillo", "Azul", "Rojo", "Verde", "Naranja" };
		switch (colores[alt]) {
		case "Blanco":
			if (blanco > 0) {
				blanco--;
				return colores[alt];
			}
			break;
		case "Amarillo":
			if (amarillo > 0) {
				amarillo--;
				return colores[alt];
			}
			break;
		case "Azul":
			if (azul > 0) {
				azul--;
				return colores[alt];
			}
			break;
		case "Rojo":
			if (rojo > 0) {
				rojo--;
				return colores[alt];
			}
			break;
		case "Verde":
			if (verde > 0) {
				verde--;
				return colores[alt];
			}
			break;
		case "Naranja":
			if (naranja > 0) {
				naranja--;
				return colores[alt];
			}
			break;

		}

		return null;
	}

	static int devolverCantidad(String color) {

		switch (color) {

		case "Blanco":
			return contB;
		case "Amarillo":
			return contA;
		case "Azul":
			return contAz;
		case "Rojo":
			return contR;
		case "Verde":
			return contV;
		case "Naranja":
			return contN;
		default:
			return 0;

		}
	}

	static void contador(int cara, int num) {

		if (cara == 0 && num == 0) contB++;
		else if (cara == 1 && num == 1) contA++;
		else if (cara == 2 && num == 2) contAz++;
		else if (cara == 3 && num == 3) contR++;
		else if (cara == 4 && num == 4) contV++;
		else contN++;
	}

}
