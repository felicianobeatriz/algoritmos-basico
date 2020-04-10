package controle.de.decisao;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe o valor de A");
		double a = scan.nextDouble();
		System.out.println("Informe o valor de B");
		double b = scan.nextDouble();
		System.out.println("Informe o valor de C");
		double c = scan.nextDouble();
		
		a= (int) Math.pow(-a, 2);
		double delta = a+ (4*a)*b;
		
		double x1 = (-b + Math.sqrt(delta))/2*a;
		
		double x2 = (-b - Math.sqrt(delta))/2*a;
		
		if (x1 == 0 || x2 == 0) {
			System.out.println("Raiz incalida");
		} else {
			System.out.println("A Raiz de x1 é: " + x1);
			System.out.println("A Raiz de x2 é: " + x2);
		}

	}

}
