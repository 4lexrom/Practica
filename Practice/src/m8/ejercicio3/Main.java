package m8.ejercicio3;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		menu();
		opciones();
	}

	public static void textoDescriptivo(String texto) {
		System.out.print(texto);
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

	public static void menu() {
		textoDescriptivo("0. Salir de la aplicacion." + "\n" + "1. Crear cliente." + "\n" + "2. Eliminar cliente."
				+ "\n" + "3. Crear cuenta de un cliente." + "\n" + "4. Ingresar euros." + "\n" + "5. Retirar dinero."
				+ "\n" + "6. Asignar numero de cuenta a cliente." + "\n");
	}

	public static void opciones() {
		ArrayList<Cliente> clientes = new ArrayList<Cliente>();
		ArrayList<Cuenta> cuentas = new ArrayList<Cuenta>();
		String nombreCliente = "";
		boolean salir = false;
		int numCuenta = 0;
		int opcion;

		while (!salir) {
			textoDescriptivo("\nElije una opcion: ");
			opcion = pedirNumero();
			switch (opcion) {
			case 0:
				textoDescriptivo("Haz cerrado el programa...");
				salir = true;
				break;
			case 1:
				clientes = crearCliente();
				break;
			case 2:
				textoDescriptivo("Escribe el nombre del cliente que deseas borrar: ");
				nombreCliente = pedirTexto();
				eliminarCliente(clientes, nombreCliente);
				break;
			case 3:
				cuentas = crearCuenta();
				break;
			case 4:
				textoDescriptivo("Digita la cuenta de donde haras el ingreso: ");
				numCuenta = pedirNumero();
				ingresarDinero(cuentas, numCuenta);
				break;
			case 5:
				textoDescriptivo("Digita la cuenta de donde haras el retiro: ");
				numCuenta = pedirNumero();
				retirarDinero(cuentas, numCuenta);
				break;
			case 6:
				textoDescriptivo("Nombre del cliente para asignar cuenta: ");
				nombreCliente = pedirTexto();
				/*
				 * textoDescriptivo("Digita la cuenta que vas asignar: "); numCuenta =
				 * pedirNumero();
				 */
				asignarCuentaCliente(clientes, nombreCliente, cuentas/* , numCuenta */);
				break;
			}
		}
	}

	public static ArrayList<Cliente> crearCliente() {
		ArrayList<Cliente> clientes = new ArrayList<Cliente>();
		String nombre, apellido;
		for (int i = 0; i < 2; i++) {
			textoDescriptivo("\t Cliente " + (i + 1) + "\n");
			textoDescriptivo("Nombre: ");
			nombre = pedirTexto();
			textoDescriptivo("Apellido: ");
			apellido = pedirTexto();
			clientes.add(new Cliente(nombre, apellido));
		}
		return clientes;
	}

	public static ArrayList<Cuenta> crearCuenta() {
		ArrayList<Cuenta> cuentas = new ArrayList<Cuenta>();
		int numCuenta;
		for (int i = 0; i < 3; i++) {
			textoDescriptivo("\t Cuenta " + (i + 1) + "\n");
			textoDescriptivo("Digita numero de cuenta: ");
			numCuenta = pedirNumero();
			cuentas.add(new Cuenta(numCuenta));
		}
		return cuentas;
	}

	public static int buscarNumeroCuenta(ArrayList<Cuenta> cuentas, int numCuenta) {
		boolean encontrado = false;
		int cuentaActual;
		int indice = 0;
		int i = 0;

		while (!encontrado && i < cuentas.size()) {
			cuentaActual = cuentas.get(i).getnumCuenta();
			if (cuentaActual == numCuenta) {
				encontrado = true;
				indice = i;
			} else {
				indice = -1;
			}
			i++;
		}
		return indice;
	}

	public static void ingresarDinero(ArrayList<Cuenta> cuentas, int numCuenta) {
		double cantidad;

		int indiceCuenta = buscarNumeroCuenta(cuentas, numCuenta);

		if (indiceCuenta == -1) {
			textoDescriptivo("La cuenta " + numCuenta + " no existe!");
		} else if (numCuenta == cuentas.get(indiceCuenta).getnumCuenta()) {
			textoDescriptivo("Saldo actual: " + cuentas.get(indiceCuenta).getSaldo() + "\n");
			textoDescriptivo("Ingresar dinero a la cuenta  " + cuentas.get(indiceCuenta).getnumCuenta() + ": ");
			cantidad = (double) pedirNumero();
			cuentas.get(indiceCuenta).ingresarDinero(cantidad);
			textoDescriptivo("Nuevo saldo de la cuenta " + cuentas.get(indiceCuenta).getnumCuenta() + ": "
					+ cuentas.get(indiceCuenta).getSaldo() + "\n");
		}
	}

	public static void retirarDinero(ArrayList<Cuenta> cuentas, int numCuenta) {
		double cantidad;

		int indiceCuenta = buscarNumeroCuenta(cuentas, numCuenta);

		if (indiceCuenta == -1) {
			textoDescriptivo("La cuenta " + numCuenta + " no existe!");
		} else if (numCuenta == cuentas.get(indiceCuenta).getnumCuenta()) {
			if (cuentas.get(indiceCuenta).getSaldo() > 0) {
				textoDescriptivo("Saldo actual: " + cuentas.get(indiceCuenta).getSaldo() + "\n");
				textoDescriptivo("Retirar dinero de la cuenta " + cuentas.get(indiceCuenta).getnumCuenta() + ": ");
				cantidad = (double) pedirNumero();
				cuentas.get(indiceCuenta).retirarDinero(cantidad);
				textoDescriptivo("Nuevo saldo de la cuenta " + cuentas.get(indiceCuenta).getnumCuenta() + ": "
						+ cuentas.get(indiceCuenta).getSaldo() + "\n");
			} else {
				textoDescriptivo(
						"El saldo actual es " + cuentas.get(indiceCuenta).getSaldo() + ", fondos insuficientes");
			}
		}
	}

	public static void eliminarCliente(ArrayList<Cliente> clientes, String nombreCliente) {

		int indiceCliente = buscarCliente(clientes, nombreCliente);

		if (indiceCliente == -1) {
			textoDescriptivo("El cliente " + nombreCliente + " no existe!");
		} else if (nombreCliente.equalsIgnoreCase(clientes.get(indiceCliente).getNombre())) {
			clientes.remove(indiceCliente);
			textoDescriptivo("Se elimino el cliente: " + nombreCliente + "\n");
		}
		verClientes(clientes);
	}

	public static void asignarCuentaCliente(ArrayList<Cliente> clientes, String nombreCliente,
			ArrayList<Cuenta> cuentas) {

		ArrayList<Integer> indicesCuentas = new ArrayList<Integer>();
		int cantidad;
		int numCuenta;
		int indiceCuenta;

		int indiceCliente = buscarCliente(clientes, nombreCliente);

		if (indiceCliente == -1) {
			textoDescriptivo("El cliente " + nombreCliente + " no existe!");
		} else {

			textoDescriptivo("Cuantas cuentas quieres asignar: ");
			cantidad = pedirNumero();

			for (int j = 0; j < cantidad; j++) {
				textoDescriptivo((j + 1) + ". " + "Asignar No. cuenta: ");
				numCuenta = pedirNumero();

				indiceCuenta = buscarNumeroCuenta(cuentas, numCuenta);

				if (indiceCuenta == -1) {
					textoDescriptivo("La cuenta " + numCuenta + " no existe!" + "\n");
				} else {
					indicesCuentas.add(indiceCuenta);
				}
			}
			clientes.get(indiceCliente).setCuentas(cuentas, indicesCuentas);
		}
	}

	public static int buscarCliente(ArrayList<Cliente> clientes, String nombreCliente) {
		boolean encontrado = false;
		String nombreActual;
		int indice = 0;
		int i = 0;

		while (!encontrado && i < clientes.size()) {
			nombreActual = clientes.get(i).getNombre();
			if (nombreActual.equalsIgnoreCase(nombreCliente)) {
				indice = i;
				encontrado = true;
			} else {
				indice = -1;
			}
			i++;
		}
		return indice;
	}

	public static void verClientes(ArrayList<Cliente> clientes) {
		textoDescriptivo("\n" + "\tLista actualizada de clientes" + "\n");
		for (Cliente cliente : clientes) {
			textoDescriptivo(cliente.getNombre() + " " + cliente.getApellido() + "\n");
		}
	}
}