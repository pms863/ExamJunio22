package org.ual.test.ejercicio;

import org.junit.jupiter.params.provider.CsvFileSource;
import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;
import java.util.Arrays;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import org.ual.ejercicio.ejercicio2;

public class testEjercicio2 {
	@ParameterizedTest(name = "todos={0},presentados={1}, el resultado esperado es {2}")
	@CsvFileSource(resources = "ejercicio.csv", delimiter = ';')
	void testlistaEstudiantesNoPresentados(String todos, String presentados, String esperado) {

		 ArrayList<String> todosList = new ArrayList<>(Arrays.asList(todos.split(",")));
	        ArrayList<String> presentadosList = new ArrayList<>(Arrays.asList(presentados.split(",")));
	        ArrayList<String> esperadoList = new ArrayList<>(Arrays.asList(esperado.split(",")));
	        ejercicio2 ejercicio = new ejercicio2();
	        ArrayList<String> result = ejercicio.listaEstudiantesNoPresentados(todosList, presentadosList);
		assertEquals(result, esperadoList);
	}
}
