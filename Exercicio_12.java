package coquinhaGelada;

public class Exercicio_12 {

	public static void main(String[] args) {
		int B [] = new int[50];
		
		for (int i = 0; i < 50; i++)
		{
			B[i] = i;
		}

		for (int j = B.length - 1; j >= 0; j--)
		{
			System.out.print(" " + B[j]);
		}
		
		System.out.println();
	}

}
