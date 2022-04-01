package Introducao;

import java.util.Arrays;
import java.util.Scanner;

public class Exercicio2 {
/*
2- Faça um programa que entre com três números e coloque em ordem crescente.
 */
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int[] numeros = {0, 0, 0};
		
		for (int x=0; x < 3; x++)
		{
			System.out.println("Digite o "+ (x + 1) +"º número: ");
			numeros[x] = ler.nextInt();	
		}
		Arrays.sort(numeros);
		
		System.out.println("Ordem crescente: "+numeros[0]+" "+numeros[1]+" "+numeros[2]);
	}

}
