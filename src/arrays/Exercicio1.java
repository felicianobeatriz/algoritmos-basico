package arrays;

public class Exercicio1 {

	public static void main(String[] args) {

		int[] vetorA = new int[5];
		int[] vetorB = new int[5];
		
		vetorA[0] = 10;
		vetorA[1] = 25;
		vetorA[2] = 34;
		vetorA[3] = 45;
		vetorA[4] = 32;
		
		for(int i = 0; i < vetorB.length; i++) {
			vetorB[i] = vetorA[i];
			System.out.println(vetorB[i]);
		}	
	}

}
