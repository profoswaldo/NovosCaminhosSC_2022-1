import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		int valor1, valor2;
		
		
		System.out.print("Digite o valor 1: ");
		valor1 =  input.nextInt();
		
		System.out.print("Digite o valor 2: ");
		valor2 =  input.nextInt();
		
		
		if(valor1 == valor2) {
			System.out.println("Valor1 é igual ao valor 2");
		}else {
			if(valor1 < valor2) {
				System.out.println("Valor1 é menor que valor 2");
			}else {
				System.out.println("Valor1 é maior que valor 2");
			}
		}
	}

}
