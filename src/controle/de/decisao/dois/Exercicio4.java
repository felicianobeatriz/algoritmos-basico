package controle.de.decisao.dois;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int nascidos, habitantes, mortos, taxa;
		
		System.out.println("Digite 1-nascimentos ou 2-obitos");
	    int opcao = scan.nextInt();
	    
	    switch(opcao) {
	    case 1:
	    	System.out.println("Digite a quantidade de nascidos");
		    nascidos = scan.nextInt();
		    System.out.println("Digite a quantidade de habitantes");
		    habitantes = scan.nextInt();
		    taxa = (nascidos*1000)/habitantes;
	    	System.out.println("A taxa de nascimentos é de: " + Integer.toString(taxa));
	    	break;
	    case 2:
	    	System.out.println("Digite a quantidade de mortos");
		    mortos = scan.nextInt();
		    System.out.println("Digite a quantidade de habitantes");
		    habitantes = scan.nextInt();
		    taxa = (mortos*1000)/habitantes;
	    	System.out.println("A taxa de nascimentos é de: " + Integer.toString(taxa));
	    	break;
	    default:
	    	System.out.println("Opção inválida");	
	    }

	}

}
