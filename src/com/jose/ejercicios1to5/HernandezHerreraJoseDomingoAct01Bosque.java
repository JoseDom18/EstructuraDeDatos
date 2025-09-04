package com.jose.ejercicios1to5;

import java.text.DecimalFormat;
import java.util.Random;

public class HernandezHerreraJoseDomingoAct01Bosque {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Random aleatorio = new Random();
		DecimalFormat f = new DecimalFormat("###,###,###");
		int numHect = aleatorio.nextInt(100) + 30;
		int numMetros = numHect * 10000;
		
		System.out.println("Número de hectáreas: " + numHect);
		System.out.println("Metros cuadrados: " + f.format(numMetros));
		
		double metrosPino = 0;
		double metrosOyamel = 0;
		double metrosCedro = 0;

		if (numHect <= 100) {
			metrosPino = numMetros * .40;
			metrosOyamel = numMetros * .40;
			metrosCedro = numMetros * .20;
		} else {
			metrosPino = numMetros * .50;
			metrosOyamel = numMetros * .30;
			metrosCedro = numMetros * .20;
		}
		
		
		System.out.println("El número de Pinos que se deben plantar son: " + (metrosPino / 10) * 8);
		System.out.println("El número de Oyamel que se deben plantar son: " + (metrosOyamel / 15) * 15);
		System.out.println("El número de Cedro que se deben plantar son: " + (metrosCedro / 18) * 10);
		
	}

}
