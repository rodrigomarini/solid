package com.romarini.designpatterns.facade;

/***
 * 
 * Consolida múltiplas tarefas através de uma única fachada
 * 
 * @author rodrigomarini
 *
 */
public class Main {

	public static void main(String[] args) {
		BusinessFacade businessFacade = new BusinessFacade();
		businessFacade.fecharPedido();
	}
}
