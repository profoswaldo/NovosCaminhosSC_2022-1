
public class Principal {

	public static void main(String[] args) {

		Calculadora calculadora=new Calculadora();
		
		calculadora.atribuir();
		
		calculadora.calcular();
		
		System.out.println("Média: " + calculadora.media);	
	}
}
