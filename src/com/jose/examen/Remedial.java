package com.jose.examen;

import java.util.Random;

public class Remedial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[][][] tabla = new String[2][14][7];
		String[] encabezado = { "Mes", "Juan", "Rosa", "Sandra", "Daniel", "Julia", "Totales" };
		String[] cPrincipal = { "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre",
				"Octubre", "Noviembre", "Diciembre", "Total de dias trabajados" };
		int[][][] num = new int[2][14][7];

		llenar(encabezado, cPrincipal, num, tabla);
//		imprimir(tabla);
		numeros(num);
//		imprimir(num);
		mezclar(tabla, num);
		imprimir(tabla);

	}

	public static void llenar(String[] encabezado, String[] cPrincipal, int[][][] num, String[][][] tabla) {

		for (int i = 0; i < tabla.length; i++) {
			for (int j = 0; j < tabla[0].length; j++) {
				for (int k = 0; k < tabla[0][0].length; k++) {
//					if (j == tabla[0].length - 1 || k == tabla[0][0].length - 1)
//						tabla[i][j][k] = String.valueOf(0); // dejar en 0 esquinas
					if (j == 0)
						tabla[i][j][k] = encabezado[k]; // rellenar encabezado
					if (k == 0 && j > 0)
						tabla[i][j][k] = cPrincipal[j - 1]; // rellenar columna inicial
					if (j > 0 && k > 0 && j < tabla[0].length - 1 && k < tabla[0][0].length - 1) {

					}

				}
			}
		}
	}

	public static void imprimir(String[][][] tabla) {

		// rellenar encabezado
		for (int i = 0; i < tabla.length; i++) {
			for (int j = 0; j < tabla[0].length; j++) {
				for (int k = 0; k < tabla[0][0].length; k++) {
					System.out.printf("[%25s]", tabla[i][j][k]);
				}
				System.out.println("");
			}
			System.out.println("");
		}
	}

	public static void imprimir(int[][][] tabla) {

		// rellenar encabezado
		for (int i = 0; i < tabla.length; i++) {
			for (int j = 0; j < tabla[0].length; j++) {
				for (int k = 0; k < tabla[0][0].length; k++) {
					System.out.printf("[%25d]", tabla[i][j][k]);
				}
				System.out.println("");
			}
			System.out.println("");
		}
	}

	public static void numeros(int[][][] num) {
		for (int i = 0; i < num.length; i++) {
			for (int j = 0; j < num[0].length; j++) {
				for (int k = 0; k < num[0][0].length; k++) {
					if (i == 0) {
						if (j > 0 && k > 0) {
							num[i][j][k] = new Random().nextInt(23) + 8;
							num[i][num[0].length - 1][k] += num[i][j][k];
							num[i][j][num[0][0].length - 1] += num[i][j][k];
						}
					}else {
					}
				}
			}
		}
	}

	public static void mezclar(String[][][] rellenado, int[][][] numeros) {
		for (int i = 0; i < rellenado.length; i++) {
			for (int j = 0; j < rellenado[0].length; j++) {
				for (int k = 0; k < rellenado[0][0].length; k++) {
					if (j > 0 && k > 0) {
						rellenado[i][j][k] = String.valueOf(numeros[i][j][k]);
					}
				}
			}
		}

	}

}
