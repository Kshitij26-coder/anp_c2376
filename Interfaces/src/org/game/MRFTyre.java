package org.game;

public class MRFTyre extends Tyre implements Bonceable,Moveable {
	public void bounce() {
		System.out.println("MRFTyre: "+"I am a bouncing tyre");
	}
	public void move() {
		System.out.println("MRFTyre: "+"I am a moving tyre");
	}

}
