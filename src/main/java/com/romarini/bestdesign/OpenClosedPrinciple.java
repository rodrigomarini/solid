package com.romarini.bestdesign;

/**
 * Princípio de inversão de dependência, o D do SOLID:
 * 
 * Depender significa acoplar-se - então, para manter baixo acoplamento, opte sempre pela abstração, 
 * nunca pela implementação. Interfaces possuem inúmeras implementações, por isso tendem a ser mais 
 * estáveis e mudam menos.
 * 
 * OPC - Open Closed Principle, o O do SOLID: 
 * Classes devem ser abertas para exetensão, porém fechadas para alteração.
 * Para isso, é necessário ter alta coesão, implementando métodos curtos com responsabilidades separadas.
 *  
 * 
 * @author rodrigomarini
 *
 */
public class OpenClosedPrinciple {
	public static void main(String[] args) {
		double valor = 110;
		// OPEN classe aberta, permite a escolha da implementação a ser utilizada
		Calculador c = null;
		
		if(valor>50 && valor<100){
			c = new CalculaMaior50();
		} else if(valor>100){
			c = new CalculaMaior100();
		}
		
		System.out.println(c.calculaDesconto(valor));
	}
}

interface Calculador{
	double calculaDesconto(double valor);
}

class CalculaMaior50 implements Calculador{
	
	/**
	 * Single Responsability - o S do SOLID 
	 * Mantem a classe/método coeso com a lógica bem definida
	 * CLOSED lógica coesa encapsulada no método que não sofrerá alterações frequentes 
	 * e não terá excesso de condicionais
	 */
	public double calculaDesconto(double valor) {
		return valor * 10 / 100;
	}
}

class CalculaMaior100 implements Calculador{
	
	/**
	 * Single Responsability - o S do SOLID 
	 * Mantem a classe/método coeso com a lógica bem definida
	 * CLOSED lógica coesa encapsulada no método que não sofrerá alterações frequentes 
	 * e não terá excesso de condicionais
	 */
	public double calculaDesconto(double valor) {
		return valor * 20 / 100;
	}
}


