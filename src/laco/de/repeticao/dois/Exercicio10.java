package laco.de.repeticao.dois;

public class Exercicio10 {

	public static void main(String[] args) {
		int celsius = 0;
		double fahrenheit = 10;
		
		do {
			fahrenheit = (celsius*9.5)+32;
			System.out.println(celsius + "graus celcius equivalem a "+ fahrenheit + "fahrenheit");
			celsius +=10;
		} while(celsius <=100);
	}

}
