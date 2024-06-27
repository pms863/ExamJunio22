package ejercicio;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class ejercicio2Test {
	@CsvFileSource(resources = "/resources/ejercicio.csv", delimiter = ';')
	@ParameterizedTest(name = "todos={0},presentados={1}, el resultado esperado es {2}")
		void testlistaEstudiantesNoPresentados(String todos, String presentados, String esperado) {

		 ArrayList<String> todosList = new ArrayList<>(Arrays.asList(todos.split(",")));
	        ArrayList<String> presentadosList = new ArrayList<>(Arrays.asList(presentados.split(",")));
	        ArrayList<String> esperadoList = new ArrayList<>(Arrays.asList(esperado.split(",")));
	        ejercicio2 e = new ejercicio2();
	        ArrayList<String> result = e.listaEstudiantesNoPresentados(todosList, presentadosList);
		assertEquals(result, esperadoList);
	}
}
