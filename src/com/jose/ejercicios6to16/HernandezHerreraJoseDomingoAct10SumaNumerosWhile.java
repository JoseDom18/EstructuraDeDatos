package com.jose.ejercicios6to16;

import java.util.Random;

public class HernandezHerreraJoseDomingoAct10SumaNumerosWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method 

		Random alt = new Random();
		int suma = 0;
		int num = alt.nextInt(50) + 1;
		
		do {
			suma += num;
			System.out.printf("Numero %d >> Suma %d%n", num, suma);
			num = alt.nextInt(51) + 1;
		}while(num != 25);
		

	}

}
