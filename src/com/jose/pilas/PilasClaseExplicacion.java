package com.jose.pilas;

import java.util.Stack;

public class PilasClaseExplicacion {

	public static void main(String[] args) {

		// Metodos mas usados
		/**
		 * .push() Agregar elemento
		 * .pop() extraer y eliminar el ultimo elemento agregado.
		 * .peek() conocer el ultimo elemento agregado.
		 * .empty() si esta vacia retorna true.
		 * .seach() verifica un elemento y regresa el valor donde se encuentra.
		 * .contains() retorna valor logico si el elemento se contiene.
		 * .size() conoce el tamaño de la lista
		 * 
		 * 
		 */

		// clase Stack
		Stack<String> pila = new Stack<String>();
		pila.push("hola");
		pila.push("mundo");
		
		for(String w : pila) {
			System.out.println(w);
		}
	}

}
