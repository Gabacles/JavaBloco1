package VetoresEMatrizes;

import java.util.Random;

/*
3.	Um dado é lançado 10 vezes e o valor correspondente é anotado. Faça um programa que gere um vetor
com os lançamentos, escreva esse vetor. A seguir determine e imprima a média aritmética dos lançamentos,
contabilize e apresente também quantas foram as ocorrências da maior pontuação
 */

public class Exercicio2 {

	public static void main(String[] args) {
		Random random = new Random();
		int numerosDado[] = new int[10], total=0, media, maiorPonto=0, ocorrencias=0;
		System.out.println("Números sorteados:");
		for (int x=0; x<10; x++)
		{
			numerosDado[x] = random.nextInt(6)+1;
			System.out.print(numerosDado[x]+"\t");
			total += numerosDado[x];
			if (numerosDado[x] > maiorPonto)
				maiorPonto = numerosDado[x];
		}
		for (int x=0; x < 10; x++)
		{
			if (numerosDado[x] == maiorPonto)
				ocorrencias++;
		}
		media = total/10;
		
		System.out.println("\nResultados dos lançamentos:");
		System.out.println("O maior número sorteado foi "+maiorPonto+" e este número foi sorteado "+ocorrencias+" vez(es)");
		System.out.println("A média dos lançamentos é: "+media);


	}

}
