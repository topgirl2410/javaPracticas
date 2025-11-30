package ejerciciosScanner;

import java.util.Scanner;

public class HorasTrabajadas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		System.out.print("Horas trabajadas: ");
		double horas = sc.nextDouble();

		System.out.print("Pago por hora: ");
		double pago = sc.nextDouble();

		double salario = horas * pago;

		System.out.println("Salario semanal: $" + salario);
	}

}
