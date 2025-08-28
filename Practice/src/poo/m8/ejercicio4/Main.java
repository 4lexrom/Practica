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
		GestorEdificios gestor = new GestorEdificios();
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
				gestor.gestionarHospital(hospital, edificios);
				break;
			case 2:
				gestor.gestionarCine(cine, edificios);
				break;
			case 3:
				gestor.gestionarHotel(hotel, edificios);
				break;
			default:
				break;
			}
		}
	}
}