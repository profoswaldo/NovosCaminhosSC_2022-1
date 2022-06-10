import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {

		String nomes[] = new String[3];
		Scanner input = new Scanner(System.in);
		
		for(int i=0;i<nomes.length;i++) {
			System.out.print("Digite o seu nome: ");
			nomes[i] = input.next();
		}
		
		
		
		for(int i=0;i<nomes.length;i++) {
			System.out.println(nomes[i]);
		}

	}

}
