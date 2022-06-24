import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		Calculadora calculadora = new Calculadora();
		
		Scanner teclado = new Scanner(System.in);
		double pi, perimetro;
		
		calculadora.initPi();
		
		pi = calculadora.getPi();
		
		System.out.print("Digite o valor do Raio: ");
		calculadora.raio = teclado.nextDouble();
		
		perimetro = calculadora.getPerimetro();
		
		System.out.println("Perimetro: " + perimetro);
		
	}
}
