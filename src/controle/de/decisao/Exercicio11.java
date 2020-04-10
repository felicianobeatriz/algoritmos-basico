package controle.de.decisao;

import java.util.Scanner;

public class Exercicio11 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite um número");
		int num = scan.nextInt();
		
		if(num <= 3) {
			System.out.println(num);
		} else {
			System.out.println("Numero inválido");
		}

	}

}
