package com.romarini.bestdesign;

import java.util.List;

/***
 * 
 * Exemplo de implementação no qual a dependente da abstração preserva alterações no "core" da lógica de negócios
 * 
 * 
 * @author rodrigomarini
 *
 */

public class AcoesRegraNegocio {
	
	public static void main(String[] args) {
		List<AcoesExecutaveis> list = null;
		new AcoesRegraNegocio().execute(list);
	}
	
	/*
	 * Método seguindo princípios open closed: preservado de alterações 
	 * com uma execução aberta a novas possibilidades já que depende da abstração (interface) 
	 */
	private void execute(List<AcoesExecutaveis> list) {
		for(AcoesExecutaveis acoes : list){
			acoes.execute();
		}
	}

}

interface AcoesExecutaveis{
	public void execute();	
}

class EnviarEmail implements AcoesExecutaveis{
	public void execute(){
		// enviar email
	}	
}

class PersistirDados implements AcoesExecutaveis{
	public void execute(){
		// persistir dados
	}	
}

class IntegracaoViaSOAP implements AcoesExecutaveis{
	public void execute(){
		// integrar com outro sistema
	}	
}