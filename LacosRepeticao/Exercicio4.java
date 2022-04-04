package LacosRepeticao;

import java.util.Scanner;

/*
4- Uma empresa desenvolveu uma pesquisa para saber as caracter�sticas
psicol�gicas dos indiv�duos de uma regi�o. Para tanto, a cada uma das pessoas
era perguntado: idade, sexo (1-feminino / 2-masculino / 3-Outros), e as op��es
(1, se a pessoa era calma; 2, se a pessoa era nervosa e 3, se a pessoa era
agressiva). Pede-se para elaborar um sistema que permita ler os dados de 150
pessoas, calcule e mostre: (WHILE)
1 o n�mero de pessoas calmas;
2 o n�mero de mulheres nervosas;
3 o n�mero de homens agressivos;
4 o n�mero de outros calmos;
5 o n�mero de pessoas nervosas com mais de 40 anos;
6 o n�mero de pessoas calmas com menos de 18 anos.
 */
public class Exercicio4 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int idade, sexo, situacao, contador=1;
		int detalhes[] = new int[6];
		
		System.out.println("Pesquisa sobre popula��o.\n");
		while (contador <= 150)
		{
			System.out.println("Digite a idade: ");
			idade = ler.nextInt();
			System.out.println("(1-feminino / 2-masculino / 3-Outros): ");
			sexo = ler.nextInt();
			System.out.println("Qual o estado emocional da pessoa?\n(1-Calma / 2-Nervosa / 3-Agressiva): ");
			situacao = ler.nextInt();
			
			if (situacao == 1)
				detalhes[0]++;
			if (sexo == 1 && situacao == 2)
				detalhes[1]++;
			if (sexo == 2 && situacao == 3)
				detalhes[2]++;
			if (sexo == 3 && situacao == 1)
				detalhes[3]++;
			if (idade > 40 && situacao == 2)
				detalhes[4]++;
			else if (idade < 18 && situacao == 1)
				detalhes[5]++;
			contador++;
		}
		System.out.println("Resultados da pesquisa:\n");
		System.out.println("N�mero de pessoas calmas: "+detalhes[0]);
		System.out.println("N�mero de mulheres nervosas: "+detalhes[1]);
		System.out.println("N�mero de homens agressivos: "+detalhes[2]);
		System.out.println("N�mero de outros calmos: "+detalhes[3]);
		System.out.println("N�mero de pessoas nervosas com mais de 40 anos: "+detalhes[4]);
		System.out.println("N�mero de pessoas calmas com menos de 18 anos: "+detalhes[5]);
	}

}
