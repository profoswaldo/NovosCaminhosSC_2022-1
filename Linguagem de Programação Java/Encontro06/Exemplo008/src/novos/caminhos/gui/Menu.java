package novos.caminhos.gui;
import java.util.Scanner;

public class Menu {
	
	private Scanner teclado = new Scanner(System.in);
	
	public int getOpcao() {
		System.out.println("--------------------");
		System.out.println("   Menu Principal   ");
		System.out.println("--------------------");
		System.out.println("1 - Aluno");
		System.out.println("0 - Sair");
		return teclado.nextInt();
	
	}

}
