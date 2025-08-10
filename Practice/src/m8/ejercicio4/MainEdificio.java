package m8.ejercicio4;

import java.util.ArrayList;

public class MainEdificio {

	public static void main(String[] args) {
		ArrayList<Edificio> edificios = new ArrayList<Edificio>();

		Edificio edificio = new Edificio();

		edificios = edificio.crearEdificio();
		edificio.mostrarEdificio(edificios);
		edificio.eliminarEdificio(edificios);

	}

}