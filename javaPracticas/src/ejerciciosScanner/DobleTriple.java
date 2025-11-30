package ejerciciosScanner;

import java.util.Scanner;

public class DobleTriple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Ingresa un numero: ");
		int num1 = sc.nextInt();

		System.out.println("Doble: " + (num1 * 2));
		System.out.println("Triple: " + (num1 * 3));
	}

}
