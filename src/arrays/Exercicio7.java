package arrays;

import java.util.Random;

public class Exercicio7 {

	public static void main(String[] args) {
		Random random = new Random();
		
		int[] vetorA = new int[10];
		int[] vetorB = new int[10];
		int[] vetorC = new int[10];
		
		for (int i = 0; i < vetorA.length; i++) {
			vetorA[i] = random.nextInt(10);
		}
		for (int i = 0; i < vetorB.length; i++) {
			vetorB[i] = random.nextInt(10);
		}
		for (int i = 0; i < vetorC.length; i++) {
			vetorC[i] = vetorA[i] - vetorB[i];
			
			System.out.println(vetorA[i] + "- " + vetorB[i] + " = " + vetorC[i]);
		}

	}

}
