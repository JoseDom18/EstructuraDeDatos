package com.jose.pilas;

import java.util.ArrayList;
import java.util.Random;
import java.util.Stack;

public class HernandezHerreraJoseDomingoAct38PilasSacosAlimentos {

	public static void main(String[] args) {

		// Pila de sacos
		Stack<SacosAlimentos> pila = new Stack<>();

		// Limite de pila
		int limite = 4;

		// Almacenamiento de sacos
		ArrayList<SacosAlimentos> lista = new ArrayList<>();

		// Numero de sacos
		int numSacos = 20;

		// Llenar lista
		for(int i = 0; i < numSacos; i++) {
			SacosAlimentos alimento = new SacosAlimentos();
			lista.add(alimento);
		}

		while(!lista.isEmpty()) {
			int descargarAcomodar = new Random().nextInt(2);

			if(descargarAcomodar == 0) { // Descargar

				if(pila.size() < limite) {
					SacosAlimentos.descargar(pila, lista);
					SacosAlimentos.estadoPila(pila);
				}else {
					System.out.println("Pila llena.");
					SacosAlimentos.acomodar(pila, lista);
				}
			}else { // Acomodar
				if(!pila.isEmpty()) {
					SacosAlimentos.acomodar(pila, lista);
					SacosAlimentos.estadoPila(pila);
				}else {
					System.out.println("Pila vacia.");
					System.out.println("");
					SacosAlimentos.descargar(pila, lista);
					System.out.println("");
					SacosAlimentos.estadoPila(pila);
				}
			}
		}

		while(!pila.isEmpty()) {
				SacosAlimentos.acomodar(pila, lista);
		}


	}
}

	class SacosAlimentos {
		private Tipo tipo; 

		public SacosAlimentos() {
			this.tipo = Tipo.obtenerRandom();
		}

		public static void estadoPila(Stack<SacosAlimentos> pila) {

			System.out.println("Estado de la pila");
			if(pila.isEmpty()) System.out.println("Pila vacia");
			else System.out.println("Pila con " + pila.size() + " sacos");

			for(int i = pila.size() - 1; i >= 0; i--) {

				System.out.println(pila.get(i));
			}
			System.out.println("");
		}

		public static void descargar(Stack<SacosAlimentos> pila, ArrayList<SacosAlimentos> lista) {
			SacosAlimentos saco = lista.removeLast();
			pila.push(saco);
			System.out.println("Se descargo " + saco);
			System.out.println("");
		}

		public static void acomodar(Stack<SacosAlimentos> pila, ArrayList<SacosAlimentos> lista) {
			SacosAlimentos saco = pila.pop();
			System.out.println("Se acomodo " + saco);
		}

		@Override
		public String toString() {
			return "Saco de alimento para " + tipo;
		}

		public Tipo getTipo() {
			return tipo;
		}


	}

	enum Tipo {
		CERDOS,
		POLLOS,
		PERROS,
		GATOS;

		private static final Random r = new Random();
		private static final Tipo[] VALUES = Tipo.values();
		private static final int NUMERO = VALUES.length;

		public static Tipo obtenerRandom() {
			return VALUES[r.nextInt(NUMERO)];
		}
	}