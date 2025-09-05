package com.jose.ejercicios1to5;

import java.util.Scanner;

public class HernandezHerreraJoseDomingoAct03Sueldo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);

		System.out.println("Ingrese el nombre del trabajador: ");
		String nombre = scanner.nextLine();
		System.out.println("Ingrese el Sueldo base por hora del trabajador: ");
		int sueldoBase = scanner.nextInt();
		scanner.nextLine();
		System.out.println("Ingrese las horas trabajadas del trabajador: ");
		int horasTrabajadas = scanner.nextInt();
		scanner.nextLine();

		Trabajador emp1 = new Trabajador(nombre, sueldoBase, horasTrabajadas);
		int horasNormales = emp1.getHorasTrabajadas();
		int horasAlDoble = 0;
		int horasAlTriple = 0;

		if (emp1.getHorasTrabajadas() > 48) {
			horasAlTriple = emp1.getHorasTrabajadas() - 48;
			horasAlDoble = 8;
			horasNormales = 40;
			
		} else if (emp1.getHorasTrabajadas() > 40) {
			horasAlDoble = emp1.getHorasTrabajadas() - 40;
			horasNormales = 40;
		}
		
		System.out.printf("Horas normales: %d, Horas al doble: %d, Horas al triple: %d%n", horasNormales, horasAlDoble, horasAlTriple);

		System.out.printf("El pago de empleado %s es de %d", emp1.getNombre(),
				(horasNormales * emp1.getSueldoBase()) + (horasAlDoble * emp1.getSueldoBase()) * 2
						+ (horasAlTriple * emp1.getSueldoBase()) * 3 );

	}

}

class Trabajador {
	private String nombre;
	private int sueldoBase;
	private int horasTrabajadas;

	public Trabajador(String nombre, int sueldoBase, int horasTrabajadas) {
		this.nombre = nombre;
		this.sueldoBase = sueldoBase;
		this.horasTrabajadas = horasTrabajadas;
	}

	public String getNombre() {
		return nombre;
	}

	public int getSueldoBase() {
		return sueldoBase;
	}

	public void setHorasTrabajadas(int horasTrabajadas) {
		this.horasTrabajadas = horasTrabajadas;
	}

	public int getHorasTrabajadas() {
		return horasTrabajadas;
	}
	

}