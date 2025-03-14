class Run{
	public static void main(String[] args){
		int count = 10;
		String location = "Bengaluru";
		Station.send(count);
		Courier.pickup(location);
		
	}
}