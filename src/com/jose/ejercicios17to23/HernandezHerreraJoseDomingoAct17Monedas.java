package com.jose.ejercicios17to23;

import java.util.Random;

public class HernandezHerreraJoseDomingoAct17Monedas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Random alt = new Random();
		int agui = 0;
		int sol = 0;
		String[] lado = {"Aguila", "sol"};

		 for(int i = 0; i < 10; i++) {
			 int moneda = alt.nextInt(2);
			 if (moneda == 0) {
				 agui++;
				 System.out.printf("%d.- Cayó %s%n", i+1, lado[moneda]);
			 } else {
				 sol++;
				 System.out.printf("%d.- Cayó %s%n", i+1, lado[moneda]);
			 }
		 }
		 
		 System.out.printf("Cayeron %d veces aguila.%n", agui);
		 System.out.printf("Cayeron %d veces sol.%n", sol);

	}

}
