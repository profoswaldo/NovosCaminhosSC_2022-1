
public class Principal {

	public static void main(String[] args) {
		
		Calculadora aux = new Calculadora();
		int produto;

		aux.valor1 = 6;
		aux.valor2 = 8;
		
		produto = aux.valor1 * aux.valor2;
		
		System.out.println("Produto: " + produto);
		

	}

}
