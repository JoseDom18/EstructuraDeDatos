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
		String[][] mesTotal = extraerMesTotal(tabla);
//		imprimir(mesTotal);
		ordenar(mesTotal);
		imprimir(mesTotal);

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

	public static void imprimir(String[][] tabla) {
		// rellenar encabezado
		for (int i = 0; i < tabla.length; i++) {
			for (int j = 0; j < tabla[0].length; j++) {
				System.out.printf("[%25s]", tabla[i][j]);
			}
			System.out.println("");
		}
		System.out.println("");
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

	public static String[][] extraerMesTotal(String[][][] tabla) {
		String[][] mesTotal = new String[tabla[0].length][2];
		int colum = 0;
		for (int i = 1; i < tabla.length; i++) {
			for (int j = 0; j < tabla[0].length; j++) {
				for (int k = 0; k < tabla[0][0].length; k++) {
					if (k == 6) colum = 1;
					else colum = 0;
					if (k == 0 || k == 6) mesTotal[j][colum] = tabla[i][j][k];
				}
			}
		}
		return mesTotal;
	}
	
	public static void ordenar(String[][] tabla) {
		for (int i = 2; i < tabla.length - 1; i++) {
			int inicio = 1;
			int fin = i - 1;
			int posicion = i;
			String aux0 = tabla[i][0];
			int aux1 = Integer.parseInt(tabla[i][1]);
			while (inicio <= fin) {
				int medio = inicio + (fin - inicio);
				int mitad = Integer.parseInt(tabla[medio][1]); 
				if(mitad < aux1) fin= medio - 1;
				else inicio = medio + 1;
			}
			posicion = inicio;
			for(int j = i; j > posicion; j--) {
				tabla[j][0] = tabla[j - 1][0];
				tabla[j][1] = tabla[j - 1][1];
			}
				tabla[posicion][0] = aux0; 
				tabla[posicion][1] = String.valueOf(aux1);
		}
		
	}

}
