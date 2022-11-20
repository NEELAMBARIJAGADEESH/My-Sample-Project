package org.demo.test1;

public class InstanceVariables {
	
	byte age;
	short birthyear;
	int rollno;
	long aadharno;
	float height;
	double rankcredit;
	char grade;
	String name;
	boolean promotion;
	
	private void instanceVariables() {
		
		System.out.println(age);
		System.out.println(birthyear);
		System.out.println(rollno);
		System.out.println(aadharno);
		System.out.println(height);
		System.out.println(rankcredit);
		System.out.println(grade);
		System.out.println(name);
		System.out.println(promotion);
		
	}
	
	public static void main(String[] args) {
		InstanceVariables iv=new InstanceVariables();
		iv.instanceVariables();
	}
	
}
