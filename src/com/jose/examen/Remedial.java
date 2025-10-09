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
		int salario = 700;

		System.out.println("Dias trabajados");
		llenarEncabezados(encabezado, cPrincipal, tabla);
		numeros(num, salario);
		mezclar(tabla, num);
		imprimir(tabla);

	}

	public static void llenarEncabezados(String[] encabezado, String[] cPrincipal, String[][][] tabla) {

		for (int i = 0; i < tabla.length; i++) {
			for (int j = 0; j < tabla[0].length; j++) {
				for (int k = 0; k < tabla[0][0].length; k++) {
					if (j == 0)
						tabla[i][j][k] = encabezado[k]; // rellenar encabezado
					if (k == 0 && j > 0)
						tabla[i][j][k] = cPrincipal[j - 1]; // rellenar columna inicial
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

	public static void numeros(int[][][] num, int salario) {
		for (int i = 0; i < num.length; i++) {
			for (int j = 0; j < num[0].length - 1; j++) {
				for (int k = 0; k < num[0][0].length - 1; k++) {
					if (j > 0 && k > 0) {
						if (i == 0) {
							num[i][j][k] = new Random().nextInt(23) + 8;
						} else {
							num[i][j][k] = salario * num[0][j][k];
						}
						num[i][num[0].length - 1][k] += num[i][j][k];
						num[i][j][num[0][0].length - 1] += num[i][j][k];
						num[i][num[0].length - 1][num[0][0].length - 1] += num[i][j][k];
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
