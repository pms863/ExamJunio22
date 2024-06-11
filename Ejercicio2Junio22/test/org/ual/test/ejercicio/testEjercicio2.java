package org.ual.test.ejercicio;

import org.junit.jupiter.params.provider.CsvFileSource;
import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;
import org.junit.jupiter.params.ParameterizedTest;
import org.ual.ejercicio.ejercicio2;

public class testEjercicio2 {
	@ParameterizedTest(name = "todos={0},presentados={1}, el resultado esperado es {2}")
	@CsvFileSource(resources = "ejercicio.csv", delimiter = ';')
	public static void testlistaEstudiantesNoPresentados(ArrayList<String> todos, ArrayList<String> presentados,
			ArrayList<String> esperado) {

		ArrayList<String> result = ejercicio2.listaEstudiantesNoPresentados(new ArrayList<>(todos), new ArrayList<>(presentados));
		assertEquals(result.toArray(), esperado.toArray());
	}
}
