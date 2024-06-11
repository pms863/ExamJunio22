package org.ual.ejercicio;

import java.util.ArrayList;

public class ejercicio2 {
	public static ArrayList<String> listaEstudiantesNoPresentados(ArrayList<String> todos,
			ArrayList<String> presentados) {
		ArrayList<String> noPresentados = new ArrayList<>();

		for (String estudiante : todos) {
			if (!presentados.contains(estudiante)) {
				noPresentados.add(estudiante);
			}
		}

		return noPresentados;
	}

}
