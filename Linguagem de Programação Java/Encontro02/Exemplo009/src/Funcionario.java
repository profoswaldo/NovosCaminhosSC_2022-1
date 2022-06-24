
public class Funcionario {
	
	String nome;
	double salarioBruto, desconto, salarioLiquido;
	
	
	void calcularSalarioLiquido() {
		salarioLiquido = salarioBruto - desconto;
	}

}
