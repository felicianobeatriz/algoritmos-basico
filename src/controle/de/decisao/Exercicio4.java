package controle.de.decisao;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite a primeira nota:");
		double nota1 = scan.nextDouble();
		System.out.println("Digite a segunda nota:");
		double nota2 = scan.nextDouble();
		System.out.println("Digite a terceira nota:");
		double nota3 = scan.nextDouble();
		System.out.println("Digite a quarta nota:");
		double nota4 = scan.nextDouble();
		
		double media = (nota1 + nota2 + nota3 + nota4)/2;
		
		media = (media > 10)  ? 10 : media;
		
		if (media >= 7) {
			System.out.println("Aluno aprovado! Com média: " + Double.toString(media));
		} else {
			System.out.println("Favor inserir nota de exame");
			double exame = scan.nextDouble();
			
			media = (nota1 + nota2 + nota3 + nota4 + exame)/2;
			
			if( media >= 5) {
				System.out.println("Aluno aprovado por exame! Com média; " + Double.toString(media));
			} else {
				System.out.println("Aluno reprovado! Com média: " + Double.toString(media));
			}
		}
	}

}
