package com.romarini.designpatterns.builder;

/***
 * 
 * classe que exemplifica o pattern Builder
 * 
 * @author rodrigomarini
 */

public class PessoaService {

	public static void main(String[] args) {
		Pessoa pessoa = new Pessoa().chamada("Rodrigo").comCargo("desenvolvedor").comIdade(32);
	}
}
