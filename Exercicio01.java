package aula01;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		
	Scanner door = new Scanner(System.in);
		
	//double wage = 10000.00;
	//double allowance = 1000.00;
	//double newWage = 11000.00;
	
	//newWage = wage + allowance;
	
	//System.out.println("Olá, digite seu salario:\n" + wage);
	//System.out.println("Digite o abono:\n" + allowance);
	//System.out.println("Seu novo salario é:\n" + newWage);
	
	System.out.println("Olá, digite seu salario:\n");
	int wage = door.nextInt();
	System.out.println("Salario digitado foi:\n" + wage);
	
	System.out.println("Digite abono:\n");
	int allowance = door.nextInt();
	System.out.println("Abono digitado foi:\n" + allowance);
	
	int newWage = wage + allowance;
	System.out.println("Novo salario:\n" + newWage);
	}

}
