package m8.ejercicio1;

public class Ordenador {
	String marca;
	String modelo;
	String procesador;
	int memoriaRAM;
	int capDiscoDuro;

	public Ordenador(String marca, String modelo) {
		this.marca = marca;
		this.modelo = modelo;
	}

	public Ordenador(String marca, String modelo, String procesador, int memoriaRAM, int capDiscoDuro) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.procesador = procesador;
		this.memoriaRAM = memoriaRAM;
		this.capDiscoDuro = capDiscoDuro;
	}

	@Override
	public String toString() {
		return "Marca: " + getMarca() + "\nModelo: " + getModelo() + "\nProcesador: " + getProcesador() + "\nRam: "
				+ getMemoriaRAM() + "\nDisco duro: " + getCapDiscoDuro();
	}

	public String mensaje(String texto) {
		return "En estos momentos se esta ejecutando " + texto;
	}

	public String getMarca() {
		return marca;
	}

	public String getModelo() {
		return modelo;
	}

	public String getProcesador() {
		return procesador;
	}

	public void setProcesador(String procesador) {
		this.procesador = procesador;
	}

	public int getMemoriaRAM() {
		return memoriaRAM;
	}

	public void setMemoriaRAM(int memoriaRAM) {
		this.memoriaRAM = memoriaRAM;
	}

	public int getCapDiscoDuro() {
		return capDiscoDuro;
	}

	public void setCapDiscoDuro(int capDiscoDuro) {
		this.capDiscoDuro = capDiscoDuro;
	}

}
