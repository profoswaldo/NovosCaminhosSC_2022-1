package modelo;

public class Aluno {
	
	private int matricula;
	private String nome;
	private double teste;
	private double prova;
	
	public int getMatricula() {
		return matricula;
	}
	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getTeste() {
		return teste;
	}
	public void setTeste(double teste) {
		this.teste = teste;
	}
	public double getProva() {
		return prova;
	}
	public void setProva(double prova) {
		this.prova = prova;
	}
	
	public double getMedia() {
		return (teste + prova)/2;
	}
	
	public String getSituacao() {
		if(getMedia()>=7)
			return "Aprovado";
		else if(getMedia()<4)
			   return "Reprovado";
		else
			   return "Recuperação";
	}

}
