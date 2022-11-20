package basicjava;

public class SubtractNumbers {
	int i=10;
	int j=20;
	int k=j-i;
	public void display() {
		System.out.println("The First Number is ="+i+"\nThe Second Number is="+j);
   		}
	public void subtract() {
		System.out.println("The Subtracted value is = "+k);
		}
	public static void main(String[] args) {
		SubtractNumbers sub=new SubtractNumbers();
		sub.display();
		sub.subtract();
		
		
		
	}
}
