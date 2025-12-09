package com.jose.examen;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

public class U3_UU_HernandezHerreraJoseDomingo_Ver2Hospital {

	public static void main(String[] args) {

		Random r = new Random();
		ArrayList<Pacientes> listaEsperaInicial = new ArrayList<>();
		Queue<Pacientes> colaClasificacion = new LinkedList<>();
		int[] estacionClasificacion = new int[4];
		String[] especialidad = {"Urgencias", "Cirugía", "Pediatría", "Maternidad", "Medicina Interna"};
		int[] contadorEspecialidad = new int[5];
		ArrayList<Pacientes> listaEsperaGeneral = new ArrayList<>();


		Pabellon[][] urgencias = new Pabellon[r.nextInt(7) + 6][4];
		Pabellon[][] cirugía = new Pabellon[r.nextInt(7) + 6][4];
		Pabellon[][] pediatría = new Pabellon[r.nextInt(7) + 6][4];
		Pabellon[][] maternidad = new Pabellon[r.nextInt(7) + 6][4];
		Pabellon[][] medicinaInterna = new Pabellon[r.nextInt(7) + 6][4];

		int[] totalCamas = { urgencias.length * urgencias[0].length, cirugía.length * cirugía[0].length, pediatría.length * pediatría[0].length, maternidad.length * maternidad[0].length, medicinaInterna.length * medicinaInterna[0].length  };

		while (totalCamas[0] > 0 || totalCamas[1] > 0 || totalCamas[2] > 0 || totalCamas[3] > 0 || totalCamas[4] > 0) {
			switch (r.nextInt(3)) {
			case 0:
				Pacientes.agregarPersonaListaEspera(listaEsperaInicial);
				System.out.println("");
				break;
			case 1:
				Pacientes.llegaPersonaCola(listaEsperaInicial, colaClasificacion);
				System.out.println("");
				break;
			case 2:
				Pacientes.atenderPaciente(colaClasificacion, estacionClasificacion, especialidad, contadorEspecialidad, urgencias, cirugía, pediatría, maternidad, medicinaInterna, totalCamas, listaEsperaGeneral);
				System.out.println("");
				break;
			}

		}

		System.out.println("");
		System.out.println("Pabellon de Urgencias");
		Pabellon.imprimirMatriz(urgencias);
		System.out.println("");
		System.out.println("Pabellon de Cirugía");
		Pabellon.imprimirMatriz(cirugía);
		System.out.println("");
		System.out.println("Pabellon de Pediatría");
		Pabellon.imprimirMatriz(pediatría);
		System.out.println("");
		System.out.println("Pabellon de Maternidad");
		Pabellon.imprimirMatriz(maternidad);
		System.out.println("");
		System.out.println("Pabellon de Medicina Interna");
		Pabellon.imprimirMatriz(medicinaInterna);
		
		System.out.println("");
		System.out.printf("Fila lista general: %s", listaEsperaGeneral);

	}

	private static class Pacientes {
		private String name;
		private static int id;

		public Pacientes() {
			this.name = "PAC" + String.format("%03d", id);
			id++;
		}


		@Override
		public String toString() {
			return name;
		}


		public static void agregarPersonaListaEspera(ArrayList<Pacientes> listaEsperaInicial) {
			Pacientes p = new Pacientes();
			listaEsperaInicial.add(p);

			int numeroLista = 1;
			String formatoImprir = "%d.- %s%n";

			System.out.println("Se agrego un nuevo paciente a la lista de espera.");

			for (Pacientes pac : listaEsperaInicial) {
				System.out.printf(formatoImprir, numeroLista, pac);
				numeroLista++;
			}
		}

		public static void llegaPersonaCola(ArrayList<Pacientes> listaEsperaInicial, Queue<Pacientes> colaClasificacion) {
			if (!listaEsperaInicial.isEmpty()) {
				Pacientes pac = listaEsperaInicial.remove(new Random().nextInt(listaEsperaInicial.size()));
				colaClasificacion.offer(pac);
				System.out.printf("El paciente %s se a movido a la cola de espera de clasificación.%n", pac);
				System.out.printf("La cola actual es: %s%n", colaClasificacion);

			} else {
				System.out.println("La fila de espera esta vacia, espera a que llegue un paciente.");
			}
		}

