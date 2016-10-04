package com.romarini.designpatterns.composite;
/**
 * 
 * Implementação exemplo do design pattern composite
 * 
 * A própria interface "induz" a sub classe a ter membros do seu tipo, já que oferece métodos
 * para gerenciá-los
 * 
 *  No exemplo, um Gerente é um empregado, mas possui outros empregados abaixo dele
 *  A classe GerenteGeral possui empregados, mas a classe Developer não possui.
 *  
 *  Na minha opinião, esse padrão é uma péssima escolha caso uma das classes não possua 
 *  membros do mesmo tipo, já que a classe Developer terá implementações burras, que não executam nada.
 * 
 * @author rodrigomarini
 *
 */
public interface Empregado {
	public void add(Empregado employee);  
    public void remove(Empregado employee);  
    public Empregado getChild(int i);  
}
