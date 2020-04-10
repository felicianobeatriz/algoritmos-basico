package laco.de.repeticao.dois;

public class Exercicio1 {

	public static void main(String[] args) {
		int i = 15;
		
		do {
			int quadrado = (int) Math.pow(i, 2);
			System.out.println("O quadrado é: " + quadrado);
			i++;
		} while(i <= 200);

	}

}
