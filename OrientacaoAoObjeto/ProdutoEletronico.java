package OrientacaoAoObjeto;

public class ProdutoEletronico {
	String modelo;
	String fabricante;
	int garantia;
	boolean bivolt;
	boolean ligado=false;
	
	public ProdutoEletronico(String modelo, String fabricante, int garantia, boolean bivolt) {
		this.modelo=modelo;
		this.fabricante=fabricante;
		this.garantia=garantia;
		this.bivolt=bivolt;
	}
	public void ligarNo220() {
		if (bivolt && ligado == false) {
			System.out.println("Ligando "+this.modelo+"...");
			this.ligado=true;
			System.out.println("Aparelho ligado!");
		}
		else if (ligado)
			System.out.println(this.modelo+" já está ligado!");
		else {
			System.out.println("Ligando "+this.modelo+"...");
			System.out.println("Produto queimou!");
		}
	}
	public void desligar() {
		if(ligado) {
			System.out.println("Desligando "+this.modelo+"...");
			this.ligado=false;
			System.out.println("Aparelho desligado!");
		}
		else
			System.out.println("Produto já está desligado!");
	}
	public void detalhes() {
		System.out.println("----------------------------------");
		System.out.println("Modelo: "+this.modelo);
		System.out.println("Fabricante: "+this.fabricante);
		System.out.println("Garantia: "+this.garantia+" meses.");
		System.out.println("Bivolt: "+this.bivolt);
	}
	
}
