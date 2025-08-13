package m8.ejercicio4;

import java.util.ArrayList;

/* PREGUNTAS
 * 1. ¿Se podria implementar un solo metodo que sirva para buscar cualquier
 * edificio???
 * 2. ¿ Se podria implementar los metodos crear, mostrar y eliminar en
 * la superClase para luego utilizarlos con cualquier subClase???
 * 3. ¿En general como podria generalizar los metodos que hacen lo mismo y se repiten an todas las clases?
 */

public class MainEdificio {

	public static void main(String[] args) {

		Edificio edificio = new Edificio(null, 0, 0);

//		// Instacia clase Hospital
//		ArrayList<Hospital> hospitales = new ArrayList<Hospital>();
//		Hospital hospital = new Hospital(null, 0, 0, 0);
//		hospitales = hospital.crearHospital();
//		hospital.repartirAlmuerzo(hospitales);
//		hospital.eliminarHospital(hospitales);

		// Instacia clase Cine
		ArrayList<Cine> cines = new ArrayList<Cine>();
		Cine cine = new Cine(null, 0, 0, 0, 0);
		cines = cine.crearEdificioCine();

		System.out.print("Numero de asistentes: ");
		int numAsistentes = edificio.pedirNumero();

		System.out.print("Precio entradas: ");
		int precioEntrdas = edificio.pedirNumero();

		cine.proyectarSession(numAsistentes, precioEntrdas);
		cine.eliminarCine(cines);

	}
}