import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		Calculadora calculadora = new Calculadora();
		
		Scanner teclado = new Scanner(System.in);
		double perimetro, aux;
		
		calculadora.initPi();
		
		System.out.print("Digite o valor do Raio: ");
		aux = teclado.nextDouble();
		calculadora.setRaio(aux);
		
		perimetro = calculadora.getPerimetro();
		
		System.out.println("Perimetro: " + perimetro);
		
	}
}
