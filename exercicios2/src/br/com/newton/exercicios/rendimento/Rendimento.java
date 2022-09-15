package br.com.newton.exercicios.rendimento;

import java.text.NumberFormat;

public class Rendimento {

	private double investInicial;
	private double taxaRendimento;
	private int numMeses;
	
	public Rendimento(double investInicial, double taxaRendimento, int numMeses) {
		super();
		this.investInicial = investInicial;
		this.taxaRendimento = taxaRendimento;
		this.numMeses = numMeses;
	}

	public double getInvestInicial() {
		return investInicial;
	}

	public void setInvestInicial(double investInicial) {
		this.investInicial = investInicial;
	}

	public double getTaxaRendimento() {
		return taxaRendimento;
	}

	public void setTaxaRendimento(double taxaRendimento) {
		this.taxaRendimento = taxaRendimento;
	}

	public int getNumMeses() {
		return numMeses;
	}

	public void setNumMeses(int numMeses) {
		this.numMeses = numMeses;
	}
	
	public void calculaRendimento() {
		double rendimentoMensal;
		rendimentoMensal=getInvestInicial();
		System.out.println("Valor Inicial: " + NumberFormat.getCurrencyInstance().format(getInvestInicial()));
		System.out.println("Taxa de Juros: " + NumberFormat.getPercentInstance().format(getTaxaRendimento()/100));
		
		for(int i=0;i<getNumMeses(); i++) {
			rendimentoMensal=rendimentoMensal*getTaxaRendimento()/100+rendimentoMensal;
			//System.out.printf("Mês %d  -  %.2f\n", (i+1) , rendimentoMensal);
			System.out.println("Mês " + (i+1) + "  -  " + NumberFormat.getCurrencyInstance().format(rendimentoMensal));
		}	
		
	}
	
}
