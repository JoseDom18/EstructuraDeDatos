package com.estructuras.arrays;

import java.util.Random;

public class HernandezHerreraJoseDomingoAct02MayorTres {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num1;
		int num2;
		int num3;
		Random aleatorio = new Random();
		
		do {
			
			num1= aleatorio.nextInt(5) + 1;
			num2= aleatorio.nextInt(5) + 1;
			num3= aleatorio.nextInt(5) + 1;
			
			System.out.println("Se generaron 3 números aleatorios: " + num1 + ", " + num2 + ", " + num3);
			if (num1 == num2 || num2 == num3 || num1 == num3) System.out.println("Los numeros son iguales se volveran a generar.");
			else {
				int max = num1;
				if(num2 > max) max = num2;
				if(num3 > max) max = num3;
				System.out.println("El numero mayor es: " + max);
			}
		} while (num1 == num2 || num2 == num3 || num1 == num3);
			
		
			
		
	}

}
