package array;

public class ArrayEx {
	public static void main(String[] args) {
		int a=10;
		System.out.println("The value of a is " + a);
		
		int b[]=new int[4];
		b[0]=1;
		b[2]=3;
		b[3]=4;
		b[0]=5;
		for (int i = 0; i < b.length; i++) {
			System.out.println("The value of b[" +i +"] is " + b[i]);
			
		}
		
//		System.out.println("The value of b[1] is " + b[1]);
//		System.out.println("The value od b[2] is " + b[2]);
//		System.out.println("The value of b[0] is " + b[0]);
		
		int length = b.length;
		System.out.println("The Length of b is " + length);
		
	}
}
