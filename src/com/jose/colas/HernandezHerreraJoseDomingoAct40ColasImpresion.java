package com.jose.colas;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Random;

public class HernandezHerreraJoseDomingoAct40ColasImpresion {

	public static void main(String[] args) {
		
		File f1 = new File();
		File f2 = new File();
		System.out.println(f1);
		System.out.println(f2);
		List<File> archivero = new ArrayList<File>();
		Queue<File> cola = new LinkedList<>();
		
		int totalPaginas = 1000;
		
		while (true) {
			File f = new File();
			if (f.pageNumber < totalPaginas) {
				
				
			}
		}
		
		for (int i = 0; i < 10; i++) {
			File f = new File();
			cola.offer(f);
		}
		
		System.out.println(cola);
		

	}
	
	
	private static class File {
		private String name;
		private int pageNumber;
		private int size;
		private int sizeMb;
		private static int id = 1;
		
		
		public File() {
			String[] ext = {".doc", ".ppt", ".xls", ".txt", ".pdf"};
			this.name = "Archivo" + String.format("%03d", id) + ext[new Random().nextInt(5)];
			this.pageNumber = new Random().nextInt(50) + 1;
			this.size = new Random().nextInt(48001) + 2000;
			this.sizeMb = this.size / 1024;
			id++;
		}


		@Override
		public String toString() {
			String formatoTabla = "%-25s %-15d %-15s %-15s%n";
			String kb = String.format("%dKb", size);
			String mb = String.format("%dMb", sizeMb);
			String s = String.format(formatoTabla, name, pageNumber, kb, mb);
			return s;
		}
	}

}
