package Introducao;

import java.util.Scanner;

public class Exercicio1 {
/*
1- Fa�a um programa que receba tr�s inteiros e diga qual deles � o maior.
 */

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int n1, n2, n3;
		
		System.out.println("Digite o primeiro n�mero: ");
		n1 = ler.nextInt();
		
		System.out.println("Digite o segundo n�mero: ");
		n2 = ler.nextInt();
		
		System.out.println("Digite o terceiro n�mero: ");
		n3 = ler.nextInt();
		
		if (n1 > n2 && n1 > n3)
		{
			System.out.println("O n�mero "+ n1 +" � o maior.");
		}
		else if (n2 > n1 && n2 > n3)
		{
			System.out.println("O n�mero "+ n2+" � o maior.");
		}
		else
		{
			System.out.println("O n�mero "+ n3+" � o maior.");
		}
	}

}
