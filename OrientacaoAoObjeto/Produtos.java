package OrientacaoAoObjeto;

public class Produtos {

	public static void main(String[] args) {
		ProdutoEletronico p1 = new ProdutoEletronico("Playstation 5", "Sony", 12, true);
		ProdutoEletronico p2 = new ProdutoEletronico("Torradeira", "Philco", 6, false);
		
		p1.detalhes();
		p2.detalhes();
		
		System.out.println();
		p1.ligarNo220();
		System.out.println();
		p2.ligarNo220();
		System.out.println();
		p1.ligarNo220();
		
		System.out.println();
		p1.desligar();
		System.out.println();
		p2.desligar();
		

	}

}
