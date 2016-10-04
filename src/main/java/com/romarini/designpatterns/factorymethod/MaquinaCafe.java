package com.romarini.designpatterns.factorymethod;

public class MaquinaCafe implements MaquinaBebidas{

	@Override
	public Bebidas entregaBebida() {
		
		return new Cafe();
	}

}
