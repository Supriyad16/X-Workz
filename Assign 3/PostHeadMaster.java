class PostHeadMaster{
	public static void deliver (String customername, String address){
		
		System.out.println("This is class Post head master");
		System.out.println("Customer Name:"+ customername);
		System.out.println("Address:"+address);
		System.out.println("  ");
		
		customername = "Ram";
		address = "Bengaluru";
		
		RegionalPostOffice.deliver(customername,address);
		
		
	}
}