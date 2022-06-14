package novos.caminhos.discentes;

public class Aluno {

	private String nome, matricula;
	private double teste, prova;
	
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	

	public void setTeste(double teste) {
		this.teste = teste;
	}

	public void setProva(double prova) {
		this.prova = prova;
	}
	
	public String getMatricula() {
		return matricula;
	}
	
	public String getNome() {
		return nome;
	}
	
	public double getTeste() {
		return teste;
	}
	
	public double getProva() {
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
