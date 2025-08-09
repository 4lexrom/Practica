package basic.Arrays;

import java.util.Scanner;

/*
 * M5 EJERCICIO 4
 * Tienes que modificar el programa anterior para añadir una nueva funcionalidad: establecer un número máximo de 5 intentos.
 * Si el usuario acierta el número escogido por el programa antes de estos 5 intentos, el programa muestra el siguiente mensaje 
 * por pantalla: “Enhorabuena, el número es X y has necesitado Y intentos para acertarlo”.
 * Si no acierta el número antes de 5 intentos, el programa muestra por pantalla: "¡Has utilizado demasiados intentos! El número es X".
 * */

public class AdivinarNumeroConIntentos {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		int numeroAuto = (int) Math.ceil((Math.random() * 10));
		int numeroUsu = 0;
		int intentos = 0;

		while (numeroUsu != numeroAuto && intentos < 5) {
			intentos++;
			System.out.print("Ingresa un numero: ");
			numeroUsu = entrada.nextInt();

			if (numeroUsu == numeroAuto) {
				System.out.println("Enhorabuena, el número era " + numeroUsu + " y has necesitado " + intentos
						+ " intentos para adivinarlo");
			}
		}

		if (intentos == 5) {
			System.out.println("¡Has utilizado demasiados intentos! El número es: " + numeroAuto);
		}
	}
}