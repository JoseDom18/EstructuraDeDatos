package com.jose.ejercicios6to16;

import java.util.Random;

public class HernandezHerreraJoseDomingoAct14PremiosBala {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Random alt = new Random();
		int alumno = 1;

		Premios p = Premios.nada;
		while (Premios.Lapicero.getCantidad() > 0 || Premios.Gorra.getCantidad() > 0
				|| Premios.Playera.getCantidad() > 0 || Premios.Chamarra.getCantidad() > 0) {

			int distancia = alt.nextInt(50) + 1;

			if (distancia >= 20 && Premios.Chamarra.getCantidad() > 0 ) {

				p = Premios.Chamarra;
				p.entregarPremio();

			} else if (distancia > 10 && Premios.Playera.getCantidad() > 0) {

				p = Premios.Playera;
				p.entregarPremio();

			} else if (distancia > 5 && Premios.Gorra.getCantidad() > 0) {

				p = Premios.Gorra;
				p.entregarPremio();

			} else if(distancia > 0 && Premios.Lapicero.getCantidad() > 0){

				p = Premios.Lapicero;
				p.entregarPremio();

			}


			System.out.printf("El alumno %d llego a %d metros y su premio es %s%n", alumno, distancia, p);
			System.out.printf("Lapiceros: %d Gorras: %d Playeras: %d Chamarras: %d%n", Premios.values()[0].getCantidad(),
					Premios.values()[1].getCantidad(), Premios.values()[2].getCantidad(),
					Premios.values()[3].getCantidad());
			alumno++;

		}
		System.out.printf("El alumno %d participo pero no se lleva nada", alumno);
	}

}

enum Premios {
	Lapicero(5), Gorra(5), Playera(5), Chamarra(5), nada(0);

	private int cantidad;

	Premios(int cantidad) {
		this.cantidad = cantidad;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void entregarPremio() {
		this.cantidad--;
	}

}
