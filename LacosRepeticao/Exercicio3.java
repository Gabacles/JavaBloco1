package LacosRepeticao;

import java.util.Scanner;

/*
3- Solicitar a idade de várias pessoas e imprimir: Total de pessoas com menos de
21 anos. Total de pessoas com mais de 50 anos. O programa termina quando
idade for =-99. WHILE
 */

public class Exercicio3 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int jovens=0, idosos=0, idade=0;
		
		while(idade != -99)
		{
			System.out.println("Digite idade do participante: (Para encerrar digite -99)");
			idade = ler.nextInt();
			
			if (idade < 21 && idade != -99)
				jovens++;
			else if (idade > 50)
				idosos++;
		}
		System.out.println("Total de pessoas com menos de 21 anos: "+jovens);
		System.out.println("Total de pessoas com mais de 50 anos: "+idosos);
	}

}
