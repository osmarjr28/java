package com.company;

import java.util.Scanner;

public class exerc04 {

    public static void main(String[] args) {
    	
        int n1, n2, n3, n4, difference;
        
        Scanner door = new Scanner(System.in);
        System.out.print("Digite o primeiro valor;");
        n1 = door.nextInt();
        System.out.print("Digite o segundo valor;");
        n2 = door.nextInt();
        System.out.print("Digite o terceiro valor;");
        n3 = door.nextInt();
        System.out.print("Digite o quarto valor;");
        n4 = door.nextInt();

        difference = (n1 * n2)-(n3 * n4);

        System.out.println("A diferena entre os valores e de;" + difference);

    }
}
