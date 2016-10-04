package com.romarini.designpatterns.decorator;

/**
 * Classe concreta que opta por implementar DogDecorator ao invés de Dog
 * 
 * O fato de Adestrado estender DogDecorator, o obriga a sobrescrever o construtor já que Decorator 
 * não possui o construtor default, assim a instância do seu tipo é sempre setada ao atributo.
 * 
 * Também é obrigatório sobrescrever o método latir de Dog 
 * 
 * @author rodrigomarini
 *
 */
public class Adestrado extends DogDecorator{

	public Adestrado(Dog dog) {
		super(dog);
	}

	@Override
	public void latir() {
		System.out.println("Manter postura, sentar...");
		dog.latir();
		
	}

}
