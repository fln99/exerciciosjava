package coquinhaGelada;

import javax.swing.*;

public class Exercicio_8 {

	public static void main(String[] args) {
		double salarioBruto, valorPrestacao;
		
		salarioBruto = Double.parseDouble(JOptionPane.showInputDialog("Insira o valor bruto do seu salário:"));
		valorPrestacao = Double.parseDouble(JOptionPane.showInputDialog("Insira o valor de cada prestação:"));
		
		if (valorPrestacao > salarioBruto * 0.30)
			System.out.println("O empréstimo não pode ser concedido.");
		else
			System.out.println("O empréstimo pode ser concedido.");
	}

}
