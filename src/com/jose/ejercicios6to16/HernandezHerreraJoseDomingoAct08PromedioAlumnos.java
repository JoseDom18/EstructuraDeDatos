package com.jose.ejercicios6to16;

import java.util.Random;

public class HernandezHerreraJoseDomingoAct08PromedioAlumnos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Random alt = new Random();

		int numAlumnos = alt.nextInt(6) + 5;
		double promGrupo = 0;		
		double promMateria;
		
		
		for (int i = 1; i <= numAlumnos; i++) {
			double promAlumno = 0;
			
			int numMaterias = alt.nextInt(3) + 3;
			System.out.printf("El alumno %d tiene %d materias.%n", i, numMaterias);
			
			for(int j = 1; j <= numMaterias; j++) {
				
				double cal1 = alt.nextInt(5) + 6;
				double cal2 = alt.nextInt(5) + 6;
				double cal3 = alt.nextInt(5) + 6;
				System.out.printf("Calificaciones de materia %d: %.2f, %.2f, %.2f.%n", j, cal1, cal2, cal3);

				promMateria = (cal1 + cal2 + cal3) / 3;
				System.out.printf("Promedio de materia %d: %.2f%n", j, promMateria);
				
				promAlumno += promMateria;
			}
			
			promAlumno /= numMaterias;
			System.out.printf("El promedio del alumno %d es: %.2f%n", i, promAlumno);
			promGrupo += promAlumno;
			
			System.out.println("----------------------");
		}
		
		promGrupo /= numAlumnos;
		
		System.out.printf("El promedio del grupo de %d alumnos es: %.2f.%n", numAlumnos, promGrupo);
		
		
	}

}
