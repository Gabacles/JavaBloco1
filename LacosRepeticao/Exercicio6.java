package LacosRepeticao;
/*
6- Escrever um programa que receba vários números inteiros no teclado. E no
final imprimir a média dos números múltiplos de 3. Para sair digitar
0(zero). DO...WHILE
 */

import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int numero, somaMultiplos=0;
		double media, contador=0;
		
		do
		{
			System.out.println("Digite um número: ");
			numero = ler.nextInt();
			if (numero % 3 == 0 && numero != 0)
			{
				somaMultiplos += numero;
				contador++;
			}
			System.out.println("Para sair digite 0");
		}while(numero != 0);
		
		media = somaMultiplos/contador;
		System.out.println("Média dos números múltiplos de 3 digitados: "+media);
	}

}
