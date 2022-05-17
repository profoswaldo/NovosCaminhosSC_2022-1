import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		Funcionario funcionario = new Funcionario();
		
		
		System.out.print("Digite o seu nome: ");
		funcionario.nome = input.nextLine();
		
		System.out.print("Digite o valor do Salário Bruto: ");
		funcionario.salarioBruto = input.nextDouble();
		
		funcionario.desconto = 100;
		
		
		funcionario.calcularSalarioLiquido();
		
		System.out.println("Nome: " + funcionario.nome
				            + " Salário Líquido: " + funcionario.salarioLiquido);
	}

}
