package controles;

import modelos.persistencia.BancoAluno;
import modelos.pessoal.Aluno;

public class ControleAluno {

	private BancoAluno banco;
	private Aluno aluno;

	public ControleAluno() {
		banco = new BancoAluno();
	}

	public void incluir(String matricula, String nome) {
		aluno = new Aluno();
		aluno.setMatricula(Integer.parseInt(matricula));
		aluno.setNome(nome);
		banco.incluir(aluno);
	}

	public void excluir(String matricula) {
		aluno = new Aluno();
		aluno.setMatricula(Integer.parseInt(matricula));
		banco.excluir(aluno);
	}

	public void alterar(String matricula, String nome) {
		aluno = new Aluno();
		aluno.setMatricula(Integer.parseInt(matricula));
		aluno.setNome(nome);
		banco.alterar(aluno);
	}

	public String[] consultar(String matricula) {
		String[] alunos = new String[2];
		
		aluno = new Aluno();
		aluno.setMatricula(Integer.parseInt(matricula));
		aluno = banco.consultar(aluno);
		
		alunos[0] = Integer.toString(aluno.getMatricula());
		alunos[1] = aluno.getNome();
		
		return alunos;
		

	}

}
