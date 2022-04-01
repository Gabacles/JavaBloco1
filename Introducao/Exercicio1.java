package Introducao;

import java.util.Scanner;

public class Exercicio1 {
/*
1- Faça um programa que receba três inteiros e diga qual deles é o maior.
 */

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int n1, n2, n3;
		
		System.out.println("Digite o primeiro número: ");
		n1 = ler.nextInt();
		
		System.out.println("Digite o segundo número: ");
		n2 = ler.nextInt();
		
		System.out.println("Digite o terceiro número: ");
		n3 = ler.nextInt();
		
		if (n1 > n2 && n1 > n3)
		{
			System.out.println("O número "+ n1 +" é o maior.");
		}
		else if (n2 > n1 && n2 > n3)
		{
			System.out.println("O número "+ n2+" é o maior.");
		}
		else
		{
			System.out.println("O número "+ n3+" é o maior.");
		}
	}

}
