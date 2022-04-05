package VetoresEMatrizes;

import java.util.Scanner;

/*
Crie um programa que receba valores do usuário para preencher uma matriz 3X3, e em seguida,
exiba a soma dos valores dela e a soma dos valores da primeira diagonal, ou seja, diagonal principal. 
 */
public class Exercicio4 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int matriz[][] = new int[3][3], soma=0, somaDiagonal=0;
		
		System.out.println("Preencha uma matriz 3x3.");
		for (int linha=0; linha < 3; linha++)
		{
			for (int coluna=0; coluna < 3; coluna++)
			{
				System.out.print("Digite um número: ");
				matriz[linha][coluna] = ler.nextInt();
				soma += matriz[linha][coluna];
			}
		}
		for (int x=0; x < 3; x++)
			somaDiagonal += matriz[x][x];
		System.out.println("\nTotal da soma dos valores da matriz: "+ soma);
		System.out.println("Total da soma da diagonal da matriz: "+ somaDiagonal);
	}

}
