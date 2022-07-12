package modelo;

import javax.swing.JOptionPane;

public class Banco {

	public void incluir(Aluno aluno) {
		
		JOptionPane.showMessageDialog(null, "Inclusao de aluno realizada com sucesso");

	}

	public void excluir(Aluno aluno) {
		JOptionPane.showMessageDialog(null, "Exclusão de aluno realizada com sucesso");

	}

	public void alterar(Aluno aluno) {
		JOptionPane.showMessageDialog(null, "Alteração de aluno realizada com sucesso");

	}

	public void consultar(Aluno aluno) {
		JOptionPane.showMessageDialog(null, "Consulta de aluno realizada com sucesso");

	}

}
