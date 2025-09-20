package com.jose.ejercicios6to16;

import java.util.Random;

public class HernandezHerreraJoseDomingoAct13AhorroDiario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Random alt = new Random();
		int meta = 1000;
		int ahorroTotal = 0;
		int dia = 1;
		
		while(ahorroTotal <= meta) {
			int ahorroDiario = alt.nextInt(101);
			ahorroTotal += ahorroDiario;
			System.out.printf("Dia %d ahorro: %d, ahorro total: %d%n", dia, ahorroDiario, ahorroTotal);
			dia++;
			
		}

	}

}
