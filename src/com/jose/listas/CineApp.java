package com.jose.listas;

import java.util.ArrayList;
import java.util.Random;

public class CineApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Crear cajas
		int nCajas = 3;
		Cajas[] caja = new Cajas[nCajas];
		for (int i = 0; i < caja.length; i++) {
			Cajas c = new Cajas();
			caja[i] = c;
		}
		// Crear salas
		Butacas[][][] salas = new Butacas[2][5][new Random().nextInt(3) + 5];
		Butacas.llenar(salas);

		int contB = 0;
		ArrayList<Persona> fila = new ArrayList<>();

		// Empezar bucle
		while ((salas[0].length * salas[0][0].length * 2) > contB) {

			// generar persona en fila o atender
			int r = new Random().nextInt(2);

			Persona p = null;

			if (r == 0) { // se atiende a alguien de la fila
				p = atender(fila);
				if (p == null) { // si es nulo no hay nadie en la fila
					System.out.println("Esperando cliente, la fila esta vacia.");
					continue;
				}
			} else { // se genera a alguien en la fila
				nuevoCliente(fila);
				imprimirLista(fila);
				continue;
			}

			// asignar caja y cobrar y elegir sala
			asignarCaja(caja, p, salas);

			contB++;
			System.out.println("conteo" + contB);
			System.out.println(salas[0].length * salas[0][0].length * 2);

		}

		System.out.printf("Número de clientes que quedaron en la fila %d%n", fila.size());
		if (fila.size() > 0)
			imprimirLista(fila);

		Cajas.resumenCajas(caja);

		imprimirSalas(salas);

	}

	public static Persona atender(ArrayList<Persona> fila) {
		Persona p;
		if (fila.isEmpty())
			p = null;
		else
			p = fila.remove(0);

		return p;
	}

	public static void nuevoCliente(ArrayList<Persona> fila) {
		Persona p = new Persona(new Random().nextInt(3));
		fila.add(p);
		System.out.printf("Llego %s%n", p.getId());
		System.out.println("");
	}

	public static void asignarCaja(Cajas[] c, Persona p, Butacas[][][] salas) {

		System.out.printf("Atendiendo a %s%n", p.getId());
		Cajas cS = c[new Random().nextInt(c.length)];
		int sala;
		int fil;
		int col;
		while (true) {
			sala = new Random().nextInt(2);
			fil = new Random().nextInt(salas[0].length);
			col = new Random().nextInt(salas[0][0].length);
			if (salas[sala][fil][col].isEmpty()) {
				salas[sala][fil][col].setOcupante(p.getId());
				salas[sala][fil][col].setEmpty(false);
				break;
			}
		}
		System.out.printf("%s, %s, Monto a pagar: $%d. Sala %d fila %d asiento %d%n", p, cS, p.getTipo().getValor(),
				sala + 1, fil + 1, col + 1);
		cS.setNumClientesAtendidos();
		cS.setSaldo(p.getTipo().getValor());
		System.out.println("");

	}

	public static void imprimirLista(ArrayList<Persona> fila) {
		int num = 1;
		System.out.println("Fila:");
		for (Persona p : fila) {
			System.out.printf("%d.-%s%n", num, p.getId());
			num++;
		}
		System.out.println("");
	}

	public static void imprimirSalas(Butacas[][][] salas) {
		for (int i = 0; i < salas.length; i++) {
			System.out.printf("Sala %d%n", i + 1);
			for (int j = 0; j < salas[0].length; j++) {
				for (int j2 = 0; j2 < salas[0][0].length; j2++) {
					System.out.printf("[%4s]", salas[i][j][j2].getOcupante());
				}
				System.out.println("");
			}
			System.out.println("");
		}
	}

}

class Persona {

	private static int serie = 1;
	private String id = "P";
//	private String[] tipo = {"Estudiante", "Adulto", "Persona de la 3ra Edad"};
//	private String tipoE;
	private Tipos tipo;

	public Persona(int tipo) {
		this.id += serie;
//		tipoE = this.tipo[tipo];
		this.tipo = Tipos.values()[tipo];
		serie++;
	}

	public String getId() {
		return id;
	}

//	public String getTipoE() {
//		return tipoE;
//	}

	@Override
	public String toString() {
		return id + " es " + tipo;
	}

	public Tipos getTipo() {
		return tipo;
	}

}

enum Tipos {
	ESTUDIANTE(20), ADULTO(35), ADULTO_MAYOR(25);

	private final int valor;

	Tipos(int valor) {
		this.valor = valor;
	}

	public int getValor() {
		return this.valor;
	}
}

class Cajas {

	private static int id = 1;
	private double saldo = 0;
	private int numC;
	private int numClientesAtendidos;

	public Cajas() {

		this.numC = id;
		id++;

	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo += saldo;
	}

	public int getNumC() {
		return numC;
	}

	public int getNumClientesAtendidos() {
		return numClientesAtendidos;
	}

	public void setNumClientesAtendidos() {
		this.numClientesAtendidos++;
	}

	@Override
	public String toString() {
		return " Número de caja " + numC;
	}

	public static void resumenCajas(Cajas[] caja) {
		for (int i = 0; i < caja.length; i++) {
			System.out.printf("Número de caja %d%nTotal cobrado: %.2f%nClientes atendidos: %d%n", caja[i].getNumC(),
					caja[i].getSaldo(), caja[i].getNumClientesAtendidos());
			System.out.println("");
		}

	}

}

class Butacas {

	private boolean isEmpty = true;
	private String ocupante;

	public boolean isEmpty() {
		return isEmpty;
	}

	public void setEmpty(boolean isEmpty) {
		this.isEmpty = isEmpty;
	}

	public String getOcupante() {
		return ocupante;
	}

	public void setOcupante(String ocupante) {
		this.ocupante = ocupante;
	}

	public static void llenar(Butacas[][][] salas) {
		for (int i = 0; i < salas.length; i++) {
			for (int j = 0; j < salas[0].length; j++) {
				for (int k = 0; k < salas[0][0].length; k++) {
					salas[i][j][k] = new Butacas();
				}
			}
		}
	}

}