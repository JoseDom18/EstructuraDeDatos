package com.jose.ejercicios6to16;

import java.util.Random;

public class HernandezHerreraJoseDomingoAct06ParesImpares {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Random aleatorio = new Random();
		String[] respuesta = {"par", "impar"};
		
		for(int i = 0; i < 10; i++) {
			
			int num = aleatorio.nextInt(33) + 18;
			System.out.printf("%d es %s.%n", num, respuesta[num % 2]);
		
		}
		
	}

}
