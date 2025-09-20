package com.jose.ejercicios6to16;

public class HernandezHerreraJoseDomingoAct07Tablas20For {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int numero = 1;
		int multiplicador = 1;

		while (numero <= 20) {
			System.out.printf("%d x %d = %d%n", numero, multiplicador, numero * multiplicador);
			multiplicador++;
			if (multiplicador == 11) {
				numero++;
				multiplicador = 1;
				System.out.println("------------------------------------");
			}
		}
	}

}
