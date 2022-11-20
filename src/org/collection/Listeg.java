package org.collection;

import java.util.*;

public class Listeg {

	public static void main(String[] args) {
		//****ArrayList****
		List<Object> mylist=new ArrayList<Object>();
		mylist.add(10);
		mylist.add("Nivisha");
		mylist.add(20);
		mylist.add(5.25);
		System.out.println("****Array List****");
		System.out.println(mylist);
		int size = mylist.size();
		System.out.println("The Size of my list is " +size);
		mylist.add(3,50);
		System.out.println(mylist);
		
		mylist.set(1, "Neelambari");
		System.out.println(mylist);
		
		mylist.remove(2);
		System.out.println(mylist);
		System.out.println("The Size of my list is " +size);
		
		int indexOf = mylist.indexOf("Neelambari");
		System.out.println(indexOf);
		
		boolean contain = mylist.contains(50);
		System.out.println(contain);
		
		if (contain) {
			System.out.println("true 1");
		}else System.out.println("false");
		
		System.out.println();
		System.out.println("****Linked List****");
		//****Linked List****
		List<Integer> newlist=new LinkedList <Integer>();
		newlist.add(100);
		newlist.add(200);
		newlist.add(600);
		newlist.add(400);
		newlist.add(500);
		
		System.out.println(newlist);
		int size2 = newlist.size();
		System.out.println(size2);
		mylist.addAll(newlist);
		System.out.println(mylist);
		System.out.println(mylist.size());
		
		/*mylist.retainAll(newlist);
		System.out.println(newlist);
		
		newlist.retainAll(mylist);
		System.out.println(newlist);  */
		
		System.out.println();
		System.out.println("****Vector List****");
		//****Vector****
		List<Boolean> Blist=new Vector<Boolean>();
		Blist.add(false);
		Blist.add(true);
		Blist.add(2, false);
		boolean equals = Blist.equals(mylist);
		System.out.println("Boolean Equals: " + equals);
		int indexOf2 = Blist.indexOf(false);
		System.out.println("Index of False is: " + indexOf2);
		int size3 = Blist.size();
		System.out.println("Size of Vector List: " + size3);
		Boolean boolean1 = Blist.get(0);
		System.out.println(boolean1);
		System.out.println(Blist);
		
		
		
		
	}
}
