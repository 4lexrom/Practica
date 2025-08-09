package m8.ejercicio4;

public class Edificio {
	private String nombre;
	private int numPlantas;
	private int superficie;

	public Edificio(String nombre, int numPlantas, int superficie) {
		this.nombre = nombre;
		this.numPlantas = numPlantas;
		this.superficie = superficie;
	}

	public void limpiar() {
		int tiempoPorM2;
		int tiempoPorPlanta;
		int totalTiempoLimpieza;
		int costePorMinuto;
		int costePorMes;

		tiempoPorM2 = (int) Math.ceil(this.superficie / 5); // Devuelve Minutos
		tiempoPorPlanta = (this.numPlantas * 30) / 60; // Devuelve Minutos
		totalTiempoLimpieza = (tiempoPorM2 + tiempoPorPlanta); // Devuelve Minutos
		costePorMinuto = (totalTiempoLimpieza / 60) * 1; // coste por minuto de trabajo
		costePorMes = costePorMinuto * 30;

		System.out.println("Tiempo de duracion de limpieza " + (totalTiempoLimpieza / 60) + "Hrs.");
	}

	public String getNombre() {
		return nombre;
	}

	public int getNumPlantas() {
		return numPlantas;
	}

	public int getSuperficie() {
		return superficie;
	}
}