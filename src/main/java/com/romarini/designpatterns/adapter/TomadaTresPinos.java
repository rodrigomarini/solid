package com.romarini.designpatterns.adapter;

public class TomadaTresPinos {

	private TomadaTresPinos tomadaTresPinos;
	
	public void ligarNaTomadaDeTresPinos() {
		System.out.println("Ligado na Tomada de Tres Pinos");
	}

	public void ligarNaTomadaDeDoisPinos() {
		tomadaTresPinos.ligarNaTomadaDeTresPinos();
	}

}
