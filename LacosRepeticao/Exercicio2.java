package LacosRepeticao;

import java.util.Scanner;

/*
2- Ler 10 n�meros e imprimir quantos s�o pares e quantos s�o �mpares. FOR
 */

public class Exercicio2 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int numero, pares=0, impares=0;
		
		System.out.println("Neste programa precisaremos de 10 n�meros.");
		
		for(int x = 0; x < 10; x++)
		{
			System.out.println("Digite o "+(x+1)+"� n�mero: ");
			numero = ler.nextInt();
			
			if(numero % 2 == 0)
				pares++;
			else
				impares++;
		}
		System.out.println("Voc� digitou "+pares+" n�meros pares e "+impares+" n�meros �mpares.");
	}

}
