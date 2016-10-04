package com.romarini.designpatterns.command;

public class LightCommandON implements Command { 

	Light light;

	public LightCommandON(Light light) {
		this.light = light;
	}

	public void execute() {
		System.out.println("acendendo a luz");
		light.setState(true);
	}
}

