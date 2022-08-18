package coquinhaGelada;

import javax.swing.*;

public class Exercicio_1 {

	public static void main(String[] args) {
		int numero;
		String estado;
		numero = Integer.parseInt(JOptionPane.showInputDialog("Insira um número inteiro: "));
	
		if (numero > 0)
			estado = "Positivo";
		else {
			if (numero < 0)
				estado = "Negativo";
			else
				estado = "Nulo";
		}
		
		System.out.println("O número inserido é " + estado);
	}

}
