/* Faça um programa que leia as 3 notas de um aluno e que calcule e exiba:
    - Média
    - Situação do aluno:
    	- Aprovado: Média maior ou igual a 7
    	- Recuperação: Média maior ou igual a 5 e menor que 7
    	- REprovado: Média inferior a 5
 */

public class Principal {

	public static void main(String[] args) {

		Aluno aluno;
		
		TelaEntrada telaEntrada = new TelaEntrada();
		TelaSaida telaSaida = new TelaSaida();
		
		aluno = telaEntrada.lerAluno(new Aluno());
		
		telaSaida.exibir(aluno);
		
	}

}
