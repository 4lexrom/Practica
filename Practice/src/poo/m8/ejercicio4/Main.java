package poo.m8.ejercicio4;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		menu();
		opciones();
	}

	public static void menu() {
		System.out.println("0. Salir del programa" + "\n" + "1. Gestionar hospital" + "\n" + "2. Gestionar cine" + "\n"
				+ "3. Gestionar Hotel");
	}

	public static void opciones() {
		List<Edificio> edificios = new ArrayList<Edificio>();

		Hospital hospital = new Hospital();
		Cine cine = new Cine();
		Hotel hotel = new Hotel();

		boolean salir = false;

		while (!salir) {
			hospital.textoDescriptivo("Selecciona una opcion: ");
			int opcion = hospital.pedirNumero();

			switch (opcion) {
			case 0:
				hospital.textoDescriptivo("Salir del programa...");
				salir = true;
				break;
			case 1:
				Hospital h;

				h = hospital.crearEdificio();
				edificios.add(h);

				hospital.calcularCosteVigilancia(edificios);
				hospital.limpiarEdificio(edificios);
				hospital.repartirAlmuerzo(edificios);
				hospital.eliminarEdificio(edificios);
				hospital.verInformacion(edificios);
				break;
			case 2:
				byte numAsistentes;
				double precioEntrada;
				Cine c;

				c = cine.crearEdificio();
				edificios.add(c);

				cine.textoDescriptivo("Cantidad de asistentes: ");
				numAsistentes = (byte) cine.pedirNumero();

				cine.textoDescriptivo("Precio entrada: ");
				precioEntrada = cine.pedirNumero();

				cine.proyectarSession(edificios, numAsistentes, precioEntrada);
				cine.calcularCosteVigilancia(edificios);
				cine.limpiarEdificio(edificios);
				cine.verInformacion(edificios);
				cine.eliminarEdificio(edificios);
				break;
			case 3:
				Hotel htl;

				htl = hotel.crearEdificio();
				edificios.add(htl);

				hotel.calcularCosteVigilancia(edificios);
				hotel.limpiarEdificio(edificios);
				hotel.calcularServHabitaciones();
				hotel.eliminarEdificio(edificios);
				//hotel.verInformacion(edificios);
				break;
			default:
				break;
			}
		}
	}
}