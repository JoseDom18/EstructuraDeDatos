package com.jose.ejerciciosClase;

import java.util.Random;

public class MatrizTranversal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Crear una programa en java que genere una matriz cuadrada de tamaño nxn donde
		 * n es un numero aleatorio entre 4 y 8. llene la matriz con numero aleatorios
		 * entre 20 y 50. Cree una segunda matriz y guarde en ella los elementos de la
		 * primera convirtiendo cada fila de la primera en una columna en la segunda o
		 * cada columna de la primera en una fila de la segunda.
		 */

		int fc = new Random().nextInt(5) + 4;
		int[][] num = new int[fc][fc];
		int[][] invertida = new int[fc][fc];

		llenar(num);
		imprimir(num);
		invertir(num, invertida);
		System.out.println("======================================");
		imprimir(invertida);


	}

	public static void llenar(int[][] num) {

		for (int i = 0; i < num.length; i++) {
			for (int j = 0; j < num[0].length; j++) {
				num[i][j] = new Random().nextInt(31) + 20;
			}
		}
	}

	public static void invertir(int[][] num, int[][] invertida) {

			for (int i = 0; i < num.length; i++) {
				for (int j = 0; j < num[0].length; j++) {
					invertida[j][i] = num[i][j]; 
				}
			}
		}


	public static void imprimir(int[][] num) {

			for (int i = 0; i < num.length; i++) {
				for (int j = 0; j < num[0].length; j++) {
					System.out.printf("[%d]", num[i][j]);
				}
				System.out.println("");
			}
		}

}
