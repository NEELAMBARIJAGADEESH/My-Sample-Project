package jumpingStatements;

public class JumpStatEx {
	
	//** return Statement
	private static String returnEx() {
		int i=10;
		String s="Nivisha";
		return s;

	}
	
	public static void main(String[] args) {
		
		//***break statement
		for (int i = 0; i < 100; i++) {
			System.out.println(i);
			if (i==10) {
				break;
				
			}
			
		}
		System.out.println();
		
		//***continue statement
		for (int i = 101; i <= 110; i++) {
			if (i==105) {
				continue;
				}
			System.out.println(i);
			
			}
		System.out.println();
		
		//*** exit statement
		for (int i = 201; i <= 210; i++) {
//			if (i==203) {
//				System.exit(0);
//				
//			}
			System.out.println(i);
			
		}
		System.out.println();
		
				
		JumpStatEx r=new JumpStatEx();
		System.out.println(r.returnEx());
		System.out.println(returnEx()+ " Sri ");
		
	}

}
