package laco.de.repeticao.dois;

public class Exercicio4 {

	public static void main(String[] args) {
		
		int i = 0;
		int soma = 0;
		
		do {
			if(i % 2 == 0) {
				soma += i;
			}
			i++;
		}while(i <= 500);
		
		System.out.println(soma);
	}

}
