package com.romarini.lambda;

import java.util.Comparator;

/**
 * 
 * @author rodrigomarini
 *
 */
public class OperaInterfacefuncional {


	/*
	 * Classe que implementa Comparator da maneira tradicional 
	 */
	Comparator<String> comparadorTradicional = new Comparator<String>() {
		public int compare(String s1, String s2) {
			return Integer.compare(s1.length(), s2.length()); 
		}
	};

	/*
	 * Classe que implementa Comparator com uso de expressões lambda.
	 * Pode ser aplicado em implementações de interfaces funcionais, 
	 * ou seja, que contém somente um método abstrato
	 */
	Comparator<String> comparatorLambdaExpression =  (s1, s2) ->
		Integer.compare(s1.length(), s2.length()); 
		
		
	public static void main(String[] args) {
		/*
		 * Aqui é criada uma instância de Thread a partir do construtor Thread(Runnable target) 
		 * Como Runnable possui somente um método abstrato com essa interface, também é caracterizado
		 * como interface funcional. Isso permite a passagem de uma implementação implicita de 
		 * Runnable como parâmetro 
		 */
		new Thread(() -> System.out.println("thread nova rodando")).start();
		
	}




}
