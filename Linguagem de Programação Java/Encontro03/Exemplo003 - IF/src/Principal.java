import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		int valor;
		
		System.out.print("Digite um valor: ");
		valor = teclado.nextInt();
		
		if(valor>=9) 
		   System.out.println("Você atingiu uma pontuação maravilhosa");
		else
		   System.out.println("Tente mais uma vez");
	
		
		System.out.println("Fim");

	}

}
