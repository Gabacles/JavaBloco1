package LacosRepeticao;

import java.util.Scanner;

/*
2- Ler 10 números e imprimir quantos são pares e quantos são ímpares. FOR
 */

public class Exercicio2 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int numero, pares=0, impares=0;
		
		System.out.println("Neste programa precisaremos de 10 números.");
		
		for(int x = 0; x < 10; x++)
		{
			System.out.println("Digite o "+(x+1)+"º número: ");
			numero = ler.nextInt();
			
			if(numero % 2 == 0)
				pares++;
			else
				impares++;
		}
		System.out.println("Você digitou "+pares+" números pares e "+impares+" números ímpares.");
	}

}
