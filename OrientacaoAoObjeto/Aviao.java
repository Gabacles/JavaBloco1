package OrientacaoAoObjeto;
/*
2) Crie uma classe avi�o e apresente os atributos e m�todos referentes
esta classe, em seguida crie um objeto avi�o, defina as instancias deste
objeto e apresente as informa��es deste objeto no console.
 */

public class Aviao {
	String modelo;
	int numeroDeMotores;
	int autonomia;
	int capacidadeMax;
	double velocidadeMax;
	double alturaMax;
	boolean aptoParaVoo=false;
	boolean pistaLiberada=true;
	
	Aviao(String modelo, int numeroDeMotores, int autonomia, int capacidadeMax, double velocidadeMax, double alturaMax) {
		this.modelo=modelo;
		this.numeroDeMotores=numeroDeMotores;
		this.autonomia=autonomia;
		this.capacidadeMax=capacidadeMax;
		this.velocidadeMax=velocidadeMax;
		this.alturaMax=alturaMax;
	}
	void manutencao() {
		System.out.println("Realizando manuten��o e checagem do modelo "+this.modelo+"...");
		System.out.println("Avi�o apto para voo!");
		this.aptoParaVoo=true;
	}
	void decolar() {
		System.out.println("Modelo "+this.modelo+" solicitando decolagem...");
		if (aptoParaVoo && pistaLiberada)
			System.out.println("Decolando...");
		else
			System.out.println("N�o � poss�vel decolar. Cheque as condi��es e tente novamente.");
	}
	void detalhes() {
		System.out.println("----------"+this.modelo+"----------");
		System.out.println("Quantidade de motores: "+this.numeroDeMotores);
		System.out.println("Autonomia: "+this.autonomia+" horas.");
		System.out.println("Capacidade m�xima: "+this.capacidadeMax+" pessoas.");
		System.out.println("Velocidade m�xima: "+this.velocidadeMax+"km/h");
		System.out.println("Altura m�xima: "+this.alturaMax+" metros.");
		System.out.println("Apto para voo: "+this.aptoParaVoo);
	}
}
