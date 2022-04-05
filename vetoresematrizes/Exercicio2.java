package VetoresEMatrizes;

import java.util.Random;

/*
3.	Um dado � lan�ado 10 vezes e o valor correspondente � anotado. Fa�a um programa que gere um vetor
com os lan�amentos, escreva esse vetor. A seguir determine e imprima a m�dia aritm�tica dos lan�amentos,
contabilize e apresente tamb�m quantas foram as ocorr�ncias da maior pontua��o
 */

public class Exercicio2 {

	public static void main(String[] args) {
		Random random = new Random();
		int numerosDado[] = new int[10], total=0, media, maiorPonto=0, ocorrencias=0;
		System.out.println("N�meros sorteados:");
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
		
		System.out.println("\nResultados dos lan�amentos:");
		System.out.println("O maior n�mero sorteado foi "+maiorPonto+" e este n�mero foi sorteado "+ocorrencias+" vez(es)");
		System.out.println("A m�dia dos lan�amentos �: "+media);


	}

}
