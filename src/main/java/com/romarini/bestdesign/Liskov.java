package com.romarini.bestdesign;
/**
 * 
 * Classe que exemplefica o princípio de LISKOV - o L do SOLID
 * 
 * Qualquer classe derivada deve ser substituível pela classe base 
 * 
 * @author rodrigomarini
 *
 */
public class Liskov {

	/**
	 * Recebe um objeto do tipo Arquivo, mas fica limitado ao não poder executar 
	 * um comportamento específico do objeto carregado.
	 * 
	 * Se não há polimorfismo, é melhor optar pela a composição ao invés da herança.
	 *  
	 * @param arquivo arquivo a ser processado
	 */
	public void processar(Arquivo arquivo) {

		// erro 
//		arquivo.processaPDF();
	}


}

class Arquivo{
	void doAnything(){

	}
}

class PDF extends Arquivo {
	void processPDF(){

	}
}

class XSD extends Arquivo {
	void processXSD(){

	}
}
