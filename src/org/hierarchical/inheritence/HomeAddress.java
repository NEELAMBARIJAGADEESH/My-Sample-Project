package org.hierarchical.inheritence;

//hierarchical inheritence
//parent class

public class HomeAddress {
		String hn="DP Luxury Apartment";
		byte flrn=2;
		short fltn=201;
		String tn="R.Jagadeesh Kumar.B.E.,";
		
	public void homeName() {
		System.out.println("Home Name is "+hn );

	}
	
	public void floorNo() {
		System.out.println("Floor Number is "+flrn );

	}
	
	public void flatNo() {
		System.out.println("Flat Number is "+fltn);

	}
	
	public void tenantName() {
		System.out.println("Tenant Nsme is "+tn);
		
	}
}
