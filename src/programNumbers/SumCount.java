package programNumbers;

public class SumCount {
	public static void main(String[] args) {
		int sum=0;
		int count=0;
		for (int i = 0; i <= 10; i++) {
			if (i%2==0) {
				System.out.println(i);
			}
		}
		
		for (int i = 0; i <=10; i++) {
			if (i%2==0) {
				sum = sum + i;
				count++;
			}
		}
		System.out.println("Sum is "+sum);
		System.out.println("Count is "+ count);
	}

}
