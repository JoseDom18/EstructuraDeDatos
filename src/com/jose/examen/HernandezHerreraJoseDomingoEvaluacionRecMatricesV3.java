package com.jose.examen;

import java.util.Random;

public class HernandezHerreraJoseDomingoEvaluacionRecMatricesV3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = new Random().nextInt(6) + 5;
		int[][] terreno = new int[n + 1][n + 1]; // +1 para totales
		llenar(terreno);
		imprimir(terreno);
		System.out.println("");
//		int[][] herencia1 = herencia1(terreno);
//		int[][] herencia2 = herencia2(terreno);
//		int[][] herencia3 = herencia3(terreno);
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

	public static int[][] herencia1(int[][] arr) {
		System.out.println("Herencia 1");
		int[][] hijo1 = new int[arr.length][arr[0].length];
		int hectareasFilas = 0;
		int ganado = 0;
		for (int i = 0; i < hijo1.length - 1; i++) {
			for (int j = 0; j < hijo1[0].length - 1; j++) {
//				if(i == 0 || i == 3 || i == 6 || i == 9) {
				if(i % 3 == 0) {
				hijo1[i][j] = arr[i][j];
				ganado += arr[i][j];
				}
				if(hijo1[i][j] != 0) {
				System.out.printf("[%4d]", hijo1[i][j]);
				} else {
					System.out.printf("[    ]");
				}
			}
			System.out.println("");
				if(i % 3 == 0) {
					hectareasFilas++;
				}
		}
		System.out.printf("Total de ganado: %d%n", ganado);
		System.out.printf("Total de Hectáreas: %d%n", hectareasFilas * (arr.length - 1));
		System.out.println("");

		return hijo1;
	}

	public static int[][] herencia2(int[][] arr) {
		System.out.println("Herencia 2");
		int[][] hijo2 = new int[arr.length][arr[0].length];
		int hectareasFilas = 0;
		int ganado = 0;

		for (int i = 0; i < hijo2.length - 1; i++) {
			for (int j = 0; j < hijo2[0].length - 1; j++) {
//				if(i == 1 || i == 4 || i == 7) {
				if(i % 3 == 1) {
				hijo2[i][j] = arr[i][j];
				ganado += arr[i][j];
				}
				if(hijo2[i][j] != 0) {
				System.out.printf("[%4d]", hijo2[i][j]);
				} else {
					System.out.printf("[    ]");
				}
			}
			System.out.println("");
				if(i % 3 == 1) {
					hectareasFilas++;
				}
		}

		System.out.printf("Total de ganado: %d%n", ganado);
		System.out.printf("Total de Hectáreas: %d%n", hectareasFilas * (arr.length - 1));
		System.out.println("");

		return hijo2;
	}

	public static int[][] herencia3(int[][] arr) {
		System.out.println("Herencia 3");
		int[][] hijo3 = new int[arr.length][arr[0].length];
		int hectareasFilas = 0;
		int ganado = 0;

		for (int i = 0; i < hijo3.length - 1; i++) {
			for (int j = 0; j < hijo3[0].length - 1; j++) {
//				if (i == 2 || i == 5 || i == 8) {
				if(i % 3 == 2) {
					hijo3[i][j] = arr[i][j];
					ganado += arr[i][j];
				}
				if(hijo3[i][j] != 0) {
				System.out.printf("[%4d]", hijo3[i][j]);
				} else {
					System.out.printf("[    ]");
				}
			}
			System.out.println("");
				if(i % 3 == 2) {
					hectareasFilas++;
				}
		}

		System.out.printf("Total de ganado: %d%n", ganado);
		System.out.printf("Total de Hectáreas: %d%n", hectareasFilas * (arr.length - 1));
		System.out.println("");

		return hijo3;
	}

	public static void imprimir(int[][] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				System.out.printf("[%4d]", arr[i][j]);
			}
			System.out.println("");
		}
		System.out.printf("Total de ganado: %d%n", arr[arr.length - 1][arr[0].length - 1]);
		System.out.printf("Total de Héctareas: %d%n", (arr.length - 1) * (arr.length - 1));
	}

}
