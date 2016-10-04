package com.romarini.designpatterns.composite;

import java.util.ArrayList;
import java.util.List;

public class GerenteGeral implements Empregado{
	
	private List<Empregado> employees = new ArrayList<Empregado>();  

	@Override
	public void add(Empregado employee) {
		employees.add(employee);
	}

	@Override
	public void remove(Empregado employee) {
		employees.remove(employee);
		
	}

	@Override
	public Empregado getChild(int i) {
		return employees.get(i);
	}
	

}
