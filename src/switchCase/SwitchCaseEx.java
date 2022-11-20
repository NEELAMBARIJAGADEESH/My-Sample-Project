package switchCase;

import java.util.Scanner;

public class SwitchCaseEx {
	static String n;
	public static void main(String[] args) {
			System.out.println("Enter number");
		Scanner sc=new Scanner(System.in);
		int numb = sc.nextInt();
		switch(numb) {
		case 1:
			n="One";
			break;
			
		case 2:
			n="Two";
			break;
			
		case 3:
			n="Three";
			break;
			
		case 41:
			n="Fourty One";
			
		default: System.out.println("Enter valid number");
	
		}
		System.out.println(n);
	}

}
