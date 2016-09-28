package com.romarini.bestdesign;

public class TellDontAsk {
	
	/**
	 * Esse tipo de estrutura quebra o encapsulamento gerando uma intimidade imprópria,
	 * já que a classe passa a saber mais do que deveria sobre o objeto utilizado.
	 * Isso é procedural.
	 */
	public void Ask(){
		Produto p = new Produto();
		if(p.permiteDesconto()){
			p.processaDesconto(10);
		}
	}
	
	/**
	 * Já nesse exemplo, eu apenas digo o que quero (tell).
	 * Fica a cargo do objeto encapsular a lógica de processamento
	 */
	public void Tell(){
		new ProdutoCoesa().processaDesconto(10);
	}

}

class Produto{
	private boolean permiteDesconto;
	public boolean permiteDesconto(){
		return permiteDesconto;
	}
	public void processaDesconto(double valor) {
		
	}
}

class ProdutoCoesa{
	private boolean permiteDesconto;
	
	public void processaDesconto(double valor) {
		if(permiteDesconto){
			
		}
	}
}
