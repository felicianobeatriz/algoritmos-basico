package laco.de.repeticao.tres;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("Digite um número");
		int n = s.nextInt();
		
		for(int i=1; i<=10; i++) {
			int resultado = i*n;
			System.out.println(n + " x " + i + "= " + resultado);
		}

	}

}
