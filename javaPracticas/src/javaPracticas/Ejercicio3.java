package javaPracticas;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		// Pedir datos al usuario
		System.out.print("Ingresa la base del rectangulo: ");
		double base = sc.nextDouble();

		System.out.print("Ingresa la altura del rectangulo: ");
		double altura = sc.nextDouble();

		// Calcular el area
		double area = base * altura;

		// Mostrar el resultado
		System.out.println("El area del rectangulo es " + area);
	}

}
