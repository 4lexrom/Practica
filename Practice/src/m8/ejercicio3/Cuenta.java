package m8.ejercicio3;

public class Cuenta {
	private int numCuenta;
	private double saldo;

	public Cuenta(int numCuenta) {
		this.numCuenta = numCuenta;
		this.saldo = 0;
	}

	public int getnumCuenta() {
		return numCuenta;
	}

	public void setnumCuenta(int numCuenta) {
		this.numCuenta = numCuenta;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public double ingresarDinero(double cantidad) {
		return saldo += cantidad;
	}

	public double retirarDinero(double cantidad) {
		return saldo -= cantidad;
	}
}