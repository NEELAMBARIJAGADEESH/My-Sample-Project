package basicjava;

public class VariableInstLoc {

	int i=10;
	
	private void intLoc() {
		int i=20;
		System.out.println(i);
	}
	
	public static void main(String[] args) {
		
		VariableInstLoc vi=new VariableInstLoc();
		vi.intLoc();
	}
}
