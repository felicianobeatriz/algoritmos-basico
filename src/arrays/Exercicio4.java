package arrays;
import java.util.Random;
public class Exercicio4 {

	public static void main(String[] args) {
		
		Random random = new Random();
		
		int[] vetorA = new int [15];
		double[] vetorB = new double [15];
		
		for (int i = 0; i < vetorA.length; i++) {
			vetorA[i] = random.nextInt(10);
		}
		
		for (int i = 0; i < vetorB.length; i++) {
			vetorB[i] = Math.sqrt(vetorA[i]);
			System.out.println(vetorB[i]);
		}
		
	}

}
