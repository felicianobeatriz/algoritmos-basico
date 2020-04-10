package controle.de.decisao;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe a primeira nota");
		double nota1 = scan.nextDouble();
		System.out.println("Informe a segunda nota");
		double nota2 = scan.nextDouble();
		System.out.println("Informe a terceira nota");
		double nota3 = scan.nextDouble();
		System.out.println("Informe a quarta nota");
		double nota4 = scan.nextDouble();
		
		double media = (nota1 + nota2 + nota3 + nota4)/2;
		
		media = (media >10) ? 10: media;
		
		if (media >= 5) {
			System.out.println("O aluno foi aprovado! Coma a média: " + Double.toString(media));
		} else {
			System.out.println("O aluno foi reprovado! Coma a média: " + Double.toString(media));
		}
	}

}
