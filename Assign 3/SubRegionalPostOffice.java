class SubRegionalPostOffice {
	public static void deliver(String customername, String address){
		System.out.println("This is class sub regional post office");
		
		System.out.println("Customer Name:"+ customername);
		System.out.println("Address:"+address);
		System.out.println("  ");
		
		customername = "Supriya";
		address = "Bhadravathi";
		
		 AreaPostOffice.deliver(customername,address);
		
		
	}
}