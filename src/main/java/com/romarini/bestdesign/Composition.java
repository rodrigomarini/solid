package com.romarini.bestdesign;
/**
 * 
 * Se a classe derivada deve ser substituível pela classe base, favoreça a composição 
 * para evitar acoplamento.
 * 
 * Um exemplo negativo é a classe Properties que herda HashTable.
 * Um objeto properties deveria ser carregado com String representando seu valor, mas devido
 * a um erro no design, sua interface permite a inserção de qualquer tipo de objeto.
 * 
 * @author rodrigomarini
 *
 */
		
public class Composition {
	
	public static void main(String[] args) {
		
	}
	
	/**
	 * Recebe um objeto do tipo TXT e se beneficia do comportamento de Arquivo minimizando o acoplamento. 
	 * 
	 * @param arquivo arquivo a ser processado
	 */
	public void processar(TXT txt) {

		txt.process();
	}

}

class File{
	
	void process(){
		
	}
	
}

class TXT{
	
	private File file;
	
	void process(){
		this.file.process();
		// faz outras coisas...
	}
	
}