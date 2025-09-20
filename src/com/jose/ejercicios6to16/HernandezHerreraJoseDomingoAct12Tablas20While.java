package com.jose.ejercicios6to16;


public class HernandezHerreraJoseDomingoAct12Tablas20While {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int factor1 = 1;
		int factor2 = 1;

		
		while(factor1 < 21) {
			System.out.printf("%d x %d = %d%n", factor1, factor2, factor1 * factor2);
			factor2++;
			if(factor2 == 11){
				factor2 = 1;
				factor1++;
				System.out.println("---------------------------------");
				System.out.println("");
			}
		}

	}

}
