package com.romarini.designpatterns.singleton;

/**
 * 
 * Garante uma única instância para toda a aplicação: o consturtor privado não permite instância
 * e o método getInstance garante que um único objeto seja criado e retornado.
 * 
 * @author rodrigomarini
 *
 */
public class Singleton {

	private static Singleton instance;

	private Singleton(){

	}

	public static Singleton getInstance(){
		if(instance != null){
			return instance;
		}
		Singleton sing = new Singleton();
		return sing;
	}

}
