package com.romarini.designpatterns.decorator;
/**
 * 
 * Classe concreta que opta por implementar Dog ao invés de DogDecorator
 * 
 * @author rodrigomarini
 *
 */
public class ViraLata implements Dog{

	@Override
	public void latir() {
		System.out.println("Latindo...");
		
	}

}
