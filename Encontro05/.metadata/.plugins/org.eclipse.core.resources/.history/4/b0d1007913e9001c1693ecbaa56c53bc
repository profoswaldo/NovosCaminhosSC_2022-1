import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		int matricula;
		String nome, status;
		double teste, prova, media;
		Scanner teclado = new Scanner(System.in);


		for(int i =0; i<3; i++) {
			
			System.out.print("Digite a matricula do aluno: ");
			matricula = teclado.nextInt();
			System.out.print("Digite o nome do aluno: ");
			nome = teclado.next();
			System.out.print("Digite o teste do aluno: ");
			teste = teclado.nextDouble();
			System.out.print("Digite a prova do aluno: ");
			prova = teclado.nextDouble();
			
			media = (teste + prova)/2;
			if(media>=7)
				status = "Aprovado";
			else
				status = "Reprovado";
			
			System.out.println(
				"Matricula: " + matricula +
				" Nome: " + nome +
				" Média: " + media +
				" Situação: " + status
			);
			
		}

	}

}
