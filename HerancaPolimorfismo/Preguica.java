package HerancaPolimorfismo;

public class Preguica extends Animal{
	
	@Override
	public void emitirSom() {
		System.out.println(this.getNome()+" est� roncando...");
	}
	
	public void subirEmArvore() {
		System.out.println(this.getNome()+" est� subindo na �rvore...");
	}

}
