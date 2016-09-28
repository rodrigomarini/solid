package com.romarini.bestdesign;
/*
 * ISP - Interface Segregation Principle o I do SOLID
 * Se classes precisam ter suas responsabilidades bem definidas, o mesmo se aplica a interfaces.
 * Devem ser coesas, ou seja, os comportamentos devem ser separados para que as classes concretas 
 * escolham quais interfaces desejam implementar. 
 */
class Dog implements Animal, Adestrado{

	@Override
	public void sentar() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void comer() {
		// TODO Auto-generated method stub
		
	}

}

class Cat implements Animal{

	@Override
	public void comer() {
		// TODO Auto-generated method stub
		
	}
	
}


interface Animal {
 public void comer();
}

interface Adestrado {
	public void sentar();
}
