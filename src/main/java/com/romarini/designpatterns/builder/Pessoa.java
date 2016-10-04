package com.romarini.designpatterns.builder;

public class Pessoa {
	
	protected Pessoa(){
		
	}
	
	private String nome;
	private Integer idade;
	private String cargo;
	
	public Pessoa chamada(String nome){
		this.nome = nome;
		return this;
	}
	
	public Pessoa comIdade(Integer idade){
		this.idade = idade;
		return this;
	}
	
	public Pessoa comCargo(String cargo){
		this.cargo = cargo;
		return this;
	}
	
	public Pessoa builder(){
		return this;
	}
	

}
