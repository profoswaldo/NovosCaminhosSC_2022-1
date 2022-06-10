import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
	
		Scanner teclado = new Scanner(System.in);
		
		Aluno[] turma = new Aluno[2];

		double soma=0, mediaTurma;
		
		for(int i =0; i<turma.length; i++) {
			turma[i]  = new Aluno();
			System.out.print("Digite a matricula do aluno: ");
			turma[i].matricula = teclado.nextInt();
			System.out.print("Digite o nome do aluno: ");
			turma[i].nome = teclado.next();
			System.out.print("Digite o teste do aluno: ");
			turma[i].teste = teclado.nextDouble();
			System.out.print("Digite a prova do aluno: ");
			turma[i].prova = teclado.nextDouble();
			
			System.out.println(
				"Matricula: " + turma[i].matricula +
				" Nome: " + turma[i].nome +
				" Média: " + turma[i].obterMedia() +
				" Situação: " + turma[i].obterSituacao()
			);
			
			soma = soma + turma[i].obterMedia();
		}
		
		mediaTurma=soma/2;
		
		System.out.println("Média da turma: " + mediaTurma);
		
		for(int i =0; i<turma.length; i++) {
			
			if(turma[i].obterMedia()>=mediaTurma) {
				System.out.println(
						"Matricula: " + turma[i].matricula +
						" Nome: " + turma[i].nome +
						" Média: " + turma[i].obterMedia() +
						" Situação: " + turma[i].obterSituacao()
					);
			}
			
		}
		

	}

}
