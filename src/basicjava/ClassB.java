package basicjava;

public class ClassB {
	public static void main(String[] args) {
		ClassA obj =new ClassA();
		obj.add(25, 25);
		if (obj.c==50) {
//		if (obj.add(25,25)==50) {
			System.out.println("valid");
		}else System.out.println("Invalid");
	}

}
