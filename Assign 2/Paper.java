class Paper{
	public static void thick(String nam){
		
		System.out.println("Printing the Paper class");
		System.out.println("Name:" + nam);
	}
	
	public static void thin(int age){
		System.out.println("Age:" + age);	
	}
	
	public static void line(char group ){
		System.out.println("Group:" + group);	
	}
	
	public static void graph(double weight, double height ){
		System.out.println("Weight:" + weight);
		System.out.println("Height:" + height);		
	}
	
	public static void plain(int distance, String shape ){
		System.out.println("Distance:" + distance);
		System.out.println("Shape:" + shape);		
	}
	
	public static void craft(float time , double seconds, int item ){
		System.out.println("Time:" + time);
		System.out.println("Seconds:" + seconds);
		System.out.println("Item:" + item);
	}
	
	public static void sand(double milisec, String colour, int cost ){
		System.out.println("Milisec:" + milisec);
		System.out.println("Colour:" + colour);
		System.out.println("Cost:" + cost);
		System.out.println(" ");
	}
}