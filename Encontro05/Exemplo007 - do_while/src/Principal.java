import java.util.Scanner;

public class Principal {
	
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		int numero;
		
		System.out.print("Digite um número inteiro o zero para sair: ");
		numero = teclado.nextInt();
		
		do {
			System.out.println("Dobro: " + (numero * 2));
			System.out.print("Digite um número inteiro o zero para sair: ");
			numero = teclado.nextInt();
		}while(numero!=0);
		
	}

}
