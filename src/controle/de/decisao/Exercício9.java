package controle.de.decisao;

import java.util.Scanner;

public class Exerc�cio9 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite um n�mero");
		int num = scan.nextInt();
		
		if(num % 2 == 0) {
			System.out.println("O n�mero � par");
		} else {
			System.out.println("O n�mero � impar");
		}

	}

}
