package programacionGenerica;

public class Pareja<T> {
	private T primero;

	public Pareja() {

		this.primero = null;
	}

	public static void imprimirTrabajador(Pareja<? extends Empleado> generico) {
		Empleado primero = generico.getPrimero();
		System.out.println(primero);
	}

	public T getPrimero() {
		return primero;
	}

	public void setPrimero(T nuevoValor) {
		this.primero = nuevoValor;
	}
}