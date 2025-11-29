package javaPracticas;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		System.out.print("Ingresa el primer numero: ");
		int n1 = sc.nextInt();

		System.out.print("Ingresa el segundo numero: ");
		int n2 = sc.nextInt();

		int suma = n1 + n2;

		System.out.println("La suma es: " + suma);
	}

}
