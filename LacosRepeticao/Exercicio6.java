package LacosRepeticao;
/*
6- Escrever um programa que receba v�rios n�meros inteiros no teclado. E no
final imprimir a m�dia dos n�meros m�ltiplos de 3. Para sair digitar
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
			System.out.println("Digite um n�mero: ");
			numero = ler.nextInt();
			if (numero % 3 == 0 && numero != 0)
			{
				somaMultiplos += numero;
				contador++;
			}
			System.out.println("Para sair digite 0");
		}while(numero != 0);
		
		media = somaMultiplos/contador;
		System.out.println("M�dia dos n�meros m�ltiplos de 3 digitados: "+media);
	}

}
