package com.jose.colas;

public class HernandezHerreraJoseDomingoAct39ColasCine {

	public static void main(String[] args) {
		Personas p = new Personas(2);

	}

}

class Personas {
	private static int id = 1;
	private String name = "P";
	private Categoria categoria;
	
	public Personas(int categoria) {
		this.name += id;
		this.categoria = Categoria.values()[categoria];
		id++;
	}
}

enum Categoria {
	Estudiante(20),
	Adulto(35),
	Persona_de_la_tercera_edad(25);
	
	private Categoria(int costo) {
		this.costo = costo;
	}
	
	private final int costo;

	public int getCosto() {
		return costo;
	}
	
	
}