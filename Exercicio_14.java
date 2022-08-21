package coquinhaGelada;

import java.util.Random;

public class Exercicio_14 {

	public static void main(String[] args) {
		int B [] = new int[10];
		int ocorrencia = 0;
		
		Random gerador = new Random();
		
		for (int i = 0; i < 10; i++)
		{
			B[i] = gerador.nextInt(100);
		}
		
		for (int j = 0; j < 10; j++)
		{
			if (B[j] == 30)
			{
				System.out.println("Valor 30 encontrado na posição " + j);
				ocorrencia++;
			}
		}

		if (ocorrencia == 0)
		{
			System.out.println("Nenhum numero 30 foi encontrado!");
		}
	}

}
