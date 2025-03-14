class Station{
	public static void send(int count){
		System.out.println("count:"+ count);
		String item = "Laptop";
		DeliveryGuy.accept(item);
		
	}
}