

/*
 *Desenvolva um programa em Java que Leia 3 notas, e que calcule e 
 *Exiba a média e se o aluno está aprovado(media maior ou igual a 7),
 *Final(média maior o igual a 5 e menor que 7) ou reprovado(média
 *inferior a 5).
 */

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		double media, notas[] = new double[3];
		String status;
		
		System.out.print("Digite a nota 1:");
		notas[0] = teclado.nextDouble();
		
		System.out.print("Digite a nota 2:");
		notas[1] = teclado.nextDouble();
		
		System.out.print("Digite a nota 3:");
		notas[2] = teclado.nextDouble();
		
		media = (notas[0] + notas[1] + notas[2])/3;
		
		if(media>=7) {
			status = "Aprovado";
		}else {
			if(media<5) {
				status = "Reprovado";
			}else {
				status = "Final";
			}
		}
		
		System.out.println("Media: " + media + " Situacao: " + status);
	}

}
