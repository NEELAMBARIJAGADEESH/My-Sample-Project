package org.inheritence;

// child class
// using extends keyword to access parent class
public class HospitalBranch extends Hospital {
	
	public void hospitalName() {
	System.out.println("Hospital Name: WCF Hospitals");
	
	}
	
	private void hospitalLocation() {
		System.out.println("Location: T.Nagar");

	}
	
	public static void main(String[] args) {
		HospitalBranch h=new HospitalBranch();
		h.hospitalName();
		h.hospitalLocation();
				
		// calling parent class methods using child class object
		h.patientName();
		h.doctorName();
		h.pregnancyWeek();
		
	}
}