		public static void atenderPaciente(Queue<Pacientes> colaClasificacion, int[] estacionClasificacion, String[] especialidad, int[] contadorEspecialidad, Pabellon[][] urgencias, Pabellon[][] cirugia, Pabellon[][] pediatria, Pabellon[][] maternidad, Pabellon[][] medicinaInterna, int[] totalCamas, ArrayList<Pacientes> listaGeneral) {
			if (!colaClasificacion.isEmpty()) {
				Pacientes pac = colaClasificacion.poll();
				int r = new Random().nextInt(4);
				int r1 = new Random().nextInt(5);
				estacionClasificacion[r] += 1;
				contadorEspecialidad[r1] += 1;
				System.out.printf("El paciente %s se atendio:%n"
						+ "Estación de clasifición: %d%n"
						+ "Especialidad Asignada: %s%n"
						+ "Cola actual: %s%n", pac, r + 1, especialidad[r1], colaClasificacion);
				Pacientes.asignarCama(pac, r1, urgencias , cirugia, pediatria, maternidad, medicinaInterna, totalCamas, listaGeneral);

			} else {
				System.out.println("No hay pacientes en la cola de clasificación.");
			}

		}

		public static void asignarCama(Pacientes pac, int especialidadSeleccionada, Pabellon[][] urgencias, Pabellon[][] cirugia, Pabellon[][] pediatria, Pabellon[][] maternidad, Pabellon[][] medicinaInterna, int[] totalCamas, ArrayList<Pacientes> listaGeneral) {
			switch (especialidadSeleccionada) {
			case 0:
				if (totalCamas[0] > 0) {
					int c = new Random().nextInt(4);
					int f = new Random().nextInt(urgencias.length);
					if (urgencias[f][c] == null) {
						urgencias[f][c] = new Pabellon();
						urgencias[f][c].setNamePac(pac.name);
						totalCamas[0]--;
					}
					Pabellon.imprimirMatriz(urgencias);

				} else {
					System.out.println("Ya no hay camas para Urgencias");
					listaGeneral.add(pac);
				}
				break;
			case 1:
				if (totalCamas[1] > 0) {
					int c = new Random().nextInt(4);
					int f = new Random().nextInt(cirugia.length);
					if (cirugia[f][c] == null) {
						cirugia[f][c] = new Pabellon();
						cirugia[f][c].setNamePac(pac.name);
						totalCamas[1]--;
					}
					Pabellon.imprimirMatriz(cirugia);

				} else {
					System.out.println("Ya no hay camas para cirugia");
					listaGeneral.add(pac);
				}
				break;
			case 2:
				if (totalCamas[2] > 0) {
					int c = new Random().nextInt(4);
					int f = new Random().nextInt(pediatria.length);
					if (pediatria[f][c] == null) {
						pediatria[f][c] = new Pabellon();
						pediatria[f][c].setNamePac(pac.name);
						totalCamas[2]--;
					}
					Pabellon.imprimirMatriz(pediatria);

				} else {
					System.out.println("Ya no hay camas para pediatria");
					listaGeneral.add(pac);
				}
				break;
			case 3:
				if (totalCamas[3] > 0) {
					int c = new Random().nextInt(4);
					int f = new Random().nextInt(maternidad.length);

					if (maternidad[f][c] == null) {
						maternidad[f][c] = new Pabellon();
						maternidad[f][c].setNamePac(pac.name);
						totalCamas[3]--;
					}
					Pabellon.imprimirMatriz(maternidad);

				} else {
					System.out.println("Ya no hay camas para maternidad");
					listaGeneral.add(pac);
				}
				break;
			case 4:
				if (totalCamas[4] > 0) {
					int c = new Random().nextInt(4);
					int f = new Random().nextInt(medicinaInterna.length);
					if (medicinaInterna[f][c] == null) {
						medicinaInterna[f][c] = new Pabellon();
						medicinaInterna[f][c].setNamePac(pac.name);
						totalCamas[4]--;
					}
					Pabellon.imprimirMatriz(medicinaInterna);

				} else {
					System.out.println("Ya no hay camas para Medicina Interna");
					listaGeneral.add(pac);
				}
				break;


			}
		}
	}

	private static class Pabellon {
		private String namePac;

		public String getNamePac() {
			return namePac;
		}

		public void setNamePac(String namePac) {
			this.namePac = namePac;
		}


		public static void imprimirMatriz(Pabellon[][] pabellon) {
			for (int i = 0; i < pabellon.length; i++) {
				for (int j = 0; j < pabellon[0].length; j++) {
					if (pabellon[i][j] != null) {
						System.out.printf("[%6s]", pabellon[i][j].getNamePac());
					} else {
						System.out.printf("[%6s]", "");
					}

				}
				System.out.println("");
			}
		}
	}


}

