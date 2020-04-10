package laco.de.repeticao;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int i = 1;
		System.out.println("Digite um número:");
		int numero = scan.nextInt();
		
		while(i <= 10) {
			int resultado = numero * i;
			System.out.println(numero + " X " + i + " = " + resultado);
			i++;
		}
	}

}
