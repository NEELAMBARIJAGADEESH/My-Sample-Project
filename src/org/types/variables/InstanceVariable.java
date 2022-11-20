package org.types.variables;

public class InstanceVariable {
	
	//instance variable 
	int i=2019;
	int j=2;
	
	private void exsistFamMem() {
		System.out.println("The First Baby born in "+i);
	}

	private void newBorn() {
		System.out.println("The Second Baby will be born in "+(i+4));
	}
	
	public static void main(String[] args) {
		InstanceVariable iv=new InstanceVariable();
		iv.exsistFamMem();
		iv.newBorn();
		
		//printing instance variable directly in manin method by using created object name
		System.out.println("The Total Number of Family Members will be "+(iv.j+2));
	}
}
