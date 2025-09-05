package com.jose.ejercicios1to5;

import java.util.ArrayList;
import java.util.Random;

public class HernandezHerreraJoseDomingoAct04PromedioPesos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Random aleatorio = new Random();
		ArrayList<Persona> personas = new ArrayList<>();
		int edad;
		int peso;

		// Crear lista de personas con numeros random

		for (int i = 0; i < 50; i++) {
			edad = aleatorio.nextInt(101);

			if (edad <= 6)
				peso = aleatorio.nextInt(12) + 1;
			else if (edad <= 12)
				peso = aleatorio.nextInt(41) + 10;
			else
				peso = aleatorio.nextInt(81) + 40;

			personas.add(new Persona(edad, peso));
		}

		// Calcular promedio de peso por categoria
		int totalInfantes = 0;
		int totalNinos = 0;
		int totalJovenes = 0;
		int totalAdultos = 0;
		int totalViejos = 0;

		int sumaPInfantes = 0;
		int sumaPNinos = 0;
		int sumaPJovenes = 0;
		int sumaPAdultos = 0;
		int sumaPViejos = 0;

		for (Persona p : personas) {
			switch (p.getCategoria()) {
			case "Infantes":
				totalInfantes++;
				sumaPInfantes += p.getPeso();
				break;
			case "Niños":
				totalNinos++;
				sumaPNinos += p.getPeso();
				break;
			case "Jóvenes":
				totalJovenes++;
				sumaPJovenes += p.getPeso();
				break;
			case "Adultos":
				totalAdultos++;
				sumaPAdultos += p.getPeso();
				break;
			case "Viejos":
				totalViejos++;
				sumaPViejos += p.getPeso();
			}
		}

		// imprimir personas
		for (Persona p : personas) {
			System.out.printf("Número de id: %d, Categoría: %s, Edad: %d, Peso: %d%n", p.getNumero(), p.getCategoria(),
					p.getEdad(), p.getPeso());
		}

		double promInfantes = sumaPInfantes / totalInfantes;
		double promNinos = sumaPNinos / totalNinos;
		double promJovenes = sumaPJovenes / totalJovenes;
		double promAdultos = sumaPAdultos / totalAdultos;
		double promViejos = sumaPViejos / totalViejos;
		
		// imprimir promedio de pesos por categoria
		if (totalInfantes != 0) System.out.printf("Total de infantes %d, suma de peso %d kg y promedio de peso %.2f kg.%n", totalInfantes, sumaPInfantes, promInfantes);
		else System.out.println("No se registro ningún Infante.");
		if (totalNinos != 0) System.out.printf("Total de Niños %d, suma de peso %d kg y promedio de peso %.2f kg.%n", totalNinos, sumaPNinos, promNinos);
		else System.out.println("No se registro ningún Niño.");
		if (totalJovenes != 0) System.out.printf("Total de Jóvenes %d, suma de peso %d kg y promedio de peso %.2f kg.%n", totalJovenes, sumaPJovenes, promJovenes);
		else System.out.println("No se registro ningún Jóvenes.");
		if (totalAdultos != 0) System.out.printf("Total de Adultos %d, suma de peso %d kg y promedio de peso %.2f kg.%n", totalAdultos, sumaPAdultos, promAdultos);
		else System.out.println("No se registro ningún Adulto.");
		if (totalViejos != 0) System.out.printf("Total de Viejos %d, suma de peso %d kg y promedio de peso %.2f kg.%n", totalViejos, sumaPViejos, promViejos);
		else System.out.println("No se registro ningún Viejo.");
		

		// imprimir promedio de pesos por categoria
//		System.out.printf(
//				"Total de infantes: %d, la suma total de peso: %d y el promedio: %.2f%nTotal de Niños: %d, la suma total de peso: %d y el promedio: %.2f%nTotal de Jóvenes: %d, la suma total de peso: %d y el promedio: %.2f%nTotal de Adultos: %d, la suma total de peso: %d y el promedio: %.2f%nTotal de Viejos: %d, la suma total de peso: %d y el promedio: %.2f%n", totalInfantes, sumaPInfantes, promInfantes, totalNinos, sumaPNinos, promNinos, totalJovenes, sumaPJovenes, promJovenes, totalAdultos, sumaPAdultos, promAdultos, totalViejos, sumaPViejos, promViejos);

	}

}

class Persona {
	private static int id = 0;
	private int numero;
	private String categoria;
	private int edad;
	private int peso;

	public Persona(int edad, int peso) {
		id++;
		this.numero = id;
		if (edad <= 6)
			this.categoria = "Infantes";
		else if (edad <= 12)
			this.categoria = "Niños";
		else if (edad <= 29)
			this.categoria = "Jóvenes";
		else if (edad <= 59)
			this.categoria = "Adultos";
		else
			this.categoria = "Viejos";
		this.edad = edad;
		this.peso = peso;
	}

	public int getNumero() {
		return numero;
	}

	public String getCategoria() {
		return categoria;
	}

	public int getEdad() {
		return edad;
	}

	public int getPeso() {
		return peso;
	}

}
