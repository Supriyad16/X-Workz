class RegionalPostOffice{
	public static void deliver(String customername, String address){
		
		System.out.println("This is class Regional post office");
		
		System.out.println("Customer Name:"+ customername);
		System.out.println("Address:"+address);
		System.out.println("  ");
		
		customername = "Shobha";
		address = "Shimoga";
		
		SubRegionalPostOffice.deliver(customername,address);
	}
}