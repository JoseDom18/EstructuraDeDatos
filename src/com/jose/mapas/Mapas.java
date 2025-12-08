package com.jose.mapas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import java.util.Set;

public class Mapas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, Integer> recipe = Map.of(
				"flour", 500,
				"sugar", 200,
				"eggs", 1,
				"cinnamon", 300);
		Map<String, Integer> available = Map.of(
				"flour", 1200,
				"sugar", 1200,
				"eggs", 5,
				"milk", 200);
		
		ArrayList<Integer> cantidades = new ArrayList<>();
		
		Set<String> ingredientes = recipe.keySet();
		
		for (String ingrediente : ingredientes) {
			int cantidadReceta = recipe.getOrDefault(ingrediente, 0);
			int cantidadDisponible = available.getOrDefault(ingrediente, 0);
			
			int cantidad = cantidadDisponible / cantidadReceta;
			if (cantidad == 0) {
				System.out.println("La cantidad es 0.");
			} else {
				cantidades.add(cantidad);
			}
			
			
			
			System.out.println("cantidad: " + cantidad);
			
		}
		
			int ls = Collections.min(cantidades);
	}

}
