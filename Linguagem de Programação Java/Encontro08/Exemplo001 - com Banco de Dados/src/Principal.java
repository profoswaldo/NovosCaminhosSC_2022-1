import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		Pessoa pessoa = new Pessoa();
		Banco banco = new Banco();
		
		
		System.out.print("Digite o ID da Pessoa: ");
		pessoa.setId(input.nextInt());
		
		
		System.out.print("Digite o Nome da Pessoa: ");
		pessoa.setNome(input.next());
		
		
		banco.incluir(pessoa);
		
		
		
		

	}

}
