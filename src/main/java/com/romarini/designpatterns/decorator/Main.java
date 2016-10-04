package com.romarini.designpatterns.decorator;

public class Main {
	
	public static void main(String[] args) {
		
		System.out.println("Aqui, o dog vai simplesmente latir:");
		Dog dog = new ViraLata();
		dog.latir();
		
		System.out.println("Aqui, o dog é customizado, ele foi adestrado, então executa ações antes de latir:");
		Dog adestrado = new Adestrado(dog);
		adestrado.latir();
	}

}
