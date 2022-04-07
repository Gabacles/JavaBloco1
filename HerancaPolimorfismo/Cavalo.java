package HerancaPolimorfismo;

public class Cavalo extends Animal{

	@Override
	public void emitirSom() {
		System.out.println(this.getNome()+" está relinchando...");
	}
	
	public void correr() {
		System.out.println(this.getNome()+" está galopando...");
	}
}