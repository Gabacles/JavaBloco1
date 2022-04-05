package VetoresEMatrizes;

import java.util.Random;

/*
Escreve um programa que lê duas matrizes N1 (4,6) e N2(4,6) e cria:
a) Uma matriz M1 cujos elementos serão as somas dos elementos de mesma posição das matrizes N1 e N2.
b) Uma matriz M2 cujos elementos serão as diferenças dos elementos de mesma posição das matrizes N1 e N2.

 */
public class Exercicio3 {

	public static void main(String[] args) {
		Random random = new Random();
		int n1[][] = new int[4][6], n2[][] = new int[4][6], m1[][] = new int[4][6], m2[][] = new int[4][6];
		
		for (int linha=0; linha < 4; linha++)
		{
			for (int coluna=0; coluna < 6; coluna++)
			{
				n1[linha][coluna] = random.nextInt(20)+1;
				n2[linha][coluna] = random.nextInt(20)+1;
				m1[linha][coluna] += n1[linha][coluna] + n2[linha][coluna];
				m2[linha][coluna] += n1[linha][coluna] - n2[linha][coluna];
			}
		}
		System.out.println("-----------------Matriz N1-----------------");
		for (int linha=0; linha < 4; linha++)
		{
			for (int coluna=0; coluna < 6; coluna++)
				System.out.print(n1[linha][coluna]+"\t");
			System.out.println();
		}
		System.out.println();
		System.out.println("-----------------Matriz N2-----------------");
		for (int linha=0; linha < 4; linha++)
		{
			for (int coluna=0; coluna < 6; coluna++)
				System.out.print(n2[linha][coluna]+"\t");
			System.out.println();
		}
		System.out.println();
		System.out.println("-----------------Matriz M1-----------------");
		for (int linha=0; linha < 4; linha++)
		{
			for (int coluna=0; coluna < 6; coluna++)
				System.out.print(m1[linha][coluna]+"\t");
			System.out.println();
		}
		System.out.println();
		System.out.println("-----------------Matriz M2-----------------");
		for (int linha=0; linha < 4; linha++)
		{
			for (int coluna=0; coluna < 6; coluna++)
				System.out.print(m2[linha][coluna]+"\t");
			System.out.println();
		}

	}

}
