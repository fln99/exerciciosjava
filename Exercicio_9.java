package coquinhaGelada;

import javax.swing.*;

public class Exercicio_9 {

	public static void main(String[] args) {
		double salario, valorFinanciamento;
		
		salario = Double.parseDouble(JOptionPane.showInputDialog("Insira o valor do seu salário:"));
		valorFinanciamento = Double.parseDouble(JOptionPane.showInputDialog("Insira o valor do financiamento:"));
		
		if (valorFinanciamento <= salario * 5)
			System.out.println("Financiamento Concedido");
		else
			System.out.println("Financiamento Negado");
		
		System.out.println("Obrigado por nos consultar.");
	}

}
