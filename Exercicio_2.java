package coquinhaGelada;

import javax.swing.*;

public class Exercicio_2 {

	public static void main(String[] args) {
		int a, b;
		String mensagem;
		
		a = Integer.parseInt(JOptionPane.showInputDialog("Insira o número A: "));
		b = Integer.parseInt(JOptionPane.showInputDialog("Insira o número B: "));
		
		if (a > b)
			mensagem = "A é maior que B";
		else {
			if (b > a)
				mensagem = "B é maior que A";
			else
				mensagem = "A é igual a B";
		}
		
		System.out.println(mensagem);
			
	}

}
