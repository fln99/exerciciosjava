package coquinhaGelada;

import javax.swing.*;

public class Exercicio_10 {

	public static void main(String[] args) {
		float distanciaCarro1 = 0f, distanciaCarro2 = 0f, tempoCarro1 = 0f, tempoCarro2 = 0f, velocidadeMediaCarro1 = 0f, velocidadeMediaCarro2 = 0f;

		distanciaCarro1 = Float.parseFloat(JOptionPane.showInputDialog("Insira a distancia que o carro 1 percorreu:"));
		tempoCarro1 = Float.parseFloat(JOptionPane.showInputDialog("Tempo que o carro 1 levou para percorrer a distancia:"));
		
		distanciaCarro2 = Float.parseFloat(JOptionPane.showInputDialog("Insira a distancia que o carro 2 percorreu:"));
		tempoCarro2 = Float.parseFloat(JOptionPane.showInputDialog("Tempo que o carro 2 levou para percorrer a distancia:"));
		
		velocidadeMediaCarro1 = distanciaCarro1 / tempoCarro1;
		velocidadeMediaCarro2 = distanciaCarro2 / tempoCarro2;
		
		
		if (velocidadeMediaCarro1 > velocidadeMediaCarro2)
			System.out.println("A maior velocidade media foi do carro 1 com " + velocidadeMediaCarro1 + " km/h");
		else
			System.out.println("A maior velocidade media foi do carro 2 com " + velocidadeMediaCarro2 + " km/h");
	}

}
