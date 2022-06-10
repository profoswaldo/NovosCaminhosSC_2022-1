import java.util.Scanner;

public class Principal {
	
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		int numero;
		
		do {
			System.out.print("Digite um número inteiro o zero para sair: ");
			numero = teclado.nextInt();
			System.out.println("Dobro: " + (numero * 2));
		}while(numero!=0);
		
	}

}
