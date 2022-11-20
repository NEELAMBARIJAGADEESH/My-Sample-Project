
public class EgforLoop {

	public static void main(String[] args) {
		for(int i=0;i<=10;i++) {
			System.out.println(i+" My Name is Neelambari");
			System.out.println(i+" My Daughter name is Nivisha Sri");
		}
		
		for(int i=10;i>=0;i--) {
			System.out.println(i+" My Name is Neelambari");
			System.out.println(i+" My Daughter name is Nivisha Sri");
				}
		
		for(int i=0;i<5;i++) {
			for(int j=0;j<5;j++) {
				System.out.println("My Husband Name is Jagadeesh Kumar");
			}
		}
		
		int a[]=new int [5];
		a[0]=1;
		a[1]=2;
		a[2]=3;
		a[3]=3;
		a[4]=4;
		for (int i : a) {
			System.out.println(i);
			
		}
		
		System.out.println(a[4]+a[3]);
		System.out.println(a.length);
		
		
		int b[][]=new int [2][2];
		b[0][0]=10;
		b[0][1]=20;
		b[1][0]=30;
		b[1][1]=40;
		
		for (int[] k : b) {
			for (int i : k) {
				System.out.print(i);
				System.out.print(" ");
			
			}
					}
		System.out.println();
		System.out.println(b[1][0]);
		System.out.println(b.length);
		
		
		
		
		
		
	}
}
