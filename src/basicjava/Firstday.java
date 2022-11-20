
package basicjava;

import java.util.Scanner;

public class Firstday {
	String input;
	
	public void method1(){
		System.out.println("Hai Neelu...");
		for (int i = 0; i < 1000; i++) {
			System.out.println("I Love You :)");			
		}
		System.out.println("Do You Love me...yes"
				+ " or no???");
		method2();
		if(input.equals("yes")) {
		method3();
		}		
		else {
			System.out.println("Invalid input Please say Yes...");
			method2();
			method3();
		}
	}	
	public void method2(){
		Scanner s= new Scanner(System.in);
		input= s.nextLine();			
	}
	
	public void method3() {
		 for (int i = 0; i < 1000; i++) {		 
				System.out.println("I Love You tooooooo:)");			
			}
	}
	

	public static void main(String[] args) {
		Firstday fd=new Firstday();
		fd.method1();
		
	}

}
