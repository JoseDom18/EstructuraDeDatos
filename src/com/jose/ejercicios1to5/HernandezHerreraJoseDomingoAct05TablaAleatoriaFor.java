package com.jose.ejercicios1to5;

import java.util.Random;

public class HernandezHerreraJoseDomingoAct05TablaAleatoriaFor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Random aleatorio = new Random();
		int numero = aleatorio.nextInt(20) + 1;
		
		for(int i = 1; i <= 10; i++) {
			System.out.printf("%d x %d = %d%n", numero, i, numero * i);
		}
	}

}
