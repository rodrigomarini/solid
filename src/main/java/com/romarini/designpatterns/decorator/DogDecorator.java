package com.romarini.designpatterns.decorator;

/***
 * 
 * Patter Decorator
 * 
 * Geralmente, temos a abstração (interface) e a implementação (classe concreta).
 * 
 * Ao aplicar Decorator, cria-se uma nova "camada" intermediária.
 * 
 * Observe que a classe Decorator implementa a abstração (interface Dog) e contém um objeto dessa msm abstração.
 * Vamos as considerações:
 * 	1- Decorator é uma classe abstrata, os métodos da abstração (Dog) não são implementados nela;
 *  2- Decorator possui um atributo do tipo da sua abstração (Dog) e um construtor que sobrescreve
 *     o default para inicializá-lo  
 * 
 * Em resumo, esse DogDecorator é uma versão turbinada da interface Dog. Quem opta por implementá-lo,
 * seguirá o mesmo contrato de quem implementa Dog, mas com um atributo a mais.
 * 
 * Agora compare a classe Poodle e PastorAlemao para entender as diferenças.
 * 
 * 
 * @author rodrigomarini
 *
 */
public abstract class DogDecorator implements Dog{
	
	protected Dog dog;
	
	public DogDecorator(Dog dog){
		this.dog = dog;
	}

}
