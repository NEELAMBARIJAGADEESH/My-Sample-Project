package scannerClass;

import java.util.Scanner;

public class ScannerEx {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in) ;
		System.out.println("How many days are there in a week?");
		int days = sc.nextInt();
		System.out.println("Days in a week are: " + days);
		
		System.out.println("Enter the first month of a year");
		String fmonth = sc.next();
		System.out.println("The First month of a year is : " + fmonth);
		
		System.out.println("Enter your mother tongue and second language");
		String mtname = sc.next();
		System.out.println("The Mother tongue is " + mtname);
		String slname = sc.nextLine();
		System.out.println("and the second language is  "+ slname);
		
		System.out.println("Enter your height");
		float h = sc.nextFloat();
		System.out.println("Your height is " + h);
		
		
	}
}
