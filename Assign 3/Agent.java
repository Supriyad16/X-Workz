class Agent{
	public static void purchase(String vegetable, int quantity){
	
	System.out.println("This is class Agent ");
	
	System.out.println("vegetable:" + vegetable);
	System.out.println("quantity:"+ quantity);
	System.out.println(" *****");
	
	vegetable = "Tomato";
	quantity = 2000;
	
	Shop.sell(vegetable, quantity);
	
	
	
	
	}
}