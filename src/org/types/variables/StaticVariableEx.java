package org.types.variables;

public class StaticVariableEx {

	static int i=1994;
	static int j=2019;
	
	private static void neelaBirthyear() {
		System.out.println("The Birth Year of Neela is "+i);
		
	}
	
	private static void jaganBirth() {
		System.out.println("The Birth Year of Jagadeesh Kumar is "+(i-1));
	}
	
	public static void main(String[] args) {
		//no need of creating object for static variables
		neelaBirthyear();
		jaganBirth();
		
		//directly print values of static variables
		System.out.println("The Birth Year of Nivisha is "+j);
	}
	
}
