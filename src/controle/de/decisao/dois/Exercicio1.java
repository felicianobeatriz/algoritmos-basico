package controle.de.decisao.dois;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite um número:");
		int n1 = scan.nextInt();
		System.out.println("Digite outro número:");
		int n2 = scan.nextInt();
		System.out.println("Que operação deseja realizar?");
		System.out.println("1-Adição, 2-Subtração, 3-Multiplicação, 4-Divisão");
		int operacao = scan.nextInt();
		
		switch(operacao) {
		case 1:
			System.out.println(Integer.toString(n1+n2));
			break;
		case 2:
			System.out.println(Integer.toString(n1-n2));
			break;
		case 3:
			System.out.println(Integer.toString(n1*n2));
			break;
		case 4:
			System.out.println(Integer.toString(n1/n2));
			break;
		default:
			System.out.println("Operação inválida3");
		}
		
		

	}

}
