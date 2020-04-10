package laco.de.repeticao;

public class Exercicio9 {

	public static void main(String[] args) {
		int i = 0;
		int n1 = 1;
		int n2 = 0;
		
		while(i<=34){
			n1 = n1 + n2;
            n2 = n1 - n2;
			System.out.println(n2);
			i ++;
		}

	}

}
