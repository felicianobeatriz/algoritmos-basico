package laco.de.repeticao.dois;

public class Exercicio7 {

	public static void main(String[] args) {
		int i = 0;

		do {
			int expoente = (int) Math.pow(3, i);
			System.out.println("3 elevado a " + i + " é " + expoente);
			i++;
		} while (i <= 15);
	}

}
