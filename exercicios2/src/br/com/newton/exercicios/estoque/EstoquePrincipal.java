package br.com.newton.exercicios.estoque;

public class EstoquePrincipal {

	public static void main(String[] args) {

		Estoque estoque1 = new Estoque("Caneta", 100, 1);
		System.out.println("Produto: " + estoque1.getNome() + "\nEstoque Atual: " + estoque1.getQtAtual() + "\nEstoque Mínimo: " +  estoque1.getQtMinima());
		System.out.println("\n--------------//--------------\n");
		
		
		
		estoque1.setNome("Caneta Azul");
		System.out.println("Produto: " + estoque1.getNome());
		estoque1.darBaixa(50);
		System.out.println("Precisa Repor o Estoque? " + estoque1.precisaRepor());
		System.out.println(estoque1.mostra());
		System.out.println("\n--------------//--------------\n");
		
		estoque1.darBaixa(70);
		System.out.println("Precisa Repor o Estoque? " + estoque1.precisaRepor());
		System.out.println(estoque1.mostra());
		System.out.println("\n--------------//--------------\n");
		
		
		Estoque estoque2 = new Estoque();
		estoque2.setNome("Apagador");
		estoque2.setQtAtual(10);
		estoque2.setQtMinima(2);
		System.out.println("Produto: " + estoque2.getNome() + "\nEstoque Atual: " + estoque2.getQtAtual() + "\nEstoque Mínimo: " +  estoque2.getQtMinima());
		System.out.println("\n--------------//--------------\n");
		
		
	}

}
