package controle.de.decisao.dois;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe o valor da compra");
		double valor = scan.nextDouble();
		System.out.println("Pressione 1 para cliente e 2 para funcionario");
		int opcao = scan.nextInt();
		
		switch (opcao) {
		case 1:
			System.out.println(Double.toString(valor-(valor*0.01)));
			break;
		case 2:
			System.out.println(Double.toString(valor-(valor*0.05)));
			break;
		default:
			System.out.println("Opção inválida");
		}
	}

}
