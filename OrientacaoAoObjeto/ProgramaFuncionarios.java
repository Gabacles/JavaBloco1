package OrientacaoAoObjeto;

public class ProgramaFuncionarios {

	public static void main(String[] args) {
		Funcionario f1 = new Funcionario("Jefferson Moreira", 28, 1586.80);
		Funcionario f2 = new Funcionario("Kaique Marques", 23, 3285.20);
		
		//DETALHES DOS FUNCIONARIOS
		f1.detalhes();
		f2.detalhes();
		System.out.println();
		
		//DANDO FERIAS
		f1.darFerias();
		System.out.println();
		
		//RETORNO DAS FERIAS
		f1.retornoFerias();
		System.out.println();
		
		//TENTANDO RETORNAR UM COLABORADOR QUE NAO ESTA DE FERIAS
		f2.retornoFerias();
		System.out.println();
		
		//AUMENTANDO SALARIO
		f1.aumentarSalario(2432.70);
		System.out.println();
		f2.aumentarSalario(3100);

	}

}
