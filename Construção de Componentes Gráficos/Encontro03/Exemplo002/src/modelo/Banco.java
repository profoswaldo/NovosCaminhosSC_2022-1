package modelo;

import java.util.HashMap;
import java.util.Map;

public class Banco {
	
	private Map<String, Aluno> turma;
	
	public Banco() {
		turma = new HashMap<String, Aluno>();
	}

	public void incluir(Aluno aluno) {
		
		turma.put(aluno.getMatricula(), aluno);

	}

	public void excluir(Aluno aluno) {
		turma.remove(aluno.getMatricula());
	}

	public void alterar(Aluno aluno) {
		turma.put(aluno.getMatricula(), aluno);
	}

	public Aluno consultar(Aluno aluno) {
		return turma.get(aluno.getMatricula());
	}

}
