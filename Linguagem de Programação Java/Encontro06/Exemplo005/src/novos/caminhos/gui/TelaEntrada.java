package novos.caminhos.gui;

import java.util.Scanner;

public class TelaEntrada {
	
	private Scanner input = new Scanner(System.in);
	
	public double getValor(String numero) {
	   System.out.print("Digite o valor " + numero + ": ");
	   return input.nextDouble();
	}


}
