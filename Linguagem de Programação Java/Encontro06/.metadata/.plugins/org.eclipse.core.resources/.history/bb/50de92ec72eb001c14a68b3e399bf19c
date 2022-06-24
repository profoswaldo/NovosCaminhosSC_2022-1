package novos.caminhos.discentes;

public class Aluno {

	private String nome, matricula;
	private double teste, prova;
	
	public void configurarMatricula(String aux) {
		matricula = aux;
	}
	
	public void configurarNome(String aux) {
		nome = aux;
	}
	

	public void configurarTeste(double aux) {
		teste = aux;
	}

	public void configurarProva(double aux) {
		prova = aux;
	}
	
	public String obterMatricula() {
		return matricula;
	}
	
	public String obterNome() {
		return nome;
	}
	
	public double obterTeste() {
		return teste;
	}
	
	public double obterProva() {
		return prova;
	}

	public double getMedia() {
		return (teste + prova) / 2;
	}

	public String getStatus() {
		if (getMedia() >= 7) {
			return "Aprovado";
		} else {
			if (getMedia() < 4) {
				return "Reprovado";
			} else {
				return "Final";
			}
		}
	}

}
