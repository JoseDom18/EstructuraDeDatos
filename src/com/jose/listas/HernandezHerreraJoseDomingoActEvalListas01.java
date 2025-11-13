package com.jose.listas;

import java.util.ArrayList;
import java.util.Optional;
import java.util.Scanner;

public class HernandezHerreraJoseDomingoActEvalListas01 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);

		ArrayList<Producto> productos = new ArrayList<>();
		
		int opcion = 0;
		
		while(opcion != 6) {
			System.out.println("==MENÚ TIENDA==\n1. Agregar producto\n2. Mostrar todos los productos\n3. Buscar productos por código\n4. Actualizar precio de un producto\n5. Eliminar producto por código\n6. Salir");
			System.out.println("Opción: ");
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

	private static void agregar(ArrayList<Producto> productos, Scanner s) {
		Producto p = new Producto();
		System.out.println("\"Agregar nuevo producto\"");
		System.out.println("Nombre: ");
		p.setNombre(s.nextLine());
		System.out.println("Precio: ");
		p.setPrecio(s.nextDouble());
		System.out.printf("Código: %s%n%n", p.getCodigo());
		
		productos.add(p);
		
	}

	private static void mostrar(ArrayList<Producto> productos) {
		System.out.println("\"Lista de productos\"");
		productos.stream()
		.forEach(producto -> System.out.println(producto));
		System.out.println("");
	}

	private static void buscar(ArrayList<Producto> productos, Scanner s) {
		System.out.println("\"Buscar producto por código\"");
		System.out.println("Ingrese el código a buscar: ");
		String buscado = s.nextLine();
		Optional<Producto> resultado = productos.stream()
		.filter(producto -> producto.getCodigo().equalsIgnoreCase(buscado))
		.findFirst();

		if(resultado.isPresent()) {
			Producto p = resultado.get();
			System.out.println(p);
		} else {
			System.out.println("No se encontro ningún producto.");
		}
		System.out.println("");
		
		
	}

	private static void actualizar(ArrayList<Producto> productos, Scanner s) {
		System.out.println("\"Actualizar producto\"");
		int n = 1;
		for(Producto p : productos) {
			System.out.printf("%d.- %s%n%n", n, p);
			n++;
		
		}
		
		
	}

	private static void eliminar(ArrayList<Producto> productos, Scanner s) {
		
	}

	private static class Producto {
		private static int id = 1;
		private String codigo;
		private String nombre;
		private double precio;
		
		public Producto(){
			this.codigo = "P" + id;
			id++;
		}

		public void setNombre(String nombre) {
			this.nombre = nombre;
		}

		public void setPrecio(double precio) {
			this.precio = precio;
		}

		public String getCodigo() {
			return codigo;
		}

		public String getNombre() {
			return nombre;
		}

		public double getPrecio() {
			return precio;
		}

		@Override
		public String toString() {
			return codigo + " - " + nombre + " - $" + precio;
		}

		

	}

}
//
//Claro. Aquí tienes un resumen de los métodos más comunes de ArrayList y las operaciones de Stream que puedes aplicarle.
//
//🚀 Métodos Más Usados de ArrayList (Operaciones directas)
//Estos métodos modifican o consultan la lista directamente.
//
//add(E elemento): Añade un elemento al final de la lista.
//
//miLista.add("Hola");
//
//add(int indice, E elemento): Inserta un elemento en una posición específica, desplazando los demás.
//
//miLista.add(0, "Primero");
//
//get(int indice): Devuelve el elemento que está en la posición especificada.
//
//String valor = miLista.get(0);
//
//set(int indice, E elemento): Reemplaza el elemento en la posición especificada con uno nuevo.
//
//miLista.set(0, "NuevoPrimero");
//
//remove(int indice): Elimina el elemento en la posición especificada.
//
//miLista.remove(0);
//
//remove(Object o): Elimina la primera ocurrencia del objeto especificado en la lista.
//
//miLista.remove("Hola");
//
//size(): Devuelve el número de elementos en la lista (su tamaño).
//
//int tamano = miLista.size();
//
//isEmpty(): Devuelve true si la lista no tiene elementos.
//
//if (miLista.isEmpty()) { ... }
//
//contains(Object o): Devuelve true si la lista contiene el elemento especificado.
//
//boolean existe = miLista.contains("Hola");
//
//clear(): Elimina todos los elementos de la lista.
//
//miLista.clear();
//
//🌊 ArrayList y la API de Streams (.stream())
//Al llamar a .stream() en un ArrayList, obtienes un Stream<T>, que te permite realizar operaciones complejas de forma declarativa (estilo "qué hacer" en lugar de "cómo hacerlo").
//
//Nota Importante: Las operaciones de Stream no modifican la lista original. Crean un nuevo flujo de datos. Para guardar los resultados, generalmente usas una operación terminal como collect.
//
//Operaciones Intermedias (Devuelven un nuevo Stream)
//Estas operaciones se pueden encadenar.
//
//filter(Predicate<T> predicado): Filtra los elementos. Se queda solo con los que devuelven true en el predicado (una condición lógica).
//
//miLista.stream().filter(s -> s.startsWith("A"));
//
//map(Function<T, R> funcion): Transforma cada elemento. Aplica una función a cada elemento y devuelve un nuevo stream con los resultados.
//
//miLista.stream().map(s -> s.length()); (Transforma un Stream<String> en un Stream<Integer>)
//
//sorted(): Ordena los elementos según su orden natural (o con un Comparator).
//
//miLista.stream().sorted();
//
//distinct(): Elimina elementos duplicados.
//
//miLista.stream().distinct();
//
//limit(long n): Limita el stream a los primeros n elementos.
//
//miLista.stream().limit(5);
//
//Operaciones Terminales (Producen un resultado o efecto)
//Estas operaciones finalizan el stream y devuelven un valor concreto o no devuelven nada (void).
//
//collect(Collectors.toList()): La más común. Recolecta los elementos del stream en una nueva lista.
//
//List<String> filtrados = miLista.stream().filter(s -> s.length() > 5).collect(Collectors.toList());
//
//forEach(Consumer<T> accion): Ejecuta una acción para cada elemento (similar a un bucle for-each).
//
//miLista.stream().forEach(s -> System.out.println(s));
//
//count(): Devuelve el número de elementos en el stream.
//
//long cantidad = miLista.stream().filter(s -> s.isEmpty()).count();
//
//findFirst() / findAny(): Devuelven un Optional<T> con el primer elemento que coincida (usualmente después de un filter).
//
//Optional<String> primerA = miLista.stream().filter(s -> s.startsWith("A")).findFirst();
//
//anyMatch(), allMatch(), noneMatch(): Devuelven un boolean si "alguno", "todos" o "ninguno" de los elementos cumplen una condición.
//
//boolean hayVacios = miLista.stream().anyMatch(s -> s.isEmpty());
//
//💡 Ejemplo Práctico: Tradicional vs. Stream
//Objetivo: Dada una lista de números, obtener una nueva lista solo con los números pares multiplicados por 2.
//
//Java
//
//List<Integer> numeros = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6));
//
//// --- Forma Tradicional (Imperativa) ---
//List<Integer> resultadoTradicional = new ArrayList<>();
//for (Integer num : numeros) {
//    if (num % 2 == 0) { // 1. Filtrar
//        resultadoTradicional.add(num * 2); // 2. Transformar y añadir
//    }
//}
//// resultadoTradicional es [4, 8, 12]
//
//
//// --- Forma con Streams (Declarativa) ---
//List<Integer> resultadoStream = numeros.stream()
//    .filter(num -> num % 2 == 0)     // 1. Filtrar (solo pares)
//    .map(num -> num * 2)            // 2. Transformar (multiplicar por 2)
//    .collect(Collectors.toList());  // 3. Recolectar en una nueva lista
//
//// resultadoStream es [4, 8, 12]
//Como puedes ver, la versión con Streams suele ser más concisa y clara para operaciones de procesamiento de datos.
//
//¿Te gustaría ver un ejemplo más complejo de cómo usar Stream para agrupar datos (con groupingBy) o para hacer cálculos (con reduce)?	