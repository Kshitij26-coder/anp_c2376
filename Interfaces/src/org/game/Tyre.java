package org.game;

public class Tyre implements Bonceable,Moveable {
	public void bounce() {
		System.out.println("I am a bouncing tyre");
	}
	public void move() {
		System.out.println("I am a moving tyre");
	}
}
