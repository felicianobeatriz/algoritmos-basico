package controle.de.decisao.dois;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int quantidade;
		double valor;
		
		System.out.println("Informe o código do pedido");
		int pedido = scan.nextInt();
		
		switch(pedido) {
		case 100:
			System.out.println("Quantas unidades de cachorro quente?");
			quantidade = scan.nextInt();
			valor = quantidade * 1.75;
			System.out.println(quantidade + " unidades de cachorro quente por: " + valor);
			break;
		case 101:
			System.out.println("Quantas unidades de bauru?");
			quantidade = scan.nextInt();
			valor = quantidade * 1.00;
			System.out.println(quantidade + " unidades de bauru por: " + valor);
			break;
		case 102:
			System.out.println("Quantas unidades de x-tudo?");
			quantidade = scan.nextInt();
			valor = quantidade * 2.10;
			System.out.println(quantidade + " unidades de x-tudo por: " + valor);
			break;
		case 103:
			System.out.println("Quantas unidades de pão na chapa?");
			quantidade = scan.nextInt();
			valor = quantidade * 0.50;
			System.out.println(quantidade + " unidades de pão na chapa por: " + valor);
			break;
		default:
			System.out.println("Produto não cadastrado");
		}

	}

}
