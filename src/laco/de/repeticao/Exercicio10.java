package laco.de.repeticao;

public class Exercicio10 {

	public static void main(String[] args) {
		int celsius = 0;
		double fahrenheit = 0;
		
		while(celsius <= 100 ){
			fahrenheit = (celsius*9.5)+32;
			System.out.println(celsius + "graus celcius equivalem a "+ fahrenheit + "fahrenheit");
			celsius +=10;
		}
	}

}
