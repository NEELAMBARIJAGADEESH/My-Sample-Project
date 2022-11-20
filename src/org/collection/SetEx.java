package org.collection;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import keywords.StaticEx;

public class SetEx {
	public static void main(String[] args) {
		//Tree Set
		Set<Integer> s=new TreeSet<Integer>();
		s.add(10);
		s.add(20);
		s.add(40);
		System.out.println("Set: " +s);
		boolean contains = s.contains(20);
		System.out.println("Contains 20: " + contains);
		boolean empty = s.isEmpty();
		System.out.println("Set is Empty: " + empty);
		int size = s.size();
		System.out.println("Size of the set is " + size);
		for (Integer a : s) {
			System.out.println(a);
		}
		s.remove(20);
		s.add(50);
		s.add(60);
		System.out.println("Updated set is " + s);
		//Linked hash set
		Set<Character> a=new LinkedHashSet<Character>();
		a.add('N');
		a.add('I');
		a.add('V');
		a.add('I');
		a.add('S');
		a.add('H');
		a.add('A');
		System.out.println(a);
		//HashSet
		Set<String> l=new HashSet<String>();
		l.add("Nivisha");
		l.add("Neela");
		l.add("Jagadeesh");
		for (String string : l) {
			System.out.println(string);
		}
		//Example for static keyword under keywords package in staticEx class 
		StaticEx stat=new StaticEx();
		stat.sMethod();
		
		
	}

}
