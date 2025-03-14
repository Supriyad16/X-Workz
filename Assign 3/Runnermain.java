class Runnermain{
	public static void main(String[] args){
		
		long num = 12345l;
		String name =Details.name(num);
		System.out.println("The number "+num+ " belongs to "+name);
		System.out.println("******");
		System.out.println("    ");
		
		String cname = "Google";
		String owner = Office.owner(cname);
		System.out.println("The company " +cname+ " and the owner name is " +owner);
		System.out.println("******");
		System.out.println("    ");
		
		String fitem = "Pasta";
		int fprice = Item.price(fitem);
		System.out.println("The Food item" +fitem+ " and the price is " +fprice);
		System.out.println("******");
		System.out.println("    ");
		
		String account = "BA2506";
		int balance = Bank.balance(account);
		System.out.println("The account number is " +account+ " and their balance is " +balance);
		System.out.println("******");
		System.out.println("    ");
		
		String Source = "Car";
		String sprice = Information.price(Source);
		System.out.println("The source " +Source+ " and its price is " +sprice);
		System.out.println("******");
		System.out.println("    ");
		
		String pname = "RatanTata";
		String info = Person.alibveornot(pname);
		System.out.println("The Person " +pname+ " and their info " +info);
		System.out.println("******");
		System.out.println("    ");
		
		
		
		
	}
}