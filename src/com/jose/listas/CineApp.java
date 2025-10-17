package com.jose.listas;

import java.util.ArrayList;
import java.util.Random;

public class CineApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public static void funciones() {
		while() {
			
		}
	}

	public static Persona atenderOGenerar(Cajas c, int r,ArrayList<Persona> fila) {
		Persona p = new Persona(new Random().nextInt(3));
		if(r == 0) { // atender
			if(fila.isEmpty()) System.out.println("Esperando cliente. La lista esta vacia.");
			else p = fila.remove(0);
			
		} else if (r == 1) { // agregar persona
			fila.add(p);
		}
		return fila.remove(0);
	}

}

class Persona {

	private static int serie = 1;
	private String id = "P";
	private String[] tipo = {"Estudiante", "Adulto", "Persona de la 3ra Edad"};
	private String tipoE;
	
	public Persona(int tipo) {
		this.id += serie;
		tipoE = this.tipo[tipo];
		serie++;
	}

	public String getId() {
		return id;
	}

	public String getTipoE() {
		return tipoE;
	}

	@Override
	public String toString() {
		return id + " es " + tipoE;
	}

	
	
}

class Cajas {

	private static int id = 1;
	private double saldo = 0;
	private int numC;

	public Cajas() {
		
		this.numC = id;
		id++;

	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public int getNumC() {
		return numC;
	}

	
}

