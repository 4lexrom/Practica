package m8.ejercicio1;

public class ClaseMain {

	public static void main(String[] args) {

		Ordenador ordenador1 = new Ordenador("DELL", "litePad");
		Ordenador ordenador2 = new Ordenador("Apple", "swift", "I9", 16, 500);

		System.out.println(ordenador1.toString() + "\n");
		System.out.println(ordenador2.toString() + "\n");
		System.out.println(ordenador1.mensaje("Eclipse"));
	}
}