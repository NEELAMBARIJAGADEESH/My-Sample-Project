package programNumbers;

public class Swapping {
	public static void main(String[] args) {
		// Using 3rd variable
		int a=10, b=20;
		System.out.println("Before Swapping:");
		System.out.println("a is " +a);
		System.out.println("b is " +b );
		
		int c= a;
		a=b;
		b=c;
		System.out.println("After Swapping:");
		System.out.println("a is " +a);
		System.out.println("b is " +b );
		
		//Without Using 3rd variable
		int x=50, y=25;
		System.out.println("Before Swapping:");
		System.out.println("x is " +x);
		System.out.println("y is " +y );
		
		x=x+y;
		y=x-y;
		x=x-y;
		System.out.println("After Swapping:");
		System.out.println("x is " +x);
		System.out.println("y is " +y);
	}

}
