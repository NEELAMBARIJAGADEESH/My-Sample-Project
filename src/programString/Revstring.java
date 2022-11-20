package programString;

public class Revstring {
	public static void main(String[] args) {
		String s="Nivisha lives in Chennai";
		String rev="";
		String[] t = s.split(" ");
		
		for (String string : t) {
			String r="";
			System.out.println(string);
			for (int i = string.length()-1; i>=0 ; i--) {
				char c=string.charAt(i);
				r=r+c;
			}
			rev=rev+r+" ";
		}
		System.out.println(rev);
		
		
	}

}
