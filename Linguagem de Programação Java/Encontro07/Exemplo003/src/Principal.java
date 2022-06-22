import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		Calculadora calculadora = new Calculadora();
		
		Scanner teclado = new Scanner(System.in);
		double pi, raio, perimetro;
		
		calculadora.initPi();
		
		pi = calculadora.getPi();
		
		System.out.print("Digite o valor do Raio: ");
		raio = teclado.nextDouble();
		
		perimetro = 2 * pi * raio;
		
		System.out.println("Perimetro: " + perimetro);
		
	}
}
