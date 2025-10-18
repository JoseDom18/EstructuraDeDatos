package com.jose.listas;

import java.util.ArrayList;
import java.util.Random;

public class CineApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Crear cajas
		Cajas[] caja = new Cajas[3];
		// Crear salas
		Butacas[][][] salas = new Butacas[2][5][new Random().nextInt(3) + 5];
		int contB = 0;
		ArrayList<Persona> fila = new ArrayList<>();
		
		// Empezar bucle
		while ((salas.length * salas[0].length) >= contB) {

			int r = new Random().nextInt(2);

			Persona p = null;

			if(r == 0) {
				p = atender(fila);
			} else {
				nuevoCliente(fila);
			}

			if (p == null) {
				continue;
			}


				

		}

	}

	public static Persona atender(ArrayList<Persona> fila) {
		Persona p;
			if(fila.isEmpty()) p = null; 
			else p = fila.remove(0);
			
		return p;
	}

	public static void nuevoCliente(ArrayList<Persona> fila) {
		Persona p = new Persona(new Random().nextInt(3));
		fila.add(p);
	}

	public static void asignarCaja(Cajas[] c) {
		
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

class Butacas{
	
	int num;
	boolean isEmpty;
	String ocupante;
	
}