package coquinhaGelada;

import java.util.Random;

public class Exercicio_15 {

	public static void main(String[] args) {
		char A [] = new char[80];
		int totalAs = 0;
		
		Random gerador = new Random();
		
		for (int i = 0; i < A.length; i++)
		{
			A[i] = Character.toString((char) gerador.nextInt(65, 90)).charAt(0);
		}

		for (int j = 0; j < A.length; j++)
		{
			if (A[j] == 'A')
			{
				totalAs++;
			}
		}
		
		if (totalAs > 0)
			System.out.println("A letra \"A\" apareceu " + totalAs + " vezes.");
		else
			System.out.println("Não há ocorrências da letra A no vetor!");
	}	
}
