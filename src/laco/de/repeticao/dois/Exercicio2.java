package laco.de.repeticao.dois;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int i = 1;
		System.out.println("Digite um numero");
		int numero = scan.nextInt();
		
		do {
			int resultado = numero * i;
			System.out.println(numero + "x" + i + "=" + resultado);
			i++;
		} while (i <= 10);
	}

}
