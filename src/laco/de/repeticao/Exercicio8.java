package laco.de.repeticao;

import java.util.Scanner;

public class Exercicio8 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int resultado = 0;
		System.out.println("Digite a base: ");
		int base = scan.nextInt();
		System.out.println("Digite o expoente: ");
		int exp = scan.nextInt();
		
		resultado = (int)Math.pow(base, exp);
		System.out.println(resultado);
	}

}
