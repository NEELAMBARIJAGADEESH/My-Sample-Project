
public class TaskbyJ {
	public static void main(String[] args) {
		//string remove special characters
		String s="Jagan*'#&$%!@allstatetest.com";
		System.out.println(s);
		
		//regular + expressions=[^regex]
		s = s.replaceAll("[^a-zA-Z@.]", "");
		System.out.println(s);
		
	}

}
