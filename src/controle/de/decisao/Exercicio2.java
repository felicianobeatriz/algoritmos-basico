package controle.de.decisao;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe um número");
		int numero = scan.nextInt();
		
		if (numero < 0) {
			System.out.println("O numero era negativo " + Integer.toString(numero*-1));
		} else {
			System.out.println("O numero já era positivo  " + Integer.toString(numero));
		}

	}

}
