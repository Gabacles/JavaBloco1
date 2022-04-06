package OrientacaoAoObjeto;

public class ProgramaPaciente {

	public static void main(String[] args) {
		Paciente paciente1 = new Paciente("Carlos Alberto", "1112345678", "Rua dos Bobos, 0", 32);
		
		paciente1.consulta("O paciente apresenta fortes dores de cabaça e febre. Deve ser acompanhado durante a noite.");
		
		paciente1.detalhes();

	}

}
