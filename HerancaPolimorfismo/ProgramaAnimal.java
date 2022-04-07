package HerancaPolimorfismo;

public class ProgramaAnimal {

	public static void main(String[] args) {
		Cachorro cachorro = new Cachorro();
		Cavalo cavalo = new Cavalo();
		Preguica preguica = new Preguica();
		
		//ADICIONANDO DADOS NOS ATRIBUTOS DOS OBJETOS
		cachorro.setNome("Maylow");
		cachorro.setIdade(7);
		cavalo.setNome("Roger");
		cavalo.setIdade(5);
		preguica.setNome("Sid");
		preguica.setIdade(12);
		
		//EXECUTANDO OS MÉTODOS COM POLIMORFISMO
		cachorro.emitirSom();
		cachorro.correr();
		System.out.println();
		
		cavalo.emitirSom();
		cavalo.correr();
		System.out.println();
		
		preguica.emitirSom();
		preguica.subirEmArvore();
		System.out.println();
	}

}
