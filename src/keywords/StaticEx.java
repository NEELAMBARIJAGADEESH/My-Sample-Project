package keywords;

public class StaticEx {
	//Static Block
	static {
		System.out.println("This is a Static Block");
	}
	
	//Static Variable
	public static int i=1;
	static int a=5;
	//non-static variable
	int b=10;
	
	//Static Method
	public static void sMethod() {
		System.out.println("This is a Static Method");
	}
	//non-static method
	private void nsMethod() {
		System.out.println("This is non-static method ");
	}
	//constructor
	public StaticEx() {
		System.out.println("This is a Constructor for static");
	}
	
	public static void main(String[] args) {
		StaticEx s= new StaticEx();
		sMethod();
		s.nsMethod();
		System.out.println(a);
		System.out.println(s.b);
	}
	

}
