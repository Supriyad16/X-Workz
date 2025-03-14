class Farmer{
	public static void farm(String vegetable, int quantity){
		
		System.out.println("This is class Farmer");
		
		System.out.println("vegetable:"+vegetable);
		System.out.println("quantity:"+quantity);
		System.out.println(" ******");
		
		vegetable = "Broccoli";
		quantity = 500;
		
		Broker.brokerage(vegetable, quantity);
		
		
	}
}