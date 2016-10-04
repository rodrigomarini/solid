package com.romarini.designpatterns.facade;

public class BusinessFacade {
	
	public void fecharPedido(){
		
		Venda v = new Venda();
		v.ConsolidarItens();
		
		Pedido p = new Pedido();
		p.calcularTotal(v);
		
	}

}
