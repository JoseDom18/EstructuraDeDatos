package com.jose.ejercicios6to16;

import java.util.Random;

public class HernandezHerreraJoseDomingoAct11TablaAleatoriaWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Random alt = new Random();
		int factor1 = alt.nextInt(20) + 1;
		int factor2 = 1;

		
		while(factor2 < 11) {
			System.out.printf("%d x %d = %d%n", factor1, factor2, factor1 * factor2);
			factor2++;
		}
	}

}
