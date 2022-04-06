package OrientacaoAoObjeto;
/*
4) Crie uma classe funcionário e apresente os atributos e métodos
referentes esta classe, em seguida crie um objeto funcionário, defina as
instancias deste objeto e apresente as informações deste objeto no
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
			System.out.println("O colaborador(a) "+this.nome+" já está de férias!");
		else {
			this.ferias=true;
			System.out.println("Colaborador(a) "+this.nome+" entrando em período de gozo.");
		}
	}
	public void retornoFerias() {
		if (ferias) {
			this.ferias=false;
			System.out.println("O colaborador(a) "+this.nome+" retornou para o trabalho.");
		}
		else 
			System.out.println("Erro! O colaborador(a) "+this.nome+" não está em período de gozo.");
	}
	public void aumentarSalario(double salario) {
		if (this.salario > salario)
			System.out.println("Valor incorreto! O salário não pode ser menor que o atual.");
		else {
			System.out.println("Aumentando o salário do colaborador "+this.nome);
			this.salario = salario;
			System.out.println("Operação concluída!");
		}
	}
	public void detalhes() {
		System.out.println("-------------------------------");
		System.out.println("Nome: "+this.nome);
		System.out.println("Idade: "+this.idade);
		System.out.println("Salário: "+this.salario+"R$");
		System.out.println("Férias: "+this.ferias);
	}
}

