import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		double valor1, valor2, resultado = 0;
		int operacao;

		System.out.print("DIgite o valor 1: ");
		valor1 = input.nextDouble();

		System.out.print("DIgite o valor 2: ");
		valor2 = input.nextDouble();

		System.out.print("DIgite 1 para soma, 2-subtracao ou 0 para sair: ");
		operacao = input.nextInt();

		switch (operacao) {

		case 1:
			resultado = valor1 + valor2;
			break;

		case 2:
			resultado = valor1 - valor2;
			break;

		case 0:
			break;

		}
		
		System.out.println("Resultado: " + resultado);
	}

}
