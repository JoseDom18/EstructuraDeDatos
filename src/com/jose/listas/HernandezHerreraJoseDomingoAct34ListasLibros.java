package com.jose.listas;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class HernandezHerreraJoseDomingoAct34ListasLibros {

	public static void main(String[] args) {

		ArrayList<String> librosM = new ArrayList<>(List.of("Español 5", "Matemáticas 5", "Sociales 5", "C. Naturales 5", "Informática 5", "Inglés 5", "Francés 5", "Música 5", "Geografía 5", "E. Física 5"));
		ArrayList<String> librosJ = new ArrayList<>(List.of("Español 3", "Matemáticas 3", "Sociales 3", "C. Naturales 3", "Informática 3", "Inglés 3", "Francés 3", "Música 3", "Geografía 3", "E. Física 3"));

		Hijos juan = new Hijos("Juan", librosJ);
		Hijos maria = new Hijos("Maria", librosM);

		Hijos[] hijos = {juan, maria};
		while (!librosM.isEmpty() && !librosJ.isEmpty()) {

			int hijoSeleccionado = elegirHijo(hijos);
			int libroSeleccionado = new Random().nextInt(hijos[hijoSeleccionado].getLibros().size());
			String libroEncontrado = hijos[hijoSeleccionado].getLibros().remove(libroSeleccionado); 

			System.out.printf("Se encontro el libro: %s de %s%n", libroEncontrado, hijos[hijoSeleccionado].getNombre());
			System.out.println("");
			if(hijos[0].getLibros().isEmpty()) {
				System.out.printf("Se ha completado la lista de %s%n", hijos[0].getNombre());
				System.out.printf("Los libros que faltaron de %s son : %s", hijos[1].getNombre(), hijos[1].getLibros());
			} else if (hijos[1].getLibros().isEmpty()) {
				System.out.printf("Se ha completado la lista de %s%n", hijos[1].getNombre());
				System.out.printf("Los libros que faltaron de %s son : %s", hijos[0].getNombre(), hijos[0].getLibros());
			} else {
				System.out.println("Lista de Juan: " + hijos[0].getLibros());
				System.out.println("Lista de Maria: " + hijos[1].getLibros());
				System.out.println("");

			}
		}


	}

	public static int elegirHijo(Hijos[] hijos) {
		int n = new Random().nextInt(hijos.length);
		return n; 
	}



}

class Hijos{
	private String nombre;
	private ArrayList<String> libros;

	public Hijos(String nombre, ArrayList<String> libros) {
		this.nombre = nombre;
		this.libros = libros;
	}

	public String getNombre() {
		return nombre;
	}

	public ArrayList<String> getLibros() {
		return libros;
	}

}