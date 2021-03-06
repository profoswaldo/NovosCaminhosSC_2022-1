
public class Aluno {
	
	private String matricula, nome;
	
	private double nota1, nota2, nota3;
	
	

	public Aluno() {
		matricula = "000";
		nome = "Visitante";
		nota1 = -1;
		nota2 = -1;
		nota3 = -1;
	}
	

	public String getMatricula() {
		return matricula;
	}


	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public double getNota1() {
		return nota1;
	}

	public void setNota1(double nota1) {
		this.nota1 = nota1;
	}

	public double getNota2() {
		return nota2;
	}

	public void setNota2(double nota2) {
		this.nota2 = nota2;
	}

	public double getNota3() {
		return nota3;
	}

	public void setNota3(double nota3) {
		this.nota3 = nota3;
	}
	
	public double getMedia() {
		return (nota1 + nota2 + nota3)/3;
	}
	
	public String getSituacao() {
		
		if(getMedia()>=7) {
			return "Aprovado";
		}else {
			if(getMedia()<5) {
				return "Reprovado";
			}else {
				return "Recuperação";
			}
		}
		
	}
	
	

}
