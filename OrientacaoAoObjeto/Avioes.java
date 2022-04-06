package OrientacaoAoObjeto;

public class Avioes {

	public static void main(String[] args) {
		Aviao a1 = new Aviao("Boeing 777-300ER", 4, 18, 380, 837.5, 12.300);
		Aviao a2 = new Aviao("Airbus A340-600", 4, 17, 345, 820.8, 11.596);
		
		a1.detalhes();
		a2.detalhes();
		
		//Fazendo manutenção para poder decolar
		System.out.println();
		a1.manutencao();
		
		//Decolando
		System.out.println();
		a1.decolar();
		System.out.println();
		a2.decolar();
	}

}
