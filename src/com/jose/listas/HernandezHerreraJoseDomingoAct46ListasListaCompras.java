package com.jose.listas;

import java.util.ArrayList;
import java.util.Random;

public class HernandezHerreraJoseDomingoAct46ListasListaCompras {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ArrayList<String> lo = new ArrayList<String>();
		ArrayList<String> ln = new ArrayList<String>();
		compras(lo, ln);
		
		
		

	}

	public static void compras(ArrayList<String> lo, ArrayList<String> ln) throws InterruptedException {
		
		lo.add("Frijol");
		lo.add("Arroz");
		lo.add("Azúcar");
		lo.add("Aceite");
		lo.add("Huevos");
		lo.add("Sal");
		lo.add("Cebolla");
		lo.add("Aguacate");
		lo.add("Limón");
		lo.add("Repollo");
		lo.add("Queso Amarillo");
		lo.add("Queso Oaxaca");
		lo.add("Chorizo");
		lo.add("Coca Cola");

		while(!lo.isEmpty()) {
			String encontrado;
			int num = new Random().nextInt(lo.size());
			encontrado = lo.remove(num);
			System.out.printf("Articulo encontrado: %s%n", encontrado);
			ln.add(encontrado);
			System.out.printf("Tamaño lista original: %d%n", lo.size());
			System.out.printf("Tamaño lista nueva: %d%n", ln.size());
		Thread.sleep(500);
		}
	}

}
