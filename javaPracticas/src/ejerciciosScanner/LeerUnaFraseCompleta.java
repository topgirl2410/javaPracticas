package ejerciciosScanner;

import java.util.Scanner;

public class LeerUnaFraseCompleta {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		System.out.print("Dime una frase: ");
		String frase = sc.nextLine();

		System.out.println("La frase tiene " + frase.length() + " carecteres");
	}

}
