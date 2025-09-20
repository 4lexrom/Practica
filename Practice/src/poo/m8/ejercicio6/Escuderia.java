package poo.m8.ejercicio6;

import java.util.ArrayList;
import java.util.List;

public class Escuderia implements Buscable<Escuderia> {

	private int id;
	private static int contadorId = 1;
	private String nombre;
	private double presupuesto;
	private String paisOrigen;
	private int cantidadCoches;

	private static List<Escuderia> escuderias = new ArrayList<Escuderia>();

	public Escuderia(String nombre, double presupuesto, String paisOrigen, int cantidadCoches) {
		super();
		this.nombre = nombre;
		this.presupuesto = presupuesto;
		this.paisOrigen = paisOrigen;
		this.cantidadCoches = cantidadCoches;
		this.id = contadorId;
		contadorId++;
	}

	public Escuderia() {

	}

	public List<Escuderia> crear() {
		Escuderia e1 = new Escuderia("Ferrari", 200.000, "Alemania", 2);
		Escuderia e2 = new Escuderia("McLaren", 500.000, "Suiza", 1);
		Escuderia e3 = new Escuderia("Mercedez", 350.000, "Alemania", 3);
		Escuderia e4 = new Escuderia("Red bull", 920.000, "Canada", 2);

		escuderias.add(e1);
		escuderias.add(e2);
		escuderias.add(e3);
		escuderias.add(e4);

		return escuderias;
	}

	public void ver() {
		for (Escuderia escuderia : escuderias) {
			System.out.println("Escuderia: " + escuderia.getNombre() + "\n" 
					+ "Presupuesto: " + escuderia.getPresupuesto() + "\n"
					+ "Pais de origen: " + escuderia.getPaisOrigen() + "\n"
					+ "Cantidad de coches: " + escuderia.getCantidadCoches());
		}
	}

	public Escuderia buscarPorId(int id) {
		return this.id == id ? this : null;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getPresupuesto() {
		return presupuesto;
	}

	public void setPresupuesto(double presupuesto) {
		this.presupuesto = presupuesto;
	}

	public String getPaisOrigen() {
		return paisOrigen;
	}

	public void setPaisOrigen(String paisOrigen) {
		this.paisOrigen = paisOrigen;
	}

	public int getCantidadCoches() {
		return cantidadCoches;
	}

	public void setCantidadCoches(int cantidadCoches) {
		this.cantidadCoches = cantidadCoches;
	}
}