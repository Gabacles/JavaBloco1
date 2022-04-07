package HerancaPolimorfismo;

public class Cavalo extends Animal{

	@Override
	public void emitirSom() {
		System.out.println(this.getNome()+" est� relinchando...");
	}
	
	public void correr() {
		System.out.println(this.getNome()+" est� galopando...");
	}
}