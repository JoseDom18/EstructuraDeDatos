package com.jose.pilas;
import java.util.ArrayList;
import java.util.Random;
import java.util.Stack;

public class HernandezHerreraJoseDomingoAct36PilasLibros {

	public static void main(String[] args) {

		// Lista por entregar 
		ArrayList<Libros> porEntregar = new ArrayList<>();

		// Lista para Ciencias sociales
		ArrayList<Libros> cienciasSociales = new ArrayList<>();

		// Lista para Ciencias Naturales
		ArrayList<Libros> cienciasNaturales = new ArrayList<>();

		// Lista para Informática
		ArrayList<Libros> informatica = new ArrayList<>();

		// Lista para Ciencias Exactas
		ArrayList<Libros> cienciasExactas = new ArrayList<>();

		// Crar pila de bibloteca
		Stack<Libros> biblioteca = new Stack<>();

		// Costo de libros
		int costoLibros = 0;

		// Variable random
		Random r = new Random();

		// Llenar lista de libros ramdom
		for (int i = 0; i < 15; i++) {
			Libros libro = new Libros();

			porEntregar.add(libro);

		}


		while(!porEntregar.isEmpty()) { // Mientras la lista por entregar no este vacia

			int salirEntrar = r.nextInt(2); // seleccicona salir(1) o entrar(0)

//			System.out.printf("cayo: %d%n",salirEntrar);
			
			if (salirEntrar == 0) { // Entrar

				if(biblioteca.size() < 5) {
					costoLibros += Libros.entregarLibro(porEntregar, biblioteca);
				} else {
					System.out.println("Pila llena");
				}

			} else { // Acomodar

				if (!biblioteca.isEmpty()) {
					Libros.acomodarLibro(biblioteca, cienciasSociales, cienciasNaturales, informatica, cienciasExactas);
				} else {
					System.out.println("Pila vacía");
					// Si la pila esta vacia y aun hay libros por entregar la unica accion a realizar en entregar
					costoLibros += Libros.entregarLibro(porEntregar, biblioteca);
				}
			}
		}

		// Revisar si la pila aun tiene libros por sacar
		while (!biblioteca.isEmpty()) {
			Libros.acomodarLibro(biblioteca, cienciasSociales, cienciasNaturales, informatica, cienciasExactas);
		}

		// Imprimir final
		System.out.printf("Costo total de Libros: $%d.00%n%n", costoLibros);
		Libros.imprimirListas(cienciasSociales);
		Libros.imprimirListas(cienciasNaturales);
		Libros.imprimirListas(informatica);
		Libros.imprimirListas(cienciasExactas);
	}

}

class Libros {
	private String nombre;
	private int costo;
	private Categoria categoria;
	private static int numero = 1;

	public Libros() {
		this.nombre = numero < 10 ?  "Libro 0" + numero : "Libro " + numero;
		this.costo = ((new Random().nextInt(6) + 1) * 50 )+ 300;
		this.categoria = Categoria.getCategiraRandom();

		numero++;
	}

	@Override
	public String toString() {
		return "Llegando " + nombre + " Costo: $" + costo + ".00 Categoria: " + categoria;
	}

	public String getNombre() {
		return nombre;
	}

	public int getCosto() {
		return costo;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	/**
	 * Entrega libros a la pila de la bibloteca y los saca de la lista de libros a entregar
	 * @param porEntregar lista de libros 
	 * @param biblioteca stack de libros
	 * @param costoLibros suma de costo de libros
	 */
	public static int entregarLibro(ArrayList<Libros> porEntregar, Stack<Libros> biblioteca) {
				// Libro para entregar
				Libros entregado = porEntregar.remove(0);
//				System.out.printf("costo: %d%n", entregado.getCosto());

				// Libro que entra a la pila
				biblioteca.push(entregado);

				// Imprimir informacion de libro que entra
				System.out.println(entregado);

				// Sumar precio de libro
				return entregado.getCosto();
	}

	/**
	 * Acomoda los libros por categorias en sus listas correspondientes
	 * @param biblioteca stack de libros en biblioteca
	 * @param cienciasSociales lista de libros de ciencias sociales
	 * @param cienciasNaturales lista de libros de ciencias naturales
	 * @param informatica lista de libros de informatica
	 * @param cienciasExactas lista de libros de ciencias exactas
	 */
	public static void acomodarLibro(Stack<Libros> biblioteca, ArrayList<Libros> cienciasSociales, ArrayList<Libros> cienciasNaturales, ArrayList<Libros> informatica, ArrayList<Libros> cienciasExactas) {
				// Libro sacado para acomodar
				Libros acomodado = biblioteca.pop();

				// Imprimir salida
				System.out.println("Sacando " + acomodado.getNombre());

				// Acomodo por categoria
				if(acomodado.getCategoria() == Categoria.CIENCIAS_SOCIALES) {
					cienciasSociales.add(acomodado);
				} else if (acomodado.getCategoria() == Categoria.CIENCIAS_NATURALES) {
					cienciasNaturales.add(acomodado);
				} else if (acomodado.getCategoria() == Categoria.INFORMATICA) {
					informatica.add(acomodado);
				} else {
					cienciasExactas.add(acomodado);
				}
	}

	public static void imprimirListas(ArrayList<Libros> lista) {
		if (!lista.isEmpty()) {
			System.out.printf("Libros de %s %d%n", lista.get(0).getCategoria(), lista.size());
			for(Libros l : lista) {
				System.out.println(l);
			}
			System.out.println("");
		}
	}

}

enum Categoria{
	CIENCIAS_SOCIALES,
	CIENCIAS_NATURALES,
	INFORMATICA,
	CIENCIAS_EXACTAS;

	private static final Categoria[] VALORES = Categoria.values();

	private static final int TAMANO = VALORES.length;

	private static final Random RANDOM = new Random();

	public static Categoria getCategiraRandom() {
		return VALORES[RANDOM.nextInt(TAMANO)];
	}
}