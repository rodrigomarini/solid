package com.romarini.designpatterns.nullobject;
/***
 * 
 * Exemplificando o pattern null object - no qual uma instância específica com valores zerados
 * é usada como alternativa de retornos nulos
 * 
 * @author rodrigomarini
 */
class Entidade{
	Double valorTotal;
	public Double getValorTotal(){
		return this.valorTotal;
	}
	// outros atributos e getters/setters
}
class EntidadeNull extends Entidade{
	Double valorTotal;
	public Double getValorTotal(){
		return 0.00;
	}
	// outros atributos e getters/setters
}