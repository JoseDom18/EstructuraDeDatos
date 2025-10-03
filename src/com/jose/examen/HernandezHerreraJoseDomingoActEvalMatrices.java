package com.jose.examen;

import java.util.Random;

public class HernandezHerreraJoseDomingoActEvalMatrices {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// instancia de clase
		Animal a = new Animal();

		// lista de animales

		// crear corrales
		String[][] gacelas = new String[4][4];
		String[][] ciervos = new String[4][4];
		String[][] nus = new String[4][4];
		String[][] leopardos = new String[4][4];
		String[][] guepardos = new String[4][4];
		String[][] martas = new String[4][4];

					gacelas[0][0] = a.asignarHerbivoro(0);
					ciervos[0][0] = a.asignarHerbivoro(1);
					nus[0][0] = a.asignarHerbivoro(2);
					leopardos[0][0] = a.asignarCarnivoro(0);
					guepardos[0][0] = a.asignarCarnivoro(1);
					martas[0][0] = a.asignarCarnivoro(2);
//		// asignar corral gacelas
//		for (int i = 0; i < gacelas.length; i++) {
//			for (int j = 0; j < gacelas[0].length; j++) {
//				if (i == 0 && j == 0) {
//					gacelas[i][j] = a.asignarHerbivoro(0);
//				} else {
//					int random = new Random().nextInt(3);
//					gacelas[i][j] = a.asignarHerbivoro(random);
//					if (random == 0) a.conG++;
//					
//				}
//			}
//		}
//
//		// asignar corral ciervos
//		for (int i = 0; i < ciervos.length; i++) {
//			for (int j = 0; j < ciervos[0].length; j++) {
//				if (i == 0 && j == 0) {
////					int random = new Random().nextInt(3);
//					ciervos[i][j] = a.asignarHerbivoro(1);
//				}else {
//					int random = new Random().nextInt(3);
//					ciervos[i][j] = a.asignarHerbivoro(random);
//					if (random == 1) a.conC++;
//					
//				}
//
//
//			}
//		}
//
//		// asignar corral ñus
//		for (int i = 0; i < nus.length; i++) {
//			for (int j = 0; j < nus[0].length; j++) {
//				if (i == 0 && j == 0) {
////					int random = new Random().nextInt(3);
//					nus[i][j] = a.asignarHerbivoro(2);
//				}else {
//					int random = new Random().nextInt(3);
//					nus[i][j] = a.asignarHerbivoro(random);
//					if (random == 2) a.conN++;
//					
//				}
//
//
//			}
//		}
//
//		// asignar corral leopardos
//		for (int i = 0; i < leopardos.length; i++) {
//			for (int j = 0; j < leopardos[0].length; j++) {
//				if (i == 0 && j == 0) {
////					int random = new Random().nextInt(3);
//					leopardos[i][j] = a.asignarCarnivoro(0);
//				}else {
//					int random = new Random().nextInt(3);
//					leopardos[i][j] = a.asignarCarnivoro(random);
//					if (random == 0) a.conL++;
//					
//				}
//
//
//			}
//		}
//
//		// asignar corral guepardos
//		for (int i = 0; i < guepardos.length; i++) {
//			for (int j = 0; j < guepardos[0].length; j++) {
//				if (i == 0 && j == 0) {
////					int random = new Random().nextInt(3);
//					guepardos[i][j] = a.asignarCarnivoro(1);
//				}else {
//					int random = new Random().nextInt(3);
//					guepardos[i][j] = a.asignarCarnivoro(random);
//					if (random == 1) a.conGu++;
//					
//				}
//
//
//			}
//		}
//
//		// asignar corral martas
//		for (int i = 0; i < martas.length; i++) {
//			for (int j = 0; j < martas[0].length; j++) {
//				if (i == 0 && j == 0) {
////					int random = new Random().nextInt(3);
//					martas[i][j] = a.asignarCarnivoro(2);
//				}else {
//					int random = new Random().nextInt(3);
//					martas[i][j] = a.asignarCarnivoro(random);
//					if (random == 2) a.conM++;
//					
//				}
//
//			}
//		}

