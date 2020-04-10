package controle.de.decisao;

import java.util.Scanner;

public class Exercicio12 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite um nome");
		String nome = scan.nextLine();
		
		System.out.println("Digite um sexo");
		String sexo = scan.nextLine();
		
		if(sexo == "Feminino") {
			System.out.println("Sra." + nome);
		} else {
			System.out.println("Sr." + nome);
		}
	}

}
