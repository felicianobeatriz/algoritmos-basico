package controle.de.decisao.dois;

import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe o F para feminino e M para masculino");
		String sexo = scan.nextLine();
		
		switch(sexo) {
		case "M":
			System.out.println("Masculino");
			break;
		case "F":
			System.out.println("Feminino");
			break;
		default:
			System.out.println("Valor inválido");
		}

	}

}
