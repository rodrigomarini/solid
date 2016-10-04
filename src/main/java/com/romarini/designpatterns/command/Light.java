package com.romarini.designpatterns.command;

public class Light {
	
	private boolean state;

	public boolean isState() {
		System.out.println(state);
		return state;
	}

	public void setState(boolean state) {
		this.state = state;
	}
	
	

}
