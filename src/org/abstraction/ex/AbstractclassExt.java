package org.abstraction.ex;

public class AbstractclassExt extends AbstractclassPart {
	
	@Override
	public void insideBalloon() {
		System.out.println("The Air filled in the violet balloon is Helium");
		
	}

	public static void main(String[] args) {
		AbstractclassExt ae=new AbstractclassExt();
		ae.balloonColour();
		ae.insideBalloon();
	}
}
