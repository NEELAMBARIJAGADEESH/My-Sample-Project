package org.conditional.ex;

public class ConditionalifState {
	
	
	public static void main(String[] args) {
		
		int a=5;
		int b=10;
		// **conditional if** 
		if(a<b) {
			System.out.println("The value of a is less than b");
		}
		if(a>b) {
			System.out.println("The value of a is greater than b");
		}
		
		// **conditional if else**
		String actualCountry="India";
		String expectedCountry="india";
		String expectedCountry1="Russia";
		
		if (actualCountry.equalsIgnoreCase(expectedCountry)) {
			System.out.println("values matched");
		}else System.out.println("values not matched");
		
		if (actualCountry.equals(expectedCountry1)) {
			System.out.println("values matched");
		}else System.out.println("values not matched");
		
		// **if else ladder**
				String fruit="Apple";
		if (fruit.equals("Orange")) {
			System.out.println("Orange");
		}else if (fruit.equals("PineApple")) {
			System.out.println("PineApple");
		}else if (fruit.equals("Banana")) {
			System.out.println("Banana");
		}else System.out.println("Not in list");
		
		// **nested if statement**		
		String Country="India";
		String State="Tamilnadu";
		int pincode=600119;
		
		if (Country=="India") {
			if (State=="Tamilnadu") {
				if (pincode==600119) {
					System.out.println("Location Detected: Sholinganallur");
				}else System.out.println("Location not detected : Pincode not matched");
			}else System.out.println("State not matched");
		}else System.out.println("Country not matched");
	}
	

}
