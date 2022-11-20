package logicalOperators;

public class LogAndOr {
	public static void main(String[] args) {
		int age=2;
		String name="Jagadeesh";
		if (age==28&&name=="Neela") {
			System.out.println("Nivisha Mother's Age is "  +age  +"\nNivisha Mother's name is "+ name);
			
		}
		else if (age==29&&name=="Jagadeesh") {
			System.out.println("Nivisha Father's age is " +age);
			System.out.println("Nivisha Father's name is " +name);
			
		}
		else if (age==29||name.equalsIgnoreCase("jagadeesh")) {
			System.out.println("Nivisha Father's name is " +name);
		}
		else System.out.println("Nivsha Parents details are invalid");
	}
}
