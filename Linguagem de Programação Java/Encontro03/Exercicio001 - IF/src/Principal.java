import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		int valor1, valor2;
		
		
		System.out.print("Digite o valor 1: ");
		valor1 =  input.nextInt();
		
		System.out.print("Digite o valor 2: ");
		valor2 =  input.nextInt();
		
		
		if(valor1>valor2) {
			System.out.println(valor1);
		}else {
			System.out.println(valor2);
		}

	}

}
