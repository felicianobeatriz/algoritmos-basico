package laco.de.repeticao;

public class Exercicio1 {

	public static void main(String[] args) {
		
		int i = 15;
		
		while(i <= 200) {
			int quadrado = (int) Math.pow(i, 2);
			System.out.println("O valor de " + i + " ao quadrado é:" + quadrado);
			i++;
		}

	}

}
