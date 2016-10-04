package com.romarini.designpatterns.command;

public class Main {

	public static void main(String[] args) {
		Command c = new LightCommandON(new Light());
		c.execute();
	}

}
