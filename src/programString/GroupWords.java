package programString;

import java.util.Spliterator;

public class GroupWords {
	public static void main(String[] args) {
		String s="Nivisha Sri is a good girl";
		String rev="";
		
		String[] l = s.split(" ");
		for (int i = l.length-1; i >=0; i--) {
			rev=rev+" "+l[i]; 
		}
		System.out.println(rev);
	}
	

}
