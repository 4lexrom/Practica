package basic;

import java.util.Scanner;

/* M4 EJERCICIO EXTRA 6 */
public class PiedraPapelTijera {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		int numRandom = (int) (Math.random() * 3) + 1;
		int numUsu;

		System.out.println(numRandom);

		System.out.print("Ingresa un numero: ");
		numUsu = entrada.nextInt();

		if (numUsu >= 1 && numUsu <= 3) {
			switch (numUsu) {
			case 1: {
				if (numRandom == 3 && numUsu == 1) {
					System.out.println("Yo piedra, tu tijera. ¡He ganado!");
					break;
				}
			}
			case 2: {
				if (numRandom == 1 && numUsu == 2) {
					System.out.println("Yo papel, tu piedra. ¡He ganado!");
					break;
				}
			}
			case 3: {
				if (numRandom == 2 && numUsu == 3) {
					System.out.println("Yo tijera, tu papel. ¡He ganado!");
					break;
				}
			}
			default:
				if (numUsu == numRandom) {
					System.out.println("¡Empate!");
				} else {
					System.out.println("¡Has ganado!");
				}
			}
		} else {
			System.out.println("Entiendo que no quieres jugar. ¡Adios!");
		}
	}
}