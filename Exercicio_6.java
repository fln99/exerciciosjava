package coquinhaGelada;

import javax.swing.*;

public class Exercicio_6 {

	public static void main(String[] args) {
		double aulaHora = 0f, totalSalarios = 0f, descontoInss, salarioLiquido, salarioMinimo = 1212.0f;
		int totalAulas;
		String mensagem;
		
		aulaHora = Float.parseFloat(JOptionPane.showInputDialog("Insira o custo da aula/hora:"));
		totalAulas = Integer.parseInt(JOptionPane.showInputDialog("Insira o total de aulas dadas no mês:"));
		descontoInss = Double.parseDouble(JOptionPane.showInputDialog("Insira a porcentagem do desconto no INSS:")) / 100;
		
		salarioLiquido = (aulaHora * totalAulas) * (1 - descontoInss);
		
		totalSalarios = salarioLiquido / salarioMinimo;
		
		if (totalSalarios > 10)
			mensagem = "Sortudo!";
		else {
			if (totalSalarios >= 6 && totalSalarios <= 9)
				mensagem = "Um dia você chega lá!";
			else
				mensagem = "Ah! Coitado!";
		}
		
		System.out.println(mensagem);
	}

}
