package aula01;

import java.util.Locale;
import java.util.Scanner;

public class exerc02 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		double note = 0, average;
		
		Scanner read = new Scanner(System.in);		
		
		for(int cont = 0; cont < 4; cont++) {
			System.out.print("Digite a " + (cont + 1) + "º nota: ");
			note += read.nextDouble();
		}
		average = note / 4;
		System.out.println("\nMédia das notas = " + average);
	}

}