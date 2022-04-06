package OrientacaoAoObjeto;

public class Paciente {
	String nome;
	String telefone;
	String endereco;
	String prontuario;
	int idade;
	
	public Paciente(String nome, String telefone, String endereco, int idade) {
		this.nome=nome;
		this.telefone=telefone;
		this.endereco=endereco;
		this.idade=idade;
	}
	
	public void consulta(String prontuario) {
		this.prontuario=prontuario;
	}
	
	public void detalhes() {
		System.out.println("-------------------------------");
		System.out.println("Nome: "+this.nome);
		System.out.println("Idade: "+this.idade);
		System.out.println("Prontuário: "+this.prontuario);
	}
}
