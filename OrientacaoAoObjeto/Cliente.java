package OrientacaoAoObjeto;
/*
1) Crie uma classe cliente e apresente os atributos e métodos referentes
esta classe, em seguida crie um objeto cliente, defina as instancias deste
objeto e apresente as informações deste objeto no console.
 */

public class Cliente {
	String nome;
	int idade;
	boolean vip;
	
	Cliente(String nome, int idade, boolean vip){
		this.nome=nome;
		this.idade=idade;
		this.vip=vip;
	}
	void acessarAreaVip() {
		if (vip)
			System.out.println(this.nome+" está curtindo na área VIP...");
		else
			System.out.println(this.nome+" não é cliente VIP, acesso negado.");
	}
	void openBar() {
		if (vip)
			System.out.println(this.nome+" está bebendo...");
		else
			System.out.println("Open bar é exclusivo para clientes VIP");
	}
	void detalhes() {
		System.out.println("Nome: "+this.nome);
		System.out.println("Idade: "+this.idade);
		System.out.println("Cliente VIP: "+this.vip);
	}
	

}
