package controle.de.decisao;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in); 
		
		System.out.println("Informe um n�mero");
		double numero1 = scan.nextDouble();
		System.out.println("Informe outro n�mero");
		double numero2 = scan.nextDouble();
		
		if(numero1 > numero2) {
			System.out.println("A diferen�a entre "+ numero1 + " e " + numero2 + " �: " + String.valueOf(numero1-numero2));
		} else {
			System.out.println("A diferen�a entre "+ numero2 + " e " + numero1 + " �: " + String.valueOf(numero2-numero1));
		}
	}

}
