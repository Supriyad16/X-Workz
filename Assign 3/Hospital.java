class Hospital{
	public static void checkup(String patientname,int age,long mobile,String email, String sicknes){
		System.out.println("This is Hospital class");
		
		System.out.println("Patient name:"+ patientname);
		System.out.println("Age:"+age);
		System.out.println("Mobile:"+mobile);
		System.out.println("Email:"+email);
		System.out.println("Sickness:"+sicknes);
		System.out.println("  ");
		
	
		Doctor.treatment(patientname, age);
		
		
	}
}

