package poo.m8.ejercicio4;

import java.util.List;

public class GestorEdificios {
	
	public GestorEdificios() {
		super();
	}

	public void gestionarHospital(Hospital hospital, List<Edificio> edificios) {
		edificios.add(hospital.crearEdificio());

		hospital.calcularCosteVigilancia(edificios);
		hospital.limpiarEdificio(edificios);
		hospital.repartirAlmuerzo(edificios);
		hospital.consultarEdificio(edificios);
		hospital.eliminarEdificio(edificios);
		hospital.verInfoEdificio(edificios);
	}

	public void gestionarCine(Cine cine, List<Edificio> edificios) {
		int numAsistentes;
		double precioEntrada;

		edificios.add(cine.crearEdificio());

		cine.textoDescriptivo("Cantidad de asistentes: ");
		numAsistentes = cine.pedirNumero();

		cine.textoDescriptivo("Precio entrada: ");
		precioEntrada = cine.pedirNumero();

		cine.proyectarSession(edificios, numAsistentes, precioEntrada);
		cine.calcularCosteVigilancia(edificios);
		cine.limpiarEdificio(edificios);
		cine.consultarEdificio(edificios);
		cine.eliminarEdificio(edificios);
		cine.verInfoEdificio(edificios);
	}

	public void gestionarHotel(Hotel hotel, List<Edificio> edificios) {
		edificios.add(hotel.crearEdificio());

		hotel.calcularCosteVigilancia(edificios);
		hotel.limpiarEdificio(edificios);
		hotel.calcularServHabitaciones();
		hotel.consultarEdificio(edificios);
		hotel.eliminarEdificio(edificios);
		hotel.verInfoEdificio(edificios);
	}
}