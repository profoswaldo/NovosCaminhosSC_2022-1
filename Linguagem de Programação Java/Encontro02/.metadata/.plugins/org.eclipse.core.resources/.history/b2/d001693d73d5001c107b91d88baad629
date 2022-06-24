package colaboradores;
import java.util.Scanner;

public class Funcionario {
	
	public Scanner input = new Scanner(System.in);
	public String nome;
	public double salarioBruto, desconto, salarioLiquido;
	
	public void atribuir() {
		desconto = 100;
	}
	
	
	public void ler() {
		System.out.print("Digite o seu nome: ");
		nome = input.nextLine();
		
		System.out.print("Digite o valor do Salário Bruto: ");
		salarioBruto = input.nextDouble();
	}
	
	public void calcularSalarioLiquido() {
		salarioLiquido = salarioBruto - desconto;
	}
	
	public void exibir() {
		System.out.println("Nome: " + nome
	            + " Salário Líquido: " + salarioLiquido);
	}

}
