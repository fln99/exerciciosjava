package coquinhaGelada;

import java.util.Random;
import javax.swing.*;

public class Exercicio_13 {

	public static void main(String[] args) {
		int numero [] = new int[10];
		int m;
		
		Random gerador = new Random();
		
		for (int i = 0; i < 10; i++)
		{
			numero[i] = gerador.nextInt(10);
		}

		m = Integer.parseInt(JOptionPane.showInputDialog("Insira um valor M para ser descoberto no vetor:"));
		
		for (int j = 0; j < 10; j++)
		{
			if (numero[j] == m) {
				System.out.println("Valor encontrado!");
				System.exit(0);
			}
		}
		
		System.out.println("Valor não encontrado!");
	}

}
