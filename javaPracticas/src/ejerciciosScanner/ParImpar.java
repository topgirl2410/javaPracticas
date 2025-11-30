package ejerciciosScanner;

import java.util.Scanner;

public class ParImpar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		System.out.print("Ingresa un numero: ");
		int num = sc.nextInt();

		if (num % 2 == 0) {
			System.out.println("Es par");
		} else {
			System.out.println("Es impar");
		}
	}

}
