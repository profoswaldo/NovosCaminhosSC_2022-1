
public class Aluno {
	int matricula;
	String nome;
	double teste, prova;

	double obterMedia() {
		return (teste + prova) / 2;
	}

	
	String obterSituacao() {
		
		if (obterMedia() >= 7)
			return "Aprovado";
		else
			return "Reprovado";
	}

}
