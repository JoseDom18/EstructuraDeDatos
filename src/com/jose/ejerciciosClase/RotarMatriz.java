package com.jose.ejerciciosClase;


public class RotarMatriz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr = new int[4][4];
		rellenar(arr);
		imprimir(arr);
		int[][] nueva = trasponer(arr);
		System.out.println("");
		imprimir(nueva);
//		int[][] circular = circular(arr);
//		System.out.println("circular");
//		imprimir(circular);

	}

	public static void rellenar(int[][] arr) {
		int cont = 1;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				arr[i][j] = cont;
				cont++;
			}
		}
	}

	public static void imprimir(int[][] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				System.out.printf("[%2d]", arr[i][j]);
			}
			System.out.println("");
		}
	}
	
	public static int[][] trasponer(int[][] arr) {
		int[][] nueva = new int[arr.length][arr[0].length];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				nueva[j][i] = arr[i][j];
			}
		}
		return nueva;
	}

	public static int[][] circular(int[][] arr) {
		int[][] nueva = new int[arr.length][arr[0].length];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				if(i == 0) {
					nueva[j][3] = arr[i][j];
				}else if(i == 1) {
					nueva[][] = arr[][];
				}
			}
		}
		return nueva;
	}

}
