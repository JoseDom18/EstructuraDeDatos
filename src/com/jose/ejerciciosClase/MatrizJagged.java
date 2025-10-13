package com.jose.ejerciciosClase;

import java.util.Random;

public class MatrizJagged {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][] jagged = new int[3][];
		jagged[0] = new int[3];
		jagged[1] = new int[6];
		jagged[2] = new int[2];

		int num = jagged.length;
		System.out.println("Longitud: " + num);
		imprimir(jagged);


	}

	public static void imprimir(int[][] arr) {
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				arr[i][j] = new Random().nextInt(5) + 1;
				System.out.printf("[%d]", arr[i][j]);
			}
			System.out.println("");
		}
	}

}
