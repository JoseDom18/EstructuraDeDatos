package com.jose.pilas;

import java.util.Stack;

public class PilasClaseExplicacion {

	public static void main(String[] args) {

		// clase Stack
		Stack<String> pila = new Stack<String>();
		pila.push("hola");
		pila.push("mundo");
		
		for(String w : pila) {
			System.out.println(w);
		}
	}

}
