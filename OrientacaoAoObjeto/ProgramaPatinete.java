package OrientacaoAoObjeto;

public class ProgramaPatinete {

	public static void main(String[] args) {
		Patinete pat1 = new Patinete("Skatenet", "Bandeirante", 3, true);
		Patinete pat2 = new Patinete("Comum", "BikeSystem", 2, false);
		
		//DETALHES
		pat1.detalhes();
		pat2.detalhes();
		System.out.println();
		
		//BRINCAR COM ELETRICO
		pat1.brincar();
		System.out.println();
		
		
		//PARAR DE BRINCAR ELETRICO
		pat1.parar();
		System.out.println();
		
		//BRINCAR COM COMUM
		pat2.brincar();
		System.out.println();
		
		//PARAR DE BRINCAR COMUM
		pat2.parar();
	}

}
