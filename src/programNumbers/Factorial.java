package programNumbers;

public class Factorial {
	public static void main(String[] args) {
//		int fact=1;
//		for (int i = 1; i <=5; i++) {
//			fact=fact*i;
//		}
//		System.out.println(fact);
		System.out.println("******** Factorial of Numbers from 1 to 5");
		int range=5;
		int fact=1;
		int fact1=1;
		for (int i = range; i>0; i--) {			
			for (int j = i; j>0; j--) {
				fact=fact*j;				
			}
			System.out.println("Factorial of "+i+" is: "+fact);	
			fact=fact1;
		}
	}
}
