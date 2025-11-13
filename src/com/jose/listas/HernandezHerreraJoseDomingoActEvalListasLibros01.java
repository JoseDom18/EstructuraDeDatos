package com.jose.listas;

import java.util.ArrayList;
import java.util.Optional;
import java.util.Scanner;

public class HernandezHerreraJoseDomingoActEvalListasLibros01 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		ArrayList<Libros> productos = new ArrayList<>();
		
		int opcion = 0;
		
		while(opcion != 6) {
			System.out.println("==MENÚ BIBLIOTECA==\n1. Agregar libro\n2. Mostrar libros\n3. Buscar libro\n4. Actualizar diponibilidad\n5. Eliminar libro\n6. Salir");
			System.out.print("Opción: ");
			opcion = s.nextInt();
			s.nextLine();
			
			switch (opcion) {
			case 1:
				agregar(productos, s);
				break;
			case 2:
				mostrar(productos);
				break;
			case 3:
				buscar(productos, s);
				break;
			case 4:
				actualizar(productos, s);
				break;
			case 5:
				eliminar(productos, s);
				break;
			case 6:
				System.out.println("Hasta luego. by mingood.");
				
			}
		}


	}

	public static void agregar(ArrayList<Libros> libros, Scanner s) {
		Libros l = new Libros();
		System.out.println("");
		System.out.println("\"Agregar Libro\"");
		System.out.print("Título: ");
		l.setTitulo(s.nextLine());
		System.out.print("Autor: ");
		l.setAutor(s.nextLine());
		
		libros.add(l);
		
		System.out.println("\n>>Libro agregado correctamente.");
		System.out.println("");
		
	}

	public static void mostrar(ArrayList<Libros> libros) {
		System.out.println("");
		System.out.println("\"Lista de Libros\"");
		libros.stream()
		.forEach(l -> System.out.println(l));
		System.out.println("");
		
		
	}

	public static void buscar(ArrayList<Libros> libros, Scanner s) {
		System.out.println("");
		
		System.out.println("\"Buscar libro por código\"");
		System.out.println("Ingrese el código a buscar: ");
		String buscado = s.nextLine();
		Optional<Libros> resultado = libros.stream()
		.filter(l -> l.getCodigo().equalsIgnoreCase(buscado))
		.findFirst();

		if(resultado.isPresent()) {
			Libros p = resultado.get();
			System.out.println(p);
		} else {
			System.out.println("No se encontro ningún libro.");
		}
		System.out.println("");
	}

	public static void actualizar(ArrayList<Libros> libros, Scanner s) {
		System.out.println("");
		System.out.println("\"Actualizar disponibilidad\"");
		System.out.println("Seleccione un libro por numero de lista");
		int n = 1;
		for(Libros l : libros) {
			System.out.printf("%d.- %s%n", n, l.getTitulo());
			n++;
		}
		
		System.out.print("Opción: ");
		
		int opcion = s.nextInt() - 1;
		s.nextLine();
		Libros l = libros.get(opcion);
		System.out.println(l.isDisponible()? "Este libro actuamente se encuentra disponible" : "Este libro actualmente se encuentra prestado");
		System.out.println("Desea cambiar su disponibilidad?(y/n)");
		String opc = s.nextLine();
		
		if (opc.equalsIgnoreCase("y")) {
			l.setDisponible(!l.isDisponible());
			System.out.println(l.isDisponible()? "El libro cambio a disponible." : "El libro cambio a prestado.");
		}else if(opc.equalsIgnoreCase("n")) {
			System.out.println("El libro mantiene su estado.");
		}else {
			System.out.println("Elige 'y' para si o 'n' para no.");
		}
		System.out.println("");
	}

	public static void eliminar(ArrayList<Libros> libros, Scanner s) {
		System.out.println("");
		System.out.println("\"Eliminar libro por código\"");
		System.out.print("Seleccione un libro por código para eliminar:");

		String buscado = s.nextLine();
		Optional<Libros> resultado = libros.stream()
		.filter(l -> l.getCodigo().equalsIgnoreCase(buscado))
		.findFirst();

		if(resultado.isPresent()) {
			Libros l = resultado.get();
			int indice = libros.indexOf(l);
			libros.remove(indice);
			System.out.printf("El %s fue eliminado%n", l);
		} else {
			System.out.println("No se encontro ningún libro.");
		}
		System.out.println("");

//		for(Libros l: libros ) {
//			if (l.getCodigo().e)
//		}
		
//		libros.remove(libros.indexOf())
		
	}

	private static class Libros{
		
		private static int id = 1;
		private String codigo;
		private String titulo;
		private String autor;
		private boolean disponible;
		
		public Libros() {
			this.codigo =id < 10? "L0" + id : "L" + id;
			id++;
			this.disponible = true;
		}

		public String getTitulo() {
			return titulo;
		}

		public void setTitulo(String titulo) {
			this.titulo = titulo;
		}


		public void setAutor(String autor) {
			this.autor = autor;
		}

		public boolean isDisponible() {
			return disponible;
		}

		public void setDisponible(boolean disponible) {
			this.disponible = disponible;
		}

		public String getCodigo() {
			return codigo;
		}

		@Override
		public String toString() {
			return codigo + " - " + titulo + " - " + autor + " - Disponible: " + disponible;

		}

		
		
	}

}

