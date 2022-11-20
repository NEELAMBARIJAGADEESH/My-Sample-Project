package basicjava;

public class LargeNumber {
	int i=3;
	int j=8;
	int k=65;
	public void display() {
		System.out.println("The First number is "+i+"\nThe Second Number is "+j+"\nThe Third number is "+k);
		}
	public void large() {
		System.out.println("The Largest of three numbers is "+i+" and it is "+(i>j));
	}
	public void small() {
		int i=3;
		int j=8;
		int k=65;
		
		if(i<j&&i<k)
			System.out.println("The Smallest number is "+ i);
		else if(j<i&&j<k)
			System.out.println("The Smallest number is "+ j);
		else 
			System.out.println("The Smallest number is "+ k);
		
	}
	public void multiply() {
		System.out.println("The product of three numbers is "+(i*j*k));
	}
	public static void main(String[] args) {
				
		LargeNumber lar=new LargeNumber();
		lar.display();
		
		int i=3;
		int j=8;
		int k=65;
		
		if(i>j&&i>k)
			System.out.println("The largest number is "+ i);
		else if(j>i&&j>k)
			System.out.println("The largest number is "+ j);
		else 
			System.out.println("The largest number is "+ k);
		
		lar.small();
		lar.multiply();
	}
}
