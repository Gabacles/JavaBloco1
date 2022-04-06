package OrientacaoAoObjeto;
/*
6) Crie uma classe conta bancaria e apresente os atributos e m�todos
referentes esta classe, em seguida crie um objeto conta bancaria, defina
as instancias deste objeto e apresente as informa��es deste objeto no
console.
 */

public class ContaBancaria {
	String banco;
	int numeroDaConta;
	int agencia;
	private String senha;
	private double extrato=0.0;
	
	public ContaBancaria(String banco, int numeroDaConta, int agencia, String senha) {
		this.banco=banco;
		this.numeroDaConta=numeroDaConta;
		this.agencia=agencia;
		this.senha=senha;
	}
	
	public void getExtrato(int conta, String senha) {
		if (this.numeroDaConta == conta && this.senha == senha)
			System.out.printf("Extrato atual: %.2f",this.extrato);
		else
			System.out.println("Ag�ncia ou senha incorretas!");
	}
	
	public void depositar(double valor) {
		this.extrato+=valor;
	}
	
	public void sacar(int conta, String senha, double valor) {
		if (this.numeroDaConta == conta && this.senha == senha) {
			if (this.extrato > valor) {
				System.out.println("Sacando "+valor+"R$...");
				this.extrato-=valor;
				System.out.println("Opera��o conclu�da!");
			}
			else
				System.out.println("Saldo insuficiente! N�o foi poss�vel concluir a opera��o.");
		}
		else
			System.out.println("Ag�ncia ou senha incorretas!");
	}
	
}

