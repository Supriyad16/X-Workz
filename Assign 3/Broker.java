class Broker{
	public static void brokerage(String vegetable, int quantity){
		
		System.out.println("This is class Broker");
		
		System.out.println("vegetable:"+ vegetable);
		System.out.println("quantity:"+quantity);
		System.out.println("***** ");
		
		vegetable = "Beans";
	quantity = 1500;
	
	Agent.purchase(vegetable, quantity);
	
	
	
	
	}
}