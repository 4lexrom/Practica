package m8.ejercicio2;

import java.util.ArrayList;
import java.util.Scanner;

public class HotelMain {

	public static void main(String[] args) {
		menu();
		opciones();
	}

	public static void menu() {
		mensajeInformativo("1. Crear hotel\n" + "2. Modificar hotel\n" + "3. Eliminar hotel\n" + "4. Bsucar hotel\n"
				+ "5. Ver listado de hoteles\n" + "0. Salir\n");
	}

	public static void opciones() {
		ArrayList<Hotel> hoteles = new ArrayList<Hotel>();
		String consultaHotel;
		boolean salir = false;

		while (!salir) {

			mensajeInformativo("\nElije una opcion:");
			int opcion = pedirNumero();
			System.out.println();

			switch (opcion) {
			case 1:
				hoteles = crearHotel();
				break;
			case 2:
				mensajeInformativo("Nombre del hotel que desea modificar: ");
				consultaHotel = pedirTexto();
				modificarHotel(hoteles, consultaHotel);
				break;
			case 3:
				mensajeInformativo("Nombre del hotel que desea eliminar: ");
				consultaHotel = pedirTexto();
				eliminarHotel(hoteles, consultaHotel);
				break;
			case 4:
				mensajeInformativo("Nombre del hotel que desea buscar: ");
				consultaHotel = pedirTexto();
				consultaHotel(hoteles, consultaHotel);
				break;
			case 5:
				mensajeInformativo("Listado actualizado de hoteles: ");
				verHotel(hoteles);
				break;
			case 0:
				salir = true;
				mensajeInformativo("Haz finalizado el programa");
				break;
			default:
				mensajeInformativo("Solo puedes ingresar numeros entre 1 y 5" + "\n");
			}
		}
	}

	public static int pedirNumero() {
		Scanner entrada = new Scanner(System.in);
		int numero;
		numero = entrada.nextInt();
		return numero;
	}

	public static String pedirTexto() {
		Scanner entrada = new Scanner(System.in);
		String texto;
		texto = entrada.nextLine();
		return texto;
	}

	public static void mensajeInformativo(String mensaje) {
		System.out.print(mensaje);
	}

	public static ArrayList<Hotel> crearHotel() {
		ArrayList<Hotel> lstHoteles = new ArrayList<Hotel>();
		int numHabitaciones, numPlantas, superfice;
		String nombre;

		for (int i = 0; i < 3; i++) {
			mensajeInformativo("----Hotel " + (i + 1) + "----" + "\n");
			mensajeInformativo("Nombre del hotel: ");
			nombre = pedirTexto();
			mensajeInformativo("Numero de habitaciones: ");
			numHabitaciones = pedirNumero();
			mensajeInformativo("Numero de plantas: ");
			numPlantas = pedirNumero();
			mensajeInformativo("Superficie total del hotel: ");
			superfice = pedirNumero();
			lstHoteles.add(new Hotel(nombre, numHabitaciones, numPlantas, superfice));
		}
		return lstHoteles;
	}

	public static ArrayList<Hotel> eliminarHotel(ArrayList<Hotel> lstHoteles, String consultaHotel) {
		boolean encontrado = false;
		String nombreHotel = "";
		int i = 0;

		while (!encontrado && i < lstHoteles.size()) {
			nombreHotel = lstHoteles.get(i).getNombre();
			if (nombreHotel.equalsIgnoreCase(consultaHotel)) {
				lstHoteles.remove(i);
				encontrado = true;
				mensajeInformativo("Se elimino el hotel " + nombreHotel);
				System.out.println();
			}
			i++;
		}

		if (!nombreHotel.equalsIgnoreCase(consultaHotel)) {
			mensajeInformativo("No existe el hotel " + consultaHotel);
			System.out.println();
		}
		return lstHoteles;
	}

	public static void consultaHotel(ArrayList<Hotel> lstHoteles, String consultaHotel) {
		boolean encontrado = false;
		String nombreHotel = "";
		int i = 0;

		while (!encontrado && i < lstHoteles.size()) {
			nombreHotel = lstHoteles.get(i).getNombre();
			if (nombreHotel.equalsIgnoreCase(consultaHotel)) {
				mensajeInformativo("Hotel: " + lstHoteles.get(i).getNombre() + "\n");
				mensajeInformativo("Numero de habitaciones: " + lstHoteles.get(i).getNumHabitaciones() + "\n"
						+ "Numero de plantas: " + lstHoteles.get(i).getNumPlantas() + "\n" + "Superficie: "
						+ lstHoteles.get(i).getSuperficie() + "\n");
				mensajeInformativo("\n*Datos de mantenimento del hotel " + lstHoteles.get(i).getNombre() + "* \n");
				lstHoteles.get(i).calcularMantto();
				encontrado = true;
			}
			i++;
		}
		if (!nombreHotel.equalsIgnoreCase(consultaHotel)) {
			mensajeInformativo("No existe el hotel " + consultaHotel + "\n");
		}
	}

	public static ArrayList<Hotel> modificarHotel(ArrayList<Hotel> lstHoteles, String consultaHotel) {
		boolean encontrado = false;
		String nombreHotel = "";
		int i = 0;

		while (!encontrado && i < lstHoteles.size()) {
			nombreHotel = lstHoteles.get(i).getNombre();
			if (nombreHotel.equalsIgnoreCase(consultaHotel)) {
				mensajeInformativo("Modifica el numero de habitaciones: ");
				lstHoteles.get(i).setNumHabitaciones(pedirNumero());
				mensajeInformativo("Modifica el numero de plantas: ");
				lstHoteles.get(i).setNumPlantas(pedirNumero());
				mensajeInformativo("Modifica la superficie del hotel: ");
				lstHoteles.get(i).setSuperficie(pedirNumero());
				encontrado = true;
			}
			i++;
		}

		if (!nombreHotel.equalsIgnoreCase(consultaHotel)) {
			mensajeInformativo("No existe el hotel " + consultaHotel + "\n");
		}
		return lstHoteles;
	}

	public static void verHotel(ArrayList<Hotel> lstHoteles) {
		for (int i = 0; i < lstHoteles.size(); i++) {
			mensajeInformativo("\n" + "Hotel: " + lstHoteles.get(i).getNombre() + "\n" + "Habitaciones: "
					+ lstHoteles.get(i).getNumHabitaciones() + "\n" + "Plantas: " + lstHoteles.get(i).getNumPlantas()
					+ "\n" + "Superficie: " + lstHoteles.get(i).getSuperficie());
			System.out.println();
		}
	}
}