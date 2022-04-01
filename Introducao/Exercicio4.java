package Introducao;

import java.util.Scanner;

public class Exercicio4 {
/*
4- Faça um programa em que permita a entrada de um número qualquer e exiba se este
número é par ou ímpar. Se for par exiba também a raiz quadrada do mesmo; se for
ímpar exiba o número elevado ao quadrado.
 */
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int numero;
		
		System.out.println("Digite um número: ");
		numero = ler.nextInt();
		
		if (numero % 2 == 0)
		{
			System.out.format("O número digitado é par e sua raiz quadrada é: %.2f", Math.sqrt(numero));
		}
		else
		{
			System.out.println("O número digitado é ímpar e sua potência ao quadrado é: "+Math.pow(numero, 2));
		}
		

	}

}
