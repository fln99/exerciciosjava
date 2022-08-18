package coquinhaGelada;

import javax.swing.*;

public class Exercicio_3 {

	public static void main(String[] args) {
		String nome, situacao;
		float notaTrabalho = 0f, notaProva = 0f, media = 0f;
		
		nome = JOptionPane.showInputDialog("Insira seu nome: ");
		notaTrabalho = Float.parseFloat(JOptionPane.showInputDialog("Insira sua nota do trabalho: "));
		notaProva = Float.parseFloat(JOptionPane.showInputDialog("Insira sua nota da prova: "));

		media = (notaTrabalho + notaProva) / 2;
		
		if (media > 7)
			situacao = "Aprovado";
		else 
			situacao = "Reprovado";
		
		System.out.println(nome + " você está " + situacao + "!");
	}

}
