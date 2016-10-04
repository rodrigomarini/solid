package com.romarini.designpatterns.adapter;

public class Main {
	
	public static void main(String... args) {
		TomadaTresPinos tresPinos = new TomadaTresPinos();
		Adaptador adaptadorDoisPinos= new Adaptador(tresPinos);
		adaptadorDoisPinos.ligarNaTomadaDeDoisPinos();
	}
	
}
