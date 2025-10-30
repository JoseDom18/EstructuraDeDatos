package com.jose.listas;

import java.util.ArrayList;
import java.util.Random;

public class HernandezHerreraJoseDomingoAct35ListasPasarAMatriz {

	public static void main(String[] args) {

		int numero = cuadradoRandom(4, 9);
		ArrayList<Integer> lista = listaNumeros(numero, 1, 9);
		System.out.println(lista);
		System.out.println("Tamaño: " + lista.size());
		int inicio = 0;
		int fin = lista.size() - 1;
		int[][] matriz = matriz(inicio, fin, numero, lista);
		imprimirMatriz(matriz);
	}

	/**
	 * Metodo para sacar el numero cuadrado random
	 * 
	 * @param min numero minimo del rango
	 * @param max numero maximo del rango
	 * @return regresa el cuadrado de un numero random generado dentro de cierto rango
	 */
	public static int cuadradoRandom (int min, int max) {
		int cuadradoRandom = new Random().nextInt(max - min + 1) + min;
		cuadradoRandom *= cuadradoRandom;
		return cuadradoRandom;
	}

	/**
	 * Metodo para llenar la lista con un rango de numeros
	 * 
	 * @param size escoge el tamaño de la lista
	 * @param minRango numero minimo del rango
	 * @param maxRango numero maximo del rango
	 * @return una lista llena con numero random dentro de cierto rango
	 */
	public static ArrayList<Integer> listaNumeros (int size, int minRango, int maxRango) {
		ArrayList<Integer> listaLlena = new ArrayList<>();
		
		for (int i = 0; i < size; i++) {
			int random = new Random().nextInt(maxRango - minRango + 1) + minRango;
			listaLlena.add(random);
		}

		return listaLlena;
		
	}
	
	/**
	 * Devuelve el primer valor de la lista
	 * @param lista de la cual se extraeran los valores
	 * @return regresa el primer numero de la lista
	 */
	public static int devolverPrimero(ArrayList<Integer> lista) {

		return lista.remove(0);

	}

	/**
	 * Devuelve el ultimo numero de la lista
	 * @param lista de la cual se extraeran los valores
	 * @return devuelve el ultimo valo de la lista
	 */
	public static int devolverUltimo(ArrayList<Integer> lista) {

		int ultimo = lista.size() - 1;
		return lista.remove(ultimo);

	}

	/**
	 * crea una matriz y copia los numeros
	 * 
	 * @param inicio de la lista
	 * @param fin de la lista
	 * @param cuadrado numero cuadrado de la lista
	 * @param lista lista de numeros
	 * @return regresa una matriz 
	 */
	public static int[][] matriz(int inicio, int fin, int cuadrado, ArrayList<Integer> lista) {

		int num = 1;
		while (cuadrado / num != num) {
			num++;
		}
		boolean primero = true;
		boolean ultimo = false;

		int[][] matrizNumeros = new int[num][num];
		
		while (inicio <= fin) {
			for(int i = 0; i < matrizNumeros.length; i++) {
				for (int j = 0; j < matrizNumeros[0].length; j++) {
					if(primero) {
						matrizNumeros[i][j] = lista.get(inicio);
						inicio++;
	 					primero = false;
	 					ultimo = true;
					} else if (ultimo) {
						matrizNumeros[i][j] = lista.get(fin);
						fin--;
						primero = true;
						ultimo = false;

					}
					
				}
			}
		}
		return matrizNumeros;
	}

	/**
	 * imprime la matriz en terminal
	 * 
	 * @param matriz requerida
	 */
	public static void imprimirMatriz(int[][] matriz) {
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[0].length; j++) {
				System.out.printf("[%d]", matriz[i][j]);
			}
			System.out.println("");
		}
	}
}


