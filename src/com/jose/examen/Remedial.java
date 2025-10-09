package com.jose.examen;

import java.util.Random;

public class Remedial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Object[][][] tabla = new Object[2][14][7];
		String[] encabezado = {"Mes", "Juan", "Rosa", "Sandra", "Daniel", "Julia", "Totales"};
		String[] cPrincipal = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre", "Total de dias trabajados"};

		llenar(encabezado, cPrincipal, tabla);
		imprimir(encabezado, cPrincipal, tabla);
	}

	public static void llenar (String[] encabezado, String[] cPrincipal, Object[][][] tabla) {
		
		for (int i = 0; i < tabla.length; i++) {
			for (int j = 0; j < tabla[0].length; j++) {
				for (int k = 0; k < tabla[0][0].length; k++) {
					if ( j == tabla[0].length - 1 || k == tabla[0][0].length - 1) tabla[i][j][k] = 0; // dejar en 0 esquinas
					if (j == 0) tabla[i][j][k] = encabezado[k]; // rellenar encabezado
					if (k == 0 && j > 0) tabla[i][j][k] = cPrincipal[j - 1]; // rellenar columna inicial
					if (j > 0 && k > 0 && j < tabla[0].length - 1 && k < tabla[0][0].length - 1) {
						tabla[i][j][k] = new Random().nextInt(23) + 8; // rellenar con numeros random
						tabla[i][tabla[0].length -1][k] = tabla[i][j][k];
					}

				}
			}
		}
	}

	public static void imprimir (String[] encabezado, String[] cPrincipal, Object[][][] tabla) {
		
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
	
}
