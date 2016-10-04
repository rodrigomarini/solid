package com.romarini.designpatterns.factorymethod;

import java.math.BigInteger;

public class FactoryExample {
	
	/***
	 * Combinado com imutabilidade, esse padrão garante que o retorno é sempre uma nova instância
	 * Geralmente, pode-se manter os construtores privados para retornar uma instância "personalizada"
	 * 
	 */
	public static void main(String[] args) {
		
		// Factory Method
		BigInteger numPrimo = BigInteger.probablePrime(3, null);
		
		// Abstract Factory
		MaquinaBebidas cafe = new MaquinaCafe();
		cafe.entregaBebida();
	}

}
