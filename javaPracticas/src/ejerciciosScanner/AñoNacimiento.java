package ejerciciosScanner;

import java.util.Scanner;

public class AñoNacimiento {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		System.out.print(" Año de nacimiento: ");
		int nacimiento = sc.nextInt();

		int edad = 2025 - nacimiento;

		System.out.println("Tu edad es: " + edad);
	}

}
