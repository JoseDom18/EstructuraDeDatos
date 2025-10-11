package com.jose.ejerciciosClase;

public class Ordenamiento {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num = { 4, 6, 34, 3, 8, 65, 37 };
//		burbuja(num);
		imprimir(num);
		System.out.println("");
//		insercion(num);
//		insercionMejorada(num);
//		seleccion(num);
		shell(num);
		imprimir(num);
	}

	public static void burbuja(int[] n) {
		boolean intercambio; // bandera para saber si se hicieron intercambios
		for (int i = 0; i < n.length; i++) { // controla el numero de pasadas
			intercambio = false; // resetea el intercambio a falso para saber si en esta pasada cambiara
			for (int j = 0; j < n.length - i - 1; j++) {
				if (n[j] > n[j + 1]) { // pregunta si el valor es mayor o menor que el de alado
					int aux = n[j]; // metodo de intercambio
					n[j] = n[j + 1];
					n[j + 1] = aux;
					intercambio = true; // si ocurre un intercambio cambia a true
				}
			}
			if (!intercambio) // pregunta si hubieron intercambios si hubieron el ciclo continua si no
								// hubieron se termina
				break;
		}
	}

	public static void insercion(int[] n) {
		for (int i = 1; i < n.length; i++) { // considerar un seccion como ordenada, un bloque de un elemento
			int aux = n[i]; // guardar la variable para comparar con el bloque "ordenado" (los de la
							// izquierda)
			int j = i - 1; // crear una varible para revisar el bloque izquierdo
			while (j >= 0 && n[j] > aux) { // condicion para un ciclo que este activo mientras no se salga de 0 y el
											// indice izquierdo sea mayor que la variable elegida
				n[j + 1] = n[j]; // si la condicion se cumple mover la variable de la izquierda a la derecha para
									// generar espacio
				j--; // comparar con el siguiete valor mover el apuntador 1 a la izquierda
			}
			n[j + 1] = aux; // almacenamos el valor en el hueco, j queda "antes" del hueco creado
		}
	}

	public static void insercionMejorada(int[] n) {
		for (int i = 1; i < n.length; i++) { // considerar un seccion como ordenada, un bloque de un elemento
			int inicio = 0; // localizamos el inicio de la sublista
			int fin = i - 1; // lacalizamos el fin de la sublista
			int insercion = i;
			int aux = n[i];
			while (inicio <= fin) { // si inicio es menor igual que fin hacemos las acciones
				int medio = inicio + (fin - inicio) / 2; // localizamos el punto medio de la sublista
				if (n[medio] > aux)
					fin = medio - 1; // si la mitad de la sublista es mayor que aux nos centraremos en la parte
										// izquierda de la sublista
				else
					inicio = medio + 1;
			}
			insercion = inicio;
			for (int j = i; j > insercion; j--)
				n[j] = n[j - 1];
			n[insercion] = aux;
		}
	}

	/**
	 * Se encarga de dividir el arreglo en dos parte ordenada y desordenada
	 * 
	 * @param n
	 */
	public static void seleccion(int[] n) {
		for (int i = 0; i < n.length - 1; i++) { // este es el loop de la parte ordenada del primero al penultimo
			int minIndex = i; // inferir que el indice uno el el menor
			for (int j = i + 1; j < n.length; j++) { // loop interior que reocorre la parte desordenada
				if (n[minIndex] > n[j]) { // si se encuentra un numero menor que minIndex se actualiza la posicion del
											// menor
					minIndex = j; // se actualiza la posicion del menor
				}
			}
			if (minIndex != i) { // si la posicion menor es diferente se procede al intercambio
				int aux = n[i]; // se guarda la posicion actual para intercambiar
				n[i] = n[minIndex]; // se mueve el valor del indice menor al indice actual
				n[minIndex] = aux; // se guarda el indice actual en el indice encontrado
			}
		}

	}

	public static void shell(int[] n) {
		for(int gap = n.length / 2; gap > 0; gap /= 2) { // loop grande que genera los intervalos mientras sea 1
			for (int i = gap; i < n.length; i++) { // segundo loop que se muve desde el gap hasta el final del array formando las parejas
				int aux = n[i]; // se porteje el valor a comparar en un aux
				int j; // se inicializa j para usarlo en este scoop
				
				for (j = i; j >= gap && aux < n[j - gap]; j -= gap) {
					n[j] = n[j - gap];
				}
				
				n[j] = aux;
			}
			
		}
	}

	public static void imprimir(int[] n) {
		for (int i = 0; i < n.length; i++) {
			System.out.printf("[%2d]", n[i]);
		}
	}

}
