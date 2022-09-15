package br.com.newton.exercicios.rendimento;

import java.util.Scanner;

public class RendimentoPrincipal {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite o valor inicial do investimento ");
		double investInicial = ler.nextDouble();
		System.out.println("Digite a taxa de Juros ");
		double taxaRendimento = ler.nextDouble();
		System.out.println("Digite o número de meses para o rendimento ");
		int  numMeses = ler.nextInt();
		
		Rendimento r1 = new Rendimento(investInicial, taxaRendimento, numMeses);
		r1.calculaRendimento();
		
	}
	
}


