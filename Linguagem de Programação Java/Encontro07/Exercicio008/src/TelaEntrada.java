import java.util.Scanner;

public class TelaEntrada {
	
	private Scanner teclado;

	public TelaEntrada() {
		teclado = new Scanner(System.in);
	}
	
	
	public Aluno lerAluno(Aluno aluno) {

		System.out.print("Digite a matricula: ");
		aluno.setMatricula(teclado.next());
		System.out.print("Digite o nome: ");
		aluno.setNome(teclado.next());
		System.out.print("Digite a nota1: ");
		aluno.setNota1(teclado.nextDouble());
		System.out.print("Digite a nota2: ");
		aluno.setNota2(teclado.nextDouble());
		System.out.print("Digite a nota3: ");
		aluno.setNota3(teclado.nextDouble());
		
		return aluno;
		
	}
	

}
