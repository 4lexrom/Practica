package poo.m8.ejercicio6;

public class Vehiculo {

	private String potencia;
	private int velMaxima;
	private String color;
	private double precio;

	public Vehiculo(String potencia, int velMaxima, String color, double precio) {
		super();
		this.potencia = potencia;
		this.velMaxima = velMaxima;
		this.color = color;
		this.precio = precio;
	}

	public String getPotencia() {
		return potencia;
	}

	public void setPotencia(String potencia) {
		this.potencia = potencia;
	}

	public int getVelMaxima() {
		return velMaxima;
	}

	public void setVelMaxima(int velMaxima) {
		this.velMaxima = velMaxima;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}
}