package com.jose.ejercicios24to31;

import java.util.Random;

public class HernandezHerreraJoseDomingoAct31MatricesCanicas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random alt = new Random();

		int[][] tablero = new int[8][6];
		int tiros = 5;
		boolean[][] tableroBool = new boolean[8][6];
		String[] premios = {"Peluche pequeño", "Pulsera de plastico", "Cubo de rubik", "Florero", "Muñeca barbie", "Carro de juguete", "Bocinas", "Audifonos", "CD's", "Funda para celular", "Lapicero", "Lampara de mano", "Lampara de buro", "Portaretrato", "Reloj de pared", "Peluche grande", "Porta vasos", "Tableta", "Laptop", "Lampara USB", "Smartphone"};


		// rellenar matiz
		for (int i = 0; i < tablero.length; i++) {
			for (int j = 0; j < tablero[0].length; j++) {
				int contenido = (alt.nextInt(3) + 1) * 2;
				tablero[i][j] = contenido;
				tableroBool[i][j] = false;

			}
		}
		
		System.out.println("Tablero:");

		// impresion de matriz
		for (int i = 0; i < tablero.length; i++) {
			for (int j = 0; j < tablero[0].length; j++) {
				System.out.printf("[%d}", tablero[i][j]);
			}
			System.out.println("");
		}

		int sum = 0;

		// determinar repetidos
		while (tiros > 0) {
			int tiroF = alt.nextInt(8);
			int tiroC = alt.nextInt(6);
			if (tableroBool[tiroF][tiroC] == false) {
				tableroBool[tiroF][tiroC] = true;
				tiros--;
				sum += tablero[tiroF][tiroC];
			} else System.out.println("Tiro repetido!!!");
			
		}
		
		System.out.println("");
		System.out.println("Numero en los que cayeron: ");
		
		// imprimir tablero con tiros
		for (int i = 0; i < tablero.length; i++) {
			for (int j = 0; j < tablero[0].length; j++) {
				if (tableroBool[i][j] == true) System.out.printf("[%d}", tablero[i][j]);
				else System.out.print("[ ]");
			}
			System.out.println("");
		}
		
			System.out.printf("Suma de puntos: %d%n", sum);
			System.out.printf("Premio: %s", premios[sum-10]);
	}

}
