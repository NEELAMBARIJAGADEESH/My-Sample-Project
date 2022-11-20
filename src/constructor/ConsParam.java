package constructor;

public class ConsParam {
	
		public ConsParam() {
			System.out.println("Non-Parameterized");
		}
		public ConsParam(String name) {
			System.out.println("Constructor type:" +name);
		}
		public ConsParam(String n, int i, char a) {
			System.out.println("Name: " + n +  "Age: " + i + "Initial: "+ a );
		}
		
		public static void main(String[] args) {
			ConsParam c=new ConsParam();
			ConsParam cp=new ConsParam("Parameterized");
			ConsParam c3=new ConsParam("Neela", 29 , 'S');
			
		}
	
}
