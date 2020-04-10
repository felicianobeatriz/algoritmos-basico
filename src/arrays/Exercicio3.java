package arrays;
import java.util.Random;

public class Exercicio3 {

	public static void main(String[] args) {
		Random random = new Random();
		
		int[] vetorA = new int[15];
		int[] vetorB = new int[15];
		
		for (int i = 0; i < vetorA.length; i++) {
			vetorA[i] = random.nextInt(30);
			System.out.println("VetorA: " + vetorA[i]);
		}
		
		for (int i = 0; i < vetorB.length; i++) {
			vetorB[i] = (int) Math.pow(vetorA[i], 2);
			System.out.println("VetorB: " + vetorB[i]);
		}
	}

}
