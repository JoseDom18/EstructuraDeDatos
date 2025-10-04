package com.jose.examen;

import java.util.Random;

public class SalasHospital {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SalasHospital a = new SalasHospital();

		// crear sala
		String[][] salaCirugia = new String[4][4];
		String[] quirurgicas = { "Cirugía", "Traumatología" };
		int[] contadorQ = { 16, 16 };
		int[] concidenciasQ = new int[2];

		a.asignar(salaCirugia, 0, 0, quirurgicas, contadorQ, concidenciasQ, 0);
		a.imprimir(salaCirugia, quirurgicas, concidenciasQ, 0);



		String[][] salaTrauma = new String[4][4];
		a.asignar(salaTrauma, 0, 0, quirurgicas, contadorQ, concidenciasQ, 1);
		a.imprimir(salaTrauma, quirurgicas, concidenciasQ, 1);


	}
/**
 * Asigna las casillas de la sala elegida, tambien cuenta las concidencias.
 * @param array
 * @param iniF
 * @param iniC
 * @param contenido
 * @param contador
 * @param coincidencias
 * @param tipo
 */
	void asignar(String[][] array, int iniF, int iniC, String[] contenido, int[] contador, int[] coincidencias,
			int tipo) {

		int numCasillas = array.length * array[0].length;

		while (numCasillas > 0) {
			int fil = new Random().nextInt(array.length);
			int col = new Random().nextInt(array[0].length);
			int seleccion = new Random().nextInt(contenido.length);
			if (fil == iniF && col == iniC && array[iniF][iniC] == null) {
				array[fil][col] = contenido[tipo];
				numCasillas--;
				contador[tipo]--;
				coincidencias[tipo]++;
			} else if (array[fil][col] == null && contador[seleccion] > 0) {
				array[fil][col] = contenido[seleccion];
				numCasillas--;
				contador[seleccion]--;
				if (seleccion == tipo)
					coincidencias[seleccion]++;
			}

		}

	}


	/**
	 * Imprime las arrays
	 * @param array
	 * @param contenido
	 * @param concidencias
	 * @param tipo
	 */
	void imprimir(String[][] array, String[] contenido, int[] concidencias, int tipo) {

		System.out.printf("Tipo: %s%n", contenido[tipo]);
		
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[0].length; j++) {
				
				System.out.printf("[%13s]", array[i][j]);
			}
			System.out.println("");
		}
		System.out.printf("En la sala de %s hay %d camas de %s.%n", contenido[tipo], concidencias[tipo], contenido[tipo]);
		System.out.println("");
		System.out.println("Programa hecho by - Mingood =)");
		System.out.println("");
	}
}
