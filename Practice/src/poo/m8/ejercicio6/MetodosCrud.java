package poo.m8.ejercicio6;

import java.util.List;

public interface MetodosCrud<T> {

	T crear();

	void verTodo(List<T> lista);

	void actualizar(int id);

	void eliminar(int id);
}