package programString;

public class RevAWord {
	public static void main(String[] args) {
		String s="Nivisha";
		String rev="";
		
		for (int i = s.length()-1; i >=0 ; i--) {
			char c = s.charAt(i);
			rev=rev+c;			
		}
		System.out.println(rev);
		if (s.equals(rev)) {
			System.out.println("Reversed String is a Palindrome");
		}
		System.out.println("Reversed String is not a Palindrome");
	}

}
