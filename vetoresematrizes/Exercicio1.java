package VetoresEMatrizes;

import java.util.Scanner;

/*
Fa�a um programa que crie um vetor por leitura com 5 valores de pontua��o de uma atividade
e o escreva em seguida. Encontre ap�s a maior pontua��o e a apresente. 
 */

public class Exercicio1 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		double pontuacoes[] = new double[5], maior=0;
		
		for (int x=0; x<5; x++)
		{
			System.out.print("Digite sua "+(x+1)+"� pontua��o: ");
			pontuacoes[x] = ler.nextDouble();
			if (pontuacoes[x] > maior)
				maior = pontuacoes[x];
		}
		System.out.println("Sua maior pontua��o foi: "+ maior);
	}
}
