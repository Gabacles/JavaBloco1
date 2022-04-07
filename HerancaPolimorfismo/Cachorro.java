package HerancaPolimorfismo;

public class Cachorro extends Animal{
	
	@Override
	public void emitirSom() {
		System.out.println(this.getNome()+" está latindo...");
	}
	
	public void correr() {
		System.out.println(this.getNome()+" está correndo...");
	}
}
