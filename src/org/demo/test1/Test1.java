package org.demo.test1;

import basicjava.AddingNumbers;

public class Test1 {
		private void divide() {
		int i=15;
		int j=3;
		int k=i/j;
		System.out.println("The First Number A is "+ i);
		System.out.println("The Second Number B is "+ j);
		System.out.println("A/B = "+k);
	}
		public static void main(String[] args) {
		Test1 t1=new Test1();
		t1.divide();
		
		AddingNumbers add=new AddingNumbers();
		add.display();
		
		add.addition();
	}
}
