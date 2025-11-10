package com.jose.pilas;

import java.util.Stack;

public class HernandezHerreraJoseDomingoAct37PilasExpresion {

	public static void main(String[] args) {

		String cadena = "{50 + x} - [200 - (23 + x)]";
		System.out.println("Es correcta la cadena? " + parentesis(cadena));
		
	}

	public static boolean parentesis(String cadena) {

		Stack<Character> pila = new Stack<>();
		
		for (int i = 0; i < cadena.length(); i++) {
			
			if(cadena.charAt(i) == '(' || cadena.charAt(i) == '{' || cadena.charAt(i) == '[') {
				pila.push(cadena.charAt(i));
			} else if (cadena.charAt(i) == ')') {
				if (pila.isEmpty() || pila.pop() != '(') return false;
			} else if (cadena.charAt(i) == '}') {
				if (pila.isEmpty() || pila.pop() != '{') return false;
			} else if (cadena.charAt(i) == ']') {
				if (pila.isEmpty() || pila.pop() != '[') return false;
			} 
		}

		return pila.isEmpty();
	}
}
