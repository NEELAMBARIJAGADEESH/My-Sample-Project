package org.collection;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapEx {
	public static void main(String[] args) {
		//****Hash Map*****
		Map<Integer,Integer> m= new HashMap<Integer,Integer>();
		m.put(0, 100);
		m.put(1,2 );
		m.put(2, 500);
		m.put(5, 700);
		m.put(7, 800);
		m.put(8, 5);
		
		System.out.println(m);
		int size = m.size();
		System.out.println(size);
		Set<Integer> keySet = m.keySet();
		System.out.println(keySet);
		Collection<Integer> values = m.values();
		System.out.println(values);
		boolean containsKey = m.containsKey(6);
		System.out.println(containsKey);
		boolean containsValue = m.containsValue(700);
		System.out.println(containsValue);
		Integer integer = m.get(4);
		System.out.println(integer);
		Set<Entry<Integer, Integer>> entrySet = m.entrySet();
		System.out.println("Entry Set" +entrySet);
		m.clear();
		System.out.println(m);
	}
}
