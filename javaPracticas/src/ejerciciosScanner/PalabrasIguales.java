package ejerciciosScanner;

import java.util.Scanner;

public class PalabrasIguales {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		System.out.print("Primera palabra: ");
		String p1 = sc.nextLine();

		System.out.print("Segunda palabra: ");
		String p2 = sc.nextLine();

		if (p1.equalsIgnoreCase(p2)) {
			System.out.println("Las palabras son iguales");
		} else {
			System.out.println("Las palabras no son iguales");
		}
	}

}
