package HerancaPolimorfismo;

public class Preguica extends Animal{
	
	@Override
	public void emitirSom() {
		System.out.println(this.getNome()+" está roncando...");
	}
	
	public void subirEmArvore() {
		System.out.println(this.getNome()+" está subindo na árvore...");
	}

}
