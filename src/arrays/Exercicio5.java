package arrays;
import java.util.Random;

public class Exercicio5 {

	public static void main(String[] args) {
		Random random = new Random();
		
		int[] vetorA = new int [10];
		int[] vetorB = new int [10];
		
		for (int i = 0; i < vetorA.length; i++) {
			vetorA[i] = random.nextInt(10);
			System.out.println("Vetora A:" +vetorA[i]);
		}
		
		for (int i = 0; i < vetorB.length; i++) {
			vetorB[i] = vetorA[i]*1;
			System.out.println("Vetora B:" +vetorB[i]);
		}
		
	}

}
