package com.jose.ejercicios6to16;

import java.util.Random;

public class HernandezHerreraJoseDomingoAct09Focos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Random alt = new Random();

		int numFraccionamiento = 3;
		int numCasas = 0;
		int numFocosTot = 0;
		int focosTot0 = 0;
		int focosTot1 = 0;
		int focosTot2 = 0;
		int focosTot3 = 0;

		String[] tipoFoco = { "10 wats", "20 wats", "30 wats", "40 wats" };

		for (int i = 1; i <= numFraccionamiento; i++) {
			int numCasasFra = 0;
			int numFocosFra = 0;
			int focosFra0 = 0;
			int focosFra1 = 0;
			int focosFra2 = 0;
			int focosFra3 = 0;

			int numCondomino = alt.nextInt(3) + 3;
			for (int j = 1; j <= numCondomino; j++) {
			
				int numManzanas = alt.nextInt(4) + 2;
				int numCasasTotales = numManzanas * 8;
				int numFocosCon = 0;
				int focosCon0 = 0;
				int focosCon1 = 0;
				int focosCon2 = 0;
				int focosCon3 = 0;
				numCasasFra += numCasasTotales;
				
				
				for (int k = 1; k <= numManzanas; k++) {
					int focosMan = 0;
					int focos0 = 0;
					int focos1 = 0;
					int focos2 = 0;
					int focos3 = 0;

					int numCasa = 8;
					for (int l = 1; l <= numCasa; l++) {

						System.out.printf("Fracc. %d, Condominio: %d, Manazana: %d, Casa: %d%n", i, j, k, l);

						int numFocos = alt.nextInt(7) + 2;
						int elecFoco = alt.nextInt(4);
						System.out.printf("Solicito %d focos del tipo %s.%n", numFocos, tipoFoco[elecFoco]);
						System.out.println("");

						focosMan += numFocos;
						
						switch (elecFoco) {
						case 0:
							focos0 += numFocos;
							break;
						case 1:
							focos1 += numFocos;
							break;
						case 2:
							focos2 += numFocos;
							break;
						case 3:
							focos3 += numFocos;
							break;
						}
						
					}
					numFocosCon += focosMan;
					focosCon0 += focos0;
					focosCon1 += focos1;
					focosCon2 += focos2;
					focosCon3 += focos3;

					System.out.printf("En la manzana %d del fracc %d se pideron %d focos en total.%n", k, i, focosMan);
					System.out.printf("Se pidieron %d de %s.%n", focos0, tipoFoco[0]);
					System.out.printf("Se pidieron %d de %s.%n", focos1, tipoFoco[1]);
					System.out.printf("Se pidieron %d de %s.%n", focos2, tipoFoco[2]);
					System.out.printf("Se pidieron %d de %s.%n", focos3, tipoFoco[3]);
					System.out.println("--------------------");
					System.out.println("");

				}
				
				numFocosFra += numFocosCon;
				focosFra0 += focosCon0;
				focosFra1 += focosCon1;
				focosFra2 += focosCon2;
				focosFra3 += focosCon3;
				
				System.out.println("================================================");
				System.out.printf("En el condominio %d del fracc %d hay %d casas en total y se entregaron %d focos en total.%n", j, i, numCasasTotales, numFocosCon);
				System.out.printf("De los cuales %d fueron de %s%n",focosCon0, tipoFoco[0]);
				System.out.printf("%d fueron de %s%n",focosCon1, tipoFoco[1]);
				System.out.printf("%d fueron de %s%n",focosCon2, tipoFoco[2]);
				System.out.printf("%d fueron de %s%n",focosCon3, tipoFoco[3]);
				System.out.println("================================================");
				System.out.println("");

			}
			
			numCasas += numCasasFra;
			numFocosTot +=numFocosFra;
			focosTot0 += focosFra0;
			focosTot1 += focosFra1;
			focosTot2 += focosFra2;
			focosTot3 += focosFra3;
			
			System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++");
			System.out.printf("En el fracc %d hay %d casas en total y se entregaron %d focos en total.%n", i, numCasasFra, numFocosFra);
			System.out.printf("De los cuales %d fueron de %s%n",focosFra0, tipoFoco[0]);
			System.out.printf("%d fueron de %s%n",focosFra1, tipoFoco[1]);
			System.out.printf("%d fueron de %s%n",focosFra2, tipoFoco[2]);
			System.out.printf("%d fueron de %s%n",focosFra3, tipoFoco[3]);
			System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++");
			System.out.println("");
			

		}
		System.out.println("///////////////////////////////////////////////////////");
		System.out.printf("En total en los 3 fracc hay %d casas y se entregaron %d focos en total.%n", numCasas, numFocosTot);
		System.out.printf("De los cuales %d fueron de %s%n",focosTot0, tipoFoco[0]);
		System.out.printf("%d fueron de %s%n",focosTot1, tipoFoco[1]);
		System.out.printf("%d fueron de %s%n",focosTot2, tipoFoco[2]);
		System.out.printf("%d fueron de %s%n",focosTot3, tipoFoco[3]);
		System.out.println("///////////////////////////////////////////////////////");
		System.out.println("");
	}

}
