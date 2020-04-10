package laco.de.repeticao.dois;

import java.util.Scanner;

public class Exercicio8 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite a base");
		int base = scan.nextInt();
		System.out.println("Digite o expoente");
		int expoente = scan.nextInt();
		
		int resultado = (int) Math.pow(base, expoente);
		System.out.println(resultado);
	}

}
