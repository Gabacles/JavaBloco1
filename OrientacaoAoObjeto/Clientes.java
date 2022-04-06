package OrientacaoAoObjeto;

public class Clientes {

	public static void main(String[] args) {
		Cliente c1 = new Cliente("Gabriel Câmera", 25, true);
		Cliente c2 = new Cliente("Felipe Souza", 21, false);
		
		c1.detalhes();
		System.out.println();
		c2.detalhes();
		
		System.out.println();
		c1.acessarAreaVip();
		System.out.println();
		c2.acessarAreaVip();
		
		System.out.println();
		c1.openBar();
		System.out.println();
		c2.openBar();
	}

}
