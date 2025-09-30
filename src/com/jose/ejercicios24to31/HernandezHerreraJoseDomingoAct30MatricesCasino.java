package com.jose.ejercicios24to31;

import java.util.Random;

public class HernandezHerreraJoseDomingoAct30MatricesCasino {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random alt = new Random();

		int numTiros = alt.nextInt(4) + 3;
		int filas = alt.nextInt(2) + 4;
		int colum = alt.nextInt(2) + 4;
		int[][] tableroPuntos = new int[filas][colum];
		boolean[][] tableroBool = new boolean[filas][colum];
		int sum = 0;

		// Llenar tablero de puntos
		for (int i = 0; i < tableroPuntos.length; i++) {
			for (int j = 0; j < tableroPuntos[0].length; j++) {

				int cant = (alt.nextInt(5) + 1) * 1000;
				tableroPuntos[i][j] = cant;
			}
		}

		System.out.println("Tablero");

		// Imprimir tabla
		for (int i = 0; i < tableroPuntos.length; i++) {
			for (int j = 0; j < tableroPuntos[0].length; j++) {
				System.out.printf("[%4d]", tableroPuntos[i][j]);

			}
			System.out.println("");
		}

		System.out.printf("Numero de tiros: %d%n", numTiros);

		// tablero boleano
		for (int i = 0; i < tableroPuntos.length; i++) {
			for (int j = 0; j < tableroPuntos[0].length; j++) {

				tableroBool[i][j] = false;
			}
		}

		while (numTiros > 0) {

			int tiroF = alt.nextInt(tableroPuntos.length);
			int tiroC = alt.nextInt(tableroPuntos[0].length);
			System.out.printf("Tiro [%d][%d]%n", tiroF, tiroC);
			if (tableroBool[tiroF][tiroC] == false) {
				tableroBool[tiroF][tiroC] = true;
				sum += tableroPuntos[tiroF][tiroC];
				System.out.printf("La casilla esta libre para el tiro [%d][%d] suma: %d, puntos totales: %d%n", tiroF, tiroC, tableroPuntos[tiroF][tiroC], sum);
				numTiros--;
			} else System.out.println(" Tiro Repetido");

		}

        System.out.println();
        System.out.println("######################################");
        System.out.println();

        // imprimir tablero con resultados
        for (int i = 0; i < tableroPuntos.length; i++) {
            for (int j = 0; j < tableroPuntos[0].length; j++) {
                if (tableroBool[i][j] == true) System.out.printf("[%4d]", tableroPuntos[i][j]);
                else System.out.print("[----]");

            }
            System.out.println("");
        }
	}

}
