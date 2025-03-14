class HospitalRunner{
	public static void main(String[] args){
		System.out.println("This is Runner class");
		
		//String customerName = "Kiran";
		
		String	patientname = "Anu";
		int age = 10;
		long mobile = 1234567890L;
		String email = "anu@gamil.com";
		String sicknes = "Fever";
		
		
		Hospital.checkup(patientname, age, mobile, email, sicknes);
	}
	
	
	
	
}



