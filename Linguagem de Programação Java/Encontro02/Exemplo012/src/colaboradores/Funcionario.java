package colaboradores;


public class Funcionario {
	
	
	public double salarioBruto, desconto, salarioLiquido;
	
	public void atribuir() {
		desconto = 100;
	}
	
	public void calcularSalarioLiquido() {
		salarioLiquido = salarioBruto - desconto;
	}
	


}
