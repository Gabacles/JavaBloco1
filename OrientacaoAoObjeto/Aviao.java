package OrientacaoAoObjeto;
/*
2) Crie uma classe avião e apresente os atributos e métodos referentes
esta classe, em seguida crie um objeto avião, defina as instancias deste
objeto e apresente as informações deste objeto no console.
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
		System.out.println("Realizando manutenção e checagem do modelo "+this.modelo+"...");
		System.out.println("Avião apto para voo!");
		this.aptoParaVoo=true;
	}
	void decolar() {
		System.out.println("Modelo "+this.modelo+" solicitando decolagem...");
		if (aptoParaVoo && pistaLiberada)
			System.out.println("Decolando...");
		else
			System.out.println("Não é possível decolar. Cheque as condições e tente novamente.");
	}
	void detalhes() {
		System.out.println("----------"+this.modelo+"----------");
		System.out.println("Quantidade de motores: "+this.numeroDeMotores);
		System.out.println("Autonomia: "+this.autonomia+" horas.");
		System.out.println("Capacidade máxima: "+this.capacidadeMax+" pessoas.");
		System.out.println("Velocidade máxima: "+this.velocidadeMax+"km/h");
		System.out.println("Altura máxima: "+this.alturaMax+" metros.");
		System.out.println("Apto para voo: "+this.aptoParaVoo);
	}
}
