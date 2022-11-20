package org.polimorphism;

// method overloading
//compile time polimorphism
public class StudentDetails {
	//based on no argument method
	private void stuDetails() {
		System.out.println("****Student Details are: ****");
	}

	//based on data type method
	public void stuDetails(String name) {
		String name1="Jagan";
		System.out.println("Student Name is: "+ name1);
	}
	
	//based on data type count
	public void stuDetails(int i, char section) {
		System.out.println("Student class is: "+i);
		System.out.println("Student section is: "+ section);
	}
	
	//based on data type order
	public void stuDetails(char grade, int r){
		System.out.println("Student Grade is: "+grade+"\nStudent Roll No is: "+ r);
	}
	
	public static void main(String[] args) {
		StudentDetails sd=new StudentDetails();
		sd.stuDetails();
		sd.stuDetails("Nivisha Sri.J");
		sd.stuDetails(1, 'A');
		sd.stuDetails('A', 15);
	}
}
