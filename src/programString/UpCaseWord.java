package programString;

public class UpCaseWord {
	public static void main(String[] args) {
		String s="hi nivisha sri";
		String UpCase="";
		String[] split = s.split(" ");
		for (String u : split) {
			char c = u.charAt(0);
			UpCase=UpCase+Character.toUpperCase(c)+u.substring(1)+" ";
		}
		System.out.println(UpCase);
	}

}
