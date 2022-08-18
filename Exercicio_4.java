package coquinhaGelada;

import javax.swing.*;

public class Exercicio_4 {

	public static void main(String[] args) {
		double salario, novoSalario, reajuste;
		
		salario = Float.parseFloat(JOptionPane.showInputDialog("Insira o valor do seu salário:"));
		
		if (salario < 500)
			reajuste = 1.15;
		else {
			if (salario >= 500 && salario <= 1000)
				reajuste = 1.10;
			else
				reajuste = 1.05;
		}
		
		novoSalario = salario * reajuste;
		
		System.out.println(novoSalario);

	}

}
