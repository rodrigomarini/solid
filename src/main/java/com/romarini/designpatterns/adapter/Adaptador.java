package com.romarini.designpatterns.adapter;

public class Adaptador extends TomadaDoisPinos{
	
	private TomadaTresPinos tomadaTresPinos;
	
	public Adaptador(TomadaTresPinos tomadaTresPinos) {
		this.tomadaTresPinos = tomadaTresPinos;
	}


}
