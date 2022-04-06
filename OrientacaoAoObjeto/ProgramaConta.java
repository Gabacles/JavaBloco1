package OrientacaoAoObjeto;

public class ProgramaConta {

	public static void main(String[] args) {
		ContaBancaria conta1 = new ContaBancaria("Itaú", 123456, 4444, "1010");
		
		//TESTE DE EXTRATO COM SENHA INCORRETA
		conta1.getExtrato(123456, "1011");
		
		//TESTE DE EXTRATO COM SENHA CORRETA
		System.out.println();
		conta1.getExtrato(123456, "1010");
		
		//DEPOSITO
		System.out.println();
		conta1.depositar(8633.80);
		
		//TESTE DE EXTRATO COM SENHA CORRETA
		conta1.getExtrato(123456, "1010");
		
		//SAQUE COM VALOR NAO EXCEDENTE
		System.out.println();
		conta1.sacar(123456, "1010", 9200);
		
		//SAQUE COM VALOR PERMITIDO
		System.out.println();
		conta1.sacar(123456, "1010", 7500);
		
		//TESTE DE EXTRATO COM SENHA CORRETA
		System.out.println();
		conta1.getExtrato(123456, "1010");

	}

}
