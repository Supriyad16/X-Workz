class PostMaster{
	public static void deliver(String customername,String address){
		
		System.out.println("This is class Post master");
		
		System.out.println("Customer Name:"+customername);
		System.out.println("Address:"+address);
		System.out.println("  ");
		
		customername = "Sita";
		address = "Davangere";
		
		PostHeadMaster.deliver(customername,address);
	}
}