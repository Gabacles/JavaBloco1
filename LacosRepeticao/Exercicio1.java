package LacosRepeticao;
/*
1- Informar todos os n�meros de 1000 a 1999 que quando divididos por 11
obtemos resto = 5. FOR
 */

public class Exercicio1 {

	public static void main(String[] args) {
		System.out.println("N�meros de 1000 a 1999 que quando divididos por 11 obtemos resto = 5\n");
		
		for (int x = 1000; x < 2000; x++)
		{
			if (x % 11 == 5)
				System.out.println("N�mero: "+x);
		}

	}

}
