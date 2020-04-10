package laco.de.repeticao.tres;

public class Exercicio4 {

	public static void main(String[] args) {
		int soma = 0;
		
		for (int i = 0; i < 500; i++) {
			if (i%2 == 0) {
				soma += i;
			}
		}
		System.out.println(soma);
	}

}
