package controle.de.decisao;

import java.util.Scanner;

public class Exercicio10 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite um n�mero");
		int num = scan.nextInt();
		
		if(num >= 1 && num <=9) {
			System.out.println("Est� dentro da faixa permitida");
		} else {
			System.out.println("Est� fora da faixa permitida");
		}

	}

}
