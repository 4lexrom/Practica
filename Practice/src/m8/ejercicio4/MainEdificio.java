package m8.ejercicio4;

import java.util.ArrayList;

/* PREGUNTAS
 * 1. ¿Se podria implementar un solo metodo que sirva para buscar cualquier
 * edificio??? Respuesta->Si, aplicando metodos genericos
 * 2. ¿ Se podria implementar los metodos crear, mostrar y eliminar en
 * la superClase para luego utilizarlos con cualquier subClase???
 * 3. ¿Como podria generalizar los metodos que hacen lo mismo y se repiten en todas las clases?
 */

public class MainEdificio {

	public static void main(String[] args) {
		// Por que no permite crear un contructor vacio?

		// Instacia clase Hospital

		ArrayList<Hospital> hospitales = new ArrayList<Hospital>();
		Hospital hospital = new Hospital(null, 0, 0, 0);
		int indiceEdificio;

		hospitales = hospital.crearHospital();

		/*indiceEdificio = hospital.buscarEdificio(hospitales);
		hospital.limpiarEdificio(hospitales, indiceEdificio);

		indiceEdificio = hospital.buscarEdificio(hospitales);
		hospital.repartirAlmuerzo(hospitales, indiceEdificio);

		indiceEdificio = hospital.buscarEdificio(hospitales);
		hospital.eliminarHospital(hospitales, indiceEdificio);*/

		indiceEdificio = hospital.buscarEdificio(hospitales);
		hospital.consultarCostVigilancia(hospitales, indiceEdificio);

		// Instacia clase Cine
		/*
		 * ArrayList<Cine> cines = new ArrayList<Cine>(); Cine cine = new Cine(null, 0,
		 * 0, 0, 0); cines = cine.crearEdificioCine();
		 * 
		 * System.out.print("Numero de asistentes: ");
		 * cine.setNumAsistentes(edificio.pedirNumero());
		 * 
		 * System.out.print("Precio entradas: ");
		 * cine.setPrecioEntrada(edificio.pedirNumero()); // Crear un buscador para los
		 * datos de "X" cine y muestre la info especifica de // un cine
		 * cine.proyectarSession(cine.getNumAsistentes(), cine.getPrecioEntrada());
		 * cine.eliminarCine(cines);
		 */

		// Instancia clase Hotel
//		Hotel hotel = new Hotel(null, 0, 0, 0);
//		ArrayList<Hotel> hoteles = new ArrayList<Hotel>();
//
//		hoteles = hotel.crearHotel();
//		hotel.eliminarHotel(hoteles);
//		hotel.mostrarHotel(hoteles);
//		hotel.calcularServHabitacion(hoteles);
//		hotel.mostrarHotel(hoteles);
//		hotel.limpiar();
	}
}