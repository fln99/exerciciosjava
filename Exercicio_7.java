package coquinhaGelada;

import javax.swing.*;

public class Exercicio_7 {

	public static void main(String[] args) {
		int ladoA, ladoB, ladoC;
		boolean ladosValidos = false;
		String tipoTriangulo;
		
		ladoA = Integer.parseInt(JOptionPane.showInputDialog("Insira o primeiro lado do triângulo:"));
		ladoB = Integer.parseInt(JOptionPane.showInputDialog("Insira o segundo lado do triângulo:"));
		ladoC = Integer.parseInt(JOptionPane.showInputDialog("Insira o terceiro lado do triângulo:"));
		
		if ((ladoA < ladoB + ladoC && ladoB < ladoA + ladoC && ladoC < ladoA + ladoB) && (ladoA > 0 && ladoB > 0 && ladoC > 0))
			ladosValidos = true;
		
		if (!ladosValidos)
			System.exit(1);
		
		if (ladoA == ladoB && ladoB == ladoC)
			tipoTriangulo = "Equilátero";
		else {
			if (ladoA != ladoB && ladoB != ladoC && ladoA != ladoC)
				tipoTriangulo = "Escaleno";
			else
				tipoTriangulo = "Isósceles";
		}
			
		System.out.println(tipoTriangulo);
	}

}
