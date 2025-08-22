package m8.ejercicio4;

import java.util.ArrayList;
import java.util.Scanner;

/* PREGUNTAS
 * 1. ¿Se podria implementar un solo metodo que sirva para buscar cualquier
 * edificio??? Respuesta->Si, aplicando metodos genericos
 * 2. ¿ Se podria implementar los metodos crear, mostrar y eliminar en
 * la superClase para luego utilizarlos con cualquier subClase??? Respuesta->Aun no lo sé, consultar con alguien de experiencia
 * 3. ¿Como podria generalizar los metodos que hacen lo mismo y se repiten en todas las clases?	
 */

public class MainEdificio {

	public static void main(String[] args) {
		menu();
		opciones();
	}

	public static void menu() {
		System.out.println("1. Gestionar hospital." + "\n" + "2. Gestionar cine." + "\n" + "3. Gestionar hotel." + "\n"
				+ "4. Mostrar edificios." + "\n" + "0. Salir de programa");
	}

	public static void opciones() {
		Scanner entrada = new Scanner(System.in);

		Edificio edifico = new Edificio();
		ArrayList<Hospital> hospitales = new ArrayList<Hospital>();
		ArrayList<Hotel> hoteles = new ArrayList<Hotel>();
		ArrayList<Cine> cines = new ArrayList<Cine>();

		Hospital hospital = new Hospital();
		Hotel hotel = new Hotel();
		Cine cine = new Cine();

		boolean salir = false;

		while (!salir) {
			System.out.print("Selecciona una opcion: ");
			int opcion = entrada.nextInt();

			switch (opcion) {
			case 1:
				hospitales = hospital.crearHospital();
				hospital.repartirAlmuerzo(hospitales);
				hospital.consultarCostVigilancia(hospitales);
				hospital.limpiarEdificio(hospitales);
				hospital.eliminarHospital(hospitales);
				hospital.mostrarDatosEdificios(hospitales);
				break;
			case 2:
				cines = cine.crearCine();

				System.out.print("Nombre del cine a consultar numero de asistentes y recaudo: ");
				String edificioConsulta = cine.pedirTexto();

				int indiceCine = cine.buscarEdificio(cines, edificioConsulta);

				if (indiceCine == -1) {
					System.err.println(("¡El cine ingresado no existe!"));
				} else {
					System.out.print("Numero de asistentes: ");
					cine.setNumAsistentes(cine.pedirNumero());

					System.out.print("Precio entradas: ");
					cine.setPrecioEntrada(cine.pedirNumero());
				}

				cine.proyectarSession(indiceCine, cines, cine.getNumAsistentes(), cine.getPrecioEntrada());
				cine.consultarCostVigilancia(cines);
				cine.limpiarEdificio(cines);
				cine.eliminarCine(cines);
				cine.mostrarDatosEdificios(cines);
				break;
			case 3:
				hoteles = hotel.crearHotel();
				hotel.calcularServHabitacion(hoteles);
				hotel.consultarCostVigilancia(hoteles);
				hotel.limpiarEdificio(hoteles);
				hotel.eliminarHotel(hoteles);
				hotel.mostrarDatosEdificios(hoteles);
				break;
			case 4:
				break;
			case 0:
				System.out.println("Programa finalizado...");
				salir = true;
				System.exit(0);
				break;
			default:
				System.out.println("Opcion seleccionada invalida");
				break;
			}
		}
	}
}