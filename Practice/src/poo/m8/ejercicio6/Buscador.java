package poo.m8.ejercicio6;

import java.util.List;

public class Buscador {
	public static <T extends Buscable<T>> T buscar(List<T> lista, int id) {
		for (T elemento : lista) {
			T resultado = elemento.buscarPorId(id);
			if (resultado != null) {
				return resultado;
			}
		}
		return null;
	}
}