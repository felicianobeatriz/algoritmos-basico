package controle.de.decisao;

import java.util.Scanner;

public class Exercicio8 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = 5;
		int i = 0;
		int maior = 0;
		int menor = -1;
		int numero = 0;
		int numeros[] = new int[n];
		int after = 1;
		
		for (i=0; i<n; i++) {
			System.out.println("Digite um número:");
			numeros[i] = scan.nextInt();
		}
		
		for (i=0; i<numeros.length; i++) {
			if (i==0) {
                maior = numeros[i];
                menor = numeros[i];
            }
			
			if(numeros[i] > maior) {
				maior = numeros[i];
			} 
			
			if(numeros[i] < menor) {
				menor = numeros[i];
			} 
		}
		System.out.println(maior);
		System.out.println(menor);
	}
}
