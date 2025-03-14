class Shop{
	public static void sell(String vegetable, int quantity){
		
		System.out.println("This is class Shop");
		
		 vegetable = "Carrot";
		 quantity = 1000;
		 
		 
		
		
		System.out.println("vegetable:"+vegetable);
		System.out.println("quantity:"+quantity);
		
		System.out.println("***** ");
		
		Customer.buy(vegetable, quantity);
		
		
	}
}