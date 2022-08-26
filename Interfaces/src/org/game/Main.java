package org.game;

public class Main {
public static void main(String[] args) {
	Ball ballObj=new Ball();
	Tyre tyreObj=new Tyre();
	MRFTyre mObj=new MRFTyre();
	
	
	ballObj.bounce();
	tyreObj.bounce();
	tyreObj.move();
	mObj.bounce();
	mObj.move();
}
}
