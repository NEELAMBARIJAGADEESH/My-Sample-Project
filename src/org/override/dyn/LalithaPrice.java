package org.override.dyn;

public class LalithaPrice extends GoldPrice {
	@Override
	public int basevalue() {
		int lp=2800;
		return lp;
	}
	
	@Override
	public void value() {
		System.out.println("The Gold Price in Chennai on aug 25 is: 4600");
	}
	
	@Override
	public void silver() {
		System.out.println("The value of silver is: 2500");
	}
	
	
	public static void main(String[] args) {
		LalithaPrice olp=new LalithaPrice();
		GrtPrice ogp=new GrtPrice();
		GoldPrice ogop=new GoldPrice();
		System.out.println("The Gold Rate in Lalitha "+olp.basevalue() + "\nThe Gold Rate in GRT "+ogp.basevalue());
		System.out.println("The Base Gold Rate is "+ogop.basevalue());
		
		LalithaPrice clp=new LalithaPrice();
		clp.value();
		
		LalithaPrice sv=new LalithaPrice();
		sv.silver();
		
	}
	
}
