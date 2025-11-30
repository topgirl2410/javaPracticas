package ejerciciosScanner;

import java.util.Scanner;

public class Promedio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		System.out.print("Numero 1: ");
		double num1 = sc.nextDouble();

		System.out.print("Numero 2: ");
		double num2 = sc.nextDouble();

		System.out.print("Numero 3: ");
		double num3 = sc.nextDouble();

		double promedio = (num1 + num2 + num3) / 3;

		System.out.println("Promedio: " + promedio);
	}

}