			int cont = 16;
//		 asignar animales herbivoros de manera random
		while ((a.gacelas > 0 || a.ciervos > 0 || a.nus > 0) && cont > 0) {
			int fila = new Random().nextInt(4);
			int colum = new Random().nextInt(4);
			if (gacelas[fila][colum] == null ) {
				int random = new Random().nextInt(3);
				gacelas[fila][colum] = a.asignarHerbivoro(random); 
				cont--;
				System.out.println(cont);
				System.out.println("ciervos: " + a.ciervos);
			}
		}
		

		// imprimir corral gacelas
		for (int i = 0; i < gacelas.length; i++) {
			for (int j = 0; j < gacelas[0].length; j++) {
				System.out.printf("[%9s]", gacelas[i][j]);
			}
			System.out.println();
		}

		System.out.println("");
		System.out.printf("En el corral de Gacelas hay %d Gacelas", a.conG + 1);
		System.out.println("");
		System.out.println("");

		// imprimir corral ciervos
		for (int i = 0; i < ciervos.length; i++) {
			for (int j = 0; j < ciervos[0].length; j++) {
				System.out.printf("[%9s]", ciervos[i][j]);
			}
			System.out.println();
		}

		System.out.println("");
		System.out.printf("En el corral de Ciervos hay %d Ciervos", a.conC + 1);
		System.out.println("");
		System.out.println("");

		// imprimir corral ñus
		for (int i = 0; i < nus.length; i++) {
			for (int j = 0; j < nus[0].length; j++) {
				System.out.printf("[%9s]", nus[i][j]);
			}
			System.out.println();
		}

		System.out.println("");
		System.out.printf("En el corral de Ñus hay %d Ñus", a.conN + 1);
		System.out.println("");
		System.out.println("");

		// imprimir corral leopardos
		for (int i = 0; i < leopardos.length; i++) {
			for (int j = 0; j < leopardos[0].length; j++) {
				System.out.printf("[%9s]", leopardos[i][j]);
			}
			System.out.println();
		}

		System.out.println("");
		System.out.printf("En el corral de Leopardos hay %d Leopardos", a.conL + 1);
		System.out.println("");
		System.out.println("");

		// imprimir corral guepardos
		for (int i = 0; i < guepardos.length; i++) {
			for (int j = 0; j < guepardos[0].length; j++) {
				System.out.printf("[%9s]", guepardos[i][j]);
			}
			System.out.println();
		}

		System.out.println("");
		System.out.printf("En el corral de Guepardos hay %d Guepardos", a.conGu + 1);
		System.out.println("");
		System.out.println("");

		// imprimir corral martas
		for (int i = 0; i < martas.length; i++) {
			for (int j = 0; j < martas[0].length; j++) {
				System.out.printf("[%9s]", martas[i][j]);
			}
			System.out.println();
		}

		System.out.println("");
		System.out.printf("En el corral de Martas hay %d Martas", a.conM + 1);
		System.out.println("");
		System.out.println("");

	}

}

class Animal {
	int gacelas = 16;
	int ciervos = 16;
	int nus = 16;
	int leopardos = 16;
	int guepardos = 16;
	int martas = 16;
	int conG = 0;
	int conC = 0;
	int conN = 0;
	int conL = 0;
	int conGu = 0;
	int conM = 0;

	String asignarHerbivoro(int f) {
		String[] animales = { "Gacelas", "Ciervos", "Ñus" };

		switch (animales[f]) {
		case "Gacelas":
			if (gacelas > 0) {
				gacelas--;
				return animales[f];
			}
			break;
		case "Ciervos":
			if (ciervos > 0) {
				ciervos--;
				return animales[f];
			}
			break;
		case "Ñus":
			if (nus > 0) {
				nus--;
				return animales[f];
			}break;
		}
		return null;
	}

	String asignarCarnivoro(int f) {
		String[] animales = { "Leopardos", "Guepardos", "Martas" };

		switch (animales[f]) {
		case "Leopardos":
			if (leopardos > 0) {
				leopardos--;
				return animales[f];
			}
			break;
		case "Guepardos":
			if (guepardos > 0) {
				guepardos--;
				return animales[f];
			}
			break;
		case "Martas":
			if (martas > 0) {
				martas--;
				return animales[f];
			}
			break;
		}
		return null;
	}
}
