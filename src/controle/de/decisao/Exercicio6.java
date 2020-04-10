package controle.de.decisao;

import java.util.Scanner;

public class Exercicio6 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int primeiro = 0, segundo= 0, terceiro= 0;
		
		System.out.println("Digite um número");
		int numero1 = scan.nextInt();
		System.out.println("Digite outro número");
		int numero2 = scan.nextInt();
		System.out.println("Digite mais outro número");
		int numero3 = scan.nextInt();
		
		if (numero1 > numero2 && numero1 > numero3) {
			primeiro = numero1;
			if (numero2 > numero3) {
				segundo = numero2;
				terceiro = numero3;
			} else {
				segundo = numero3;
				terceiro = numero2;
			}
		}
		
		if (numero2 > numero1 && numero2 > numero3) {
			primeiro = numero2;
			if (numero1 > numero3) {
				segundo = numero1;
				terceiro = numero3;
			} else {
				segundo = numero3;
				terceiro = numero1;
			}
		}
		
		if (numero3 > numero1 && numero3 > numero2) {
			primeiro = numero3;
			if (numero1 > numero2) {
				segundo = numero1;
				terceiro = numero2;
			} else {
				segundo = numero2;
				terceiro = numero1;
			}
		}
		

		System.out.println(primeiro);
		System.out.println(segundo);		
		System.out.println(terceiro);
		
	}
}
