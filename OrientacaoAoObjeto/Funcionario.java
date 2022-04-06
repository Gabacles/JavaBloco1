package OrientacaoAoObjeto;
/*
4) Crie uma classe funcion�rio e apresente os atributos e m�todos
referentes esta classe, em seguida crie um objeto funcion�rio, defina as
instancias deste objeto e apresente as informa��es deste objeto no
console.
 */

public class Funcionario {
	String nome;
	int idade;
	double salario;
	boolean ferias;
	
	public Funcionario(String nome, int idade, double salario) {
		this.nome=nome;
		this.idade=idade;
		this.salario=salario;
	}
	public void darFerias() {
		if (ferias)
			System.out.println("O colaborador(a) "+this.nome+" j� est� de f�rias!");
		else {
			this.ferias=true;
			System.out.println("Colaborador(a) "+this.nome+" entrando em per�odo de gozo.");
		}
	}
	public void retornoFerias() {
		if (ferias) {
			this.ferias=false;
			System.out.println("O colaborador(a) "+this.nome+" retornou para o trabalho.");
		}
		else 
			System.out.println("Erro! O colaborador(a) "+this.nome+" n�o est� em per�odo de gozo.");
	}
	public void aumentarSalario(double salario) {
		if (this.salario > salario)
			System.out.println("Valor incorreto! O sal�rio n�o pode ser menor que o atual.");
		else {
			System.out.println("Aumentando o sal�rio do colaborador "+this.nome);
			this.salario = salario;
			System.out.println("Opera��o conclu�da!");
		}
	}
	public void detalhes() {
		System.out.println("-------------------------------");
		System.out.println("Nome: "+this.nome);
		System.out.println("Idade: "+this.idade);
		System.out.println("Sal�rio: "+this.salario+"R$");
		System.out.println("F�rias: "+this.ferias);
	}
}

