import java.util.Scanner;

public class Funcionario {
	
	Scanner input = new Scanner(System.in);
	String nome;
	double salarioBruto, desconto, salarioLiquido;
	
	void atribuir() {
		desconto = 100;
	}
	
	
	void ler() {
		System.out.print("Digite o seu nome: ");
		nome = input.nextLine();
		
		System.out.print("Digite o valor do Salário Bruto: ");
		salarioBruto = input.nextDouble();
	}
	
	void calcularSalarioLiquido() {
		salarioLiquido = salarioBruto - desconto;
	}
	
	void exibir() {
		System.out.println("Nome: " + nome
	            + " Salário Líquido: " + salarioLiquido);
	}

}
