

/*
  Desenvolva um programa em Java que Leia 3 notas e que calcule e exiba:
   - Média do aluno
   - Situação do aluno, onde:
       + Aprovado:   Média >= 7
       + Final:      Média <7 e >= 5
       + Reprovado:  Média <5 
 */

import java.util.Scanner;


public class Principal {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		double nota1, nota2, nota3, media;
		String situacao;
		
		System.out.print("Digite a nota 1: ");
		nota1 = input.nextDouble();
		
		System.out.print("Digite a nota 2: ");
		nota2 = input.nextDouble();

		System.out.print("Digite a nota 3: ");
		nota3 = input.nextDouble();
		
		media = (nota1 + nota2 + nota3)/3;
		
		if(media<5) {
			situacao = "Reprovado";
		}else {
			if(media>=7) {
				situacao = "Aprovado";
			}else {
				situacao = "Final";
			}
		}
		
		System.out.println("O aluno teve a media de " 
		                    + media 
		                    + " e está " 
		                    + situacao);
		

	}

}
