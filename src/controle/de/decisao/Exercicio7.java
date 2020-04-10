package controle.de.decisao;

import java.util.Scanner;

public class Exercicio7 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = 4;
		int numeros[] = new int[n];
		int i = 0;

		for (i=0; i<n; i++) {
			System.out.println("Digite um número");
			numeros[i] = scan.nextInt();
		}

		for (i=0; i<numeros.length; i++) {
			if (numeros[i] % 2 ==  0 && numeros[i] % 3 ==  0) {
				System.out.println("O número "+ numeros[i] + " é divisivel por 2 e por 3");
			} else if (numeros[i] % 3 ==  0) {
				System.out.println("O número "+ numeros[i] + " é divisivel por 2");		
			} else if (numeros[i] % 2 ==  0) {
				System.out.println("O número "+ numeros[i] + " é divisivel por 3");
			} else {
				System.out.println("O número não é divisivel nem por 2 nem por 3");
			}
		}
		
	
		

	}

}
