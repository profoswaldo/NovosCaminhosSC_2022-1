import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		double pi, raio, perimetro;
		
		System.out.print("Digite o valor de PI: ");
		pi = teclado.nextDouble();
		
		System.out.print("Digite o valor do Raio: ");
		raio = teclado.nextDouble();
		
		perimetro = 2 * pi * raio;
		
		System.out.println("Perimetro: " + perimetro);
		
	}
}
