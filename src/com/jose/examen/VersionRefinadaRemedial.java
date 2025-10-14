package com.jose.examen;

import java.util.Random;

public class VersionRefinadaRemedial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = new Random().nextInt(6) + 5;
		int[][] terreno = new int[n + 1][n + 1]; // +1 para totales
		llenar(terreno);
		imprimirTerrono(terreno);
		System.out.println("");
		int[][] herencia1 = herencia(terreno, 1);
		int[][] herencia2 = herencia(terreno, 2);
		int[][] herencia3 = herencia(terreno, 3);
		imprimirH(herencia1, 1);
		imprimirH(herencia2, 2);
		imprimirH(herencia3, 3);

	}

	public static void llenar(int[][] arr) {
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = 0; j < arr[0].length - 1; j++) {
				arr[i][j] = new Random().nextInt(21) + 10;
				arr[i][arr[0].length - 1] += arr[i][j];
				arr[arr.length - 1][j] += arr[i][j];
				arr[arr.length - 1][arr[0].length - 1] += arr[i][j];
			}
		}
	}

	public static void imprimirTerrono(int[][] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				System.out.printf("[%4d]", arr[i][j]);
			}
			System.out.println("");
		}
		System.out.printf("Total de ganado: %d%n", arr[arr.length - 1][arr[0].length - 1]);
		System.out.printf("Total de Héctareas: %d%n", (arr.length - 1) * (arr.length - 1));
		System.out.println("");
	}

	/**
	 * 
	 * @param arr terreno a repartir
	 * @param h numero de hijo
	 * @return regresa el array para el hijo seleccionado
	 */
	public static int[][] herencia(int[][] arr, int h) {

		int[][] herencia = new int[arr.length][arr[0].length];
		int hectareasFilas = 0;
		int ganado = 0;

		for (int i = 0; i < herencia.length - 1; i++) {
			for (int j = 0; j < herencia[0].length - 1; j++) {
				if(i % 3 == h - 1) {
				herencia[i][j] = arr[i][j];
				ganado += arr[i][j];
				hectareasFilas++;
				}
			}
		}
		herencia[arr.length - 1][arr[0].length - 1] = ganado;
		herencia[arr.length - 1][arr[0].length - 2] = hectareasFilas;

		return herencia;
	}

	/**
	 * 
	 * @param arr terreno ya dividido
	 * @param h numero de hijo
	 */
	public static void imprimirH(int[][] arr, int h) {
		System.out.printf("Herencia %d%n", h);
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = 0; j < arr[0].length - 1; j++) {
				if(arr[i][j] != 0) {
				System.out.printf("[%4d]", arr[i][j]);
				} else {
					System.out.printf("[    ]");
				}
			}
			System.out.println("");
		}
		System.out.printf("Total de ganado: %d%n", arr[arr.length - 1][arr[0].length - 1]);
		System.out.printf("Total de Héctareas: %d%n", arr[arr.length - 1][arr[0].length - 2]);
		System.out.println("");
	}

}
