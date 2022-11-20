package org.abstraction.ex;

public class InterfacefullexImp implements InterfaceFullex {
	
	@Override
	public void petrolCar() {
		String p="Tata Nexon";
		System.out.println("The Petrol car is "+p);
		
	}
	
	@Override
	public void dieselCar() {
		String d="Mahindra XUV 700";
		System.out.println("The Diesel car is "+d);
		
	}
	
	@Override
	public void electricCar() {
		String e="Tesla Model Y";
		System.out.println("The Electric car is "+e);
		
	}

	public static void main(String[] args) {
		InterfacefullexImp ie=new InterfacefullexImp();
		ie.petrolCar();
		ie.dieselCar();
		ie.electricCar();
	}
}
