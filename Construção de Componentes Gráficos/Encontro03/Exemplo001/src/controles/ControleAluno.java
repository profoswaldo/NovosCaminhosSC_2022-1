package controles;

import modelo.Aluno;
import modelo.Banco;

public class ControleAluno {
	
	private Aluno aluno;
	private Banco banco;
	
	public ControleAluno() {
		banco = new Banco();
	}
	
	public void incluir(String matricula, String nome, String teste, String prova ) {
		aluno = new Aluno();
		aluno.setMatricula(matricula);
		aluno.setNome(nome);
		aluno.setTeste(Double.parseDouble(teste));
		aluno.setProva(Double.parseDouble(prova));
		
		banco.incluir(aluno);
		
	}
	
	public void excluir(String matricula) {
		aluno = new Aluno();
		aluno.setMatricula(matricula);

		
		banco.excluir(aluno);
		
	}
	
	public void alterar(String matricula, String nome, String teste, String prova ) {
		aluno = new Aluno();
		aluno.setMatricula(matricula);
		aluno.setNome(nome);
		aluno.setTeste(Double.parseDouble(teste));
		aluno.setProva(Double.parseDouble(prova));
		
		banco.alterar(aluno);
	}
	
	public void consultar(String matricula) {
		
	}

}
