package br.com.newton.exercicios.estoque;

public class Estoque {

	private String nome;
	private int qtAtual;
	private int qtMinima;
	
	public Estoque() {
		
	}
	
	public Estoque(String nome, int qtAtual, int qtMinima) {
		super();
		this.nome = nome;
		this.qtAtual = qtAtual;
		this.qtMinima = qtMinima;
	}
	
	
	//gcuf - gerar construtor
	//ggas - gerar get and set
	//this - operador que referencia os atributos da propria classe
	//set - metodo para alterar o valor atributo
	//get - retorna o conteudo do atributo

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getQtAtual() {
		return qtAtual;
	}

	public void setQtAtual(int qtAtual) {
		this.qtAtual = qtAtual;
	}

	public int getQtMinima() {
		return qtMinima;
	}

	public void setQtMinima(int qtMinima) {
		this.qtMinima = qtMinima;
	}
	
	public void darBaixa(int qtde) {
		if(qtde<=this.qtAtual)
			this.qtAtual-=qtde;
		else
			System.out.println("Estoque Insuficiente");			
	}
	
	public String mostra() {
		return "Produto: " + getNome() +  "\nEstoque Atual: " +  getQtAtual() + "\nEstoque Mínimo: " + getQtMinima(); 
	}

	public boolean precisaRepor(){
		if (this.qtAtual<=this.qtMinima)
			return true;
		else
			return false;
	}
		
}
