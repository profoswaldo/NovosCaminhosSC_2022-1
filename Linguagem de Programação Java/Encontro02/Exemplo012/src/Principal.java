import colaboradores.Funcionario;
import telas.TelaInputFuncionario;
import telas.TelaOutputFuncionario;

public class Principal {

	public static void main(String[] args) {

		Funcionario funcionario = new Funcionario();
		TelaInputFuncionario telaInputFuncionario = new TelaInputFuncionario();
		TelaOutputFuncionario telaOutputFuncionario = new TelaOutputFuncionario();
		
		telaInputFuncionario.lerFuncionario();
		
		funcionario.atribuir();

		funcionario.calcularSalarioLiquido();
		
		telaOutputFuncionario.exibirFuncionario();
	}

}
