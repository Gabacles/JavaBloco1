package OrientacaoAoObjeto;
/*
5) Crie uma classe patinete e apresente os atributos e métodos referentes
esta classe, em seguida crie um objeto patinete, defina as instancias deste
objeto e apresente as informações deste objeto no console.
 */

public class Patinete {
	String modelo;
	String marca;
	int rodas;
	boolean eletrico;
	
	public Patinete(String modelo, String marca, int rodas, boolean eletrico) {
		this.modelo=modelo;
		this.marca=marca;
		this.rodas=rodas;
		this.eletrico=eletrico;
	}
	
	public void brincar() {
		if (eletrico) {
			System.out.println("Ligando o patinete...");
			System.out.println("Bricando...");
		}
		else
			System.out.println("Bricando com o modelo comum...");
	}
	
	public void parar() {
		if (eletrico) {
			System.out.println("Parando de andar...");
			System.out.println("Desligando...");
		}
		else
			System.out.println("Parando de brincar...");
	}
	
	public void detalhes() {
		System.out.println("-------------------");
		System.out.println("Modelo: "+this.modelo);
		System.out.println("Marca: "+this.marca);
		System.out.println("Quantas rodas: "+this.rodas);
		System.out.println("Elétrico: "+this.eletrico);
	}
}
