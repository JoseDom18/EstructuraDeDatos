package com.jose.ejerciciosClase;

public class Ordenacion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num = { 4, 6, 34, 3, 8, 65, 37 };
//		burbuja(num);
		imprimir(num);
		System.out.println("");
//		insercion(num);
		insercionMejorada(num);
		imprimir(num);
	}

	public static void burbuja(int[] n) {
		boolean intercambio; // bandera para saber si se hicieron intercambios
		for (int i = 0; i < n.length; i++) { // controla el numero de pasadas
			intercambio = false; // resetea el intercambio a falso para saber si en esta pasada cambiara
			for (int j = 0; j < n.length - i - 1; j++) {
				if (n[j] > n[j + 1]) { // pregunta si el valor es mayor o menor que el de alado
					int aux = n[j];   // metodo de intercambio
					n[j] = n[j + 1];
					n[j + 1] = aux;
					intercambio = true; // si ocurre un intercambio cambia a true
				} 
			}
				if (!intercambio) // pregunta si hubieron intercambios si hubieron el ciclo continua si no hubieron se termina
					break;
		}
	}

	public static void insercion(int[] n) {
		for(int i = 1; i < n.length; i++) { // considerar un seccion como ordenada, un bloque de un elemento
			int aux = n[i]; // guardar la variable para comparar con el bloque "ordenado" (los de la izquierda)
			int j = i - 1; // crear una varible para revisar el bloque izquierdo
			while (j >= 0 && n[j] > aux) { // condicion para un ciclo que este activo mientras no se salga de 0 y el indice izquierdo sea mayor que la variable elegida
				n[j + 1] = n[j]; // si la condicion se cumple mover la variable de la izquierda a la derecha para generar espacio
				j--; // comparar con el siguiete valor mover el apuntador 1 a la izquierda
			}
			n[j + 1] = aux; // almacenamos el valor en el hueco, j queda "antes" del hueco creado
		}
	}

	public static void insercionMejorada(int[] n) {
		for(int i = 1; i < n.length; i++) { // considerar un seccion como ordenada, un bloque de un elemento
			int inicio = 0; // localizamos el inicio de la sublista
			int fin = i - 1; // lacalizamos el fin de la sublista
			int insercion = i;
			int aux = n[i]; 
			while (inicio <= fin) { // si inicio es menor igual que fin hacemos las acciones 
				int medio = inicio + (fin - inicio) / 2; // localizamos el punto medio de la sublista
				if(n[medio] > aux) fin = medio - 1; // si la mitad de la sublista es mayor que aux nos centraremos en la parte izquierda de la sublista
				else inicio = medio + 1;
			}
			insercion = inicio;
			for (int j = i; j > insercion; j--) n[j] = n[j - 1];
			n[insercion] = aux;
		}
	}

	public static void imprimir(int[] n) {
		for (int i = 0; i < n.length; i++) {
				System.out.printf("[%2d]", n[i]);
		}
	}

}
