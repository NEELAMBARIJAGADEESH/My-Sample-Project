package org.multilevel.inheritence;

 //child class
public class NurseryClass extends SchoolBranch {
	private void classTime() {
		double starttime= 09.35d;
			System.out.println("Nursery Class Timing is from " +starttime );
	}
	
	public static void main(String[] args) {
		NurseryClass nc=new NurseryClass();
				
		nc.schoolName();
		nc.studentName();
		
		nc.studentClass();
		nc.schBranch();
		
		nc.classTime();
		
	}
}
