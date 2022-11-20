package org.exstatic;

public class BharatPetrol extends BasePrice {
	
	static int petrolPrice2;
	static int petrolPrice;
	public static int petrolPrice() {
	return 112;
	
	}
	
		public static void main(String[] args) {
		//BharatPetrol bp=new BharatPetrol();
		petrolPrice2 = petrolPrice();
		petrolPrice = BasePrice.petrolPrice();
		int pp=BasePrice.basepetrol;
		
			
		
		System.out.println(pp);
		
		System.out.println("Base Price is "+ petrolPrice);
		System.out.println("Bharat Petroleum Price is "+petrolPrice2);
		
	}

}
