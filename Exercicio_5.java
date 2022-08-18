package coquinhaGelada;

import javax.swing.JOptionPane;

public class Exercicio_5 {

	public static void main(String[] args) {
		String nome, faixaDeRisco;
		float peso = 0f, altura = 0f, imc = 0f;
		
		nome = JOptionPane.showInputDialog("Insira seu nome:");
		peso = Float.parseFloat(JOptionPane.showInputDialog("Quanto você pesa?"));
		altura = Float.parseFloat(JOptionPane.showInputDialog("Quanto de altura você tem?"));
		
		imc = peso / (altura * altura);
		
		if (imc < 20)
			faixaDeRisco = "Abaixo do Peso";
		else {
			if (imc >= 20 && imc < 25)
				faixaDeRisco = "Normal";
			else {
				if (imc >= 25 && imc < 35)
					faixaDeRisco = "Excesso de Peso";
				else {
					if (imc >= 35 && imc < 50)
						faixaDeRisco = "Obesidade";
					else
						faixaDeRisco = "Obesidade Mórbida";
				}
			}
		}
		
		System.out.println(nome + " você está na faixa de risco: " + faixaDeRisco);
	}

}
