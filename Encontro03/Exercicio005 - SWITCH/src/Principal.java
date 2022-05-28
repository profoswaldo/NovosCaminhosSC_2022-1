import java.util.Scanner;

/*
	Desenvolva um programa em Java que receba o salario Bruto de um funcionario
	e que calcule e exiba o seu salario líquido, sendo que:

	inss = salbruto * 11%
	    
	O programa deve perguntar se o funcionario é PJ ou PF
	caso seja PJ, o salario liquido é:
			salliq = salbruto - inss
    caso contrario, salliq = salbruto-inss-ir, onde ir = salbruto * 20%
	
 */


public class Principal {

	public static void main(String[] args) {


		Scanner teclado = new Scanner(System.in);
		
		double salbruto, salliq=0, inss, ir;
		int tipo;
		
		
		System.out.println("Digite o salario bruto: ");
		salbruto = teclado.nextDouble();
		
		inss = salbruto*11/100;
		
		System.out.println("Digite o 1 - para PJ ou 2 - para PF ");
		tipo = teclado.nextInt();
		
		switch (tipo){
			case 1: 
				salliq = salbruto - inss;
			    break;
			case 2:
				ir = salbruto * 20/100;
				salliq = salbruto - inss -ir;
				break;
			
		}
	

		System.out.println("Salario Líquido: " + salliq);
		

	}

}
