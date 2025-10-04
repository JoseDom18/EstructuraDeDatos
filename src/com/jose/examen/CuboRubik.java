package com.jose.examen;

public class CuboRubik {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SalasHospital a = new SalasHospital();

		String[][] ladoR = new String[3][3];
		String[] contenidoColores = { "Blanco", "Amarillo", "Azul", "Rojo", "Verde", "Naranja"};
		int[] contadorColores = { 9, 9, 9, 9, 9, 9};
		int[] concidenciasColores = new int[6];
		
		a.asignar(ladoR, 1, 1, contenidoColores, contadorColores, concidenciasColores, 3);
		a.imprimir(ladoR, contenidoColores, concidenciasColores, 3);

	}

}
