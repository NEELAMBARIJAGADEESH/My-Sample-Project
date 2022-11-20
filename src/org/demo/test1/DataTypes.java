package org.demo.test1;

public class DataTypes {
	private void byteMethod() {
		byte age=28;
		System.out.println("Student age is "+ age);
	}
	
	private void shortMethod() {
		short birthyear=1994;
		System.out.println("Student Birth Year is "+ birthyear);
	}
	
	private void intMethod() {
		int rollno=123456789;
		System.out.println("Student Roll.NO is "+ rollno);
	}
	
	private void longMethod() {
		long aadharno=987456123569l;
		System.out.println("Student Aadhar No is "+ aadharno);
	}
	
	private void floatMethod() {
		float height=156.55f;
		System.out.println("Student Height is "+ height);
	}
	
	private void doubleMethod() {
		double rankcredit=1548625.36589;
		System.out.println("Student Rank Credit Index is "+ rankcredit);

	}
	
	private void charMethod() {
		char grade='A';
		System.out.println("Student Grade is "+ grade);
	}
	
	private void stringMethod() {
		String studentname= "S.Neelambari";
		System.out.println("Student Name is "+ studentname);
	}
	
	private void booleanMethod() {
		boolean promotion= true;
		System.out.println("Student Promotion to Next Level is "+ promotion);
	}
	
	public static void main(String[] args) {
		DataTypes dt=new DataTypes();
		dt.byteMethod();
		dt.shortMethod();
		dt.intMethod();
		dt.longMethod();
		dt.floatMethod();
		dt.doubleMethod();
		dt.charMethod();
		dt.stringMethod();
		dt.booleanMethod();
	}
	
}

 