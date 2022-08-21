package coquinhaGelada;

import javax.swing.*;

public class Exercicio_11 {

	public static void main(String[] args) {
		int A [] = new int[100];
		int somatorio = 0;
		
		for (int i = 0; i < A.length; i++)
		{
			A[i] = Integer.parseInt(JOptionPane.showInputDialog("Insira um número:"));
		}
		
		for (int i = 0; i < A.length; i++)
		{
			somatorio += A[i];
		}

		System.out.println("O somatório dos números no array é de " + somatorio);
	}

}
