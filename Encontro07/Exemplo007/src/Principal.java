import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		Calculadora calculadora = new Calculadora();
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Digite o valor do Raio: ");
		calculadora.setRaio(teclado.nextDouble());
		
		System.out.println("Perimetro: " + calculadora.getPerimetro());
		
	}
}
