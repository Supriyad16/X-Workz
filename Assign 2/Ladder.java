class Ladder{
	public static void climb(String name){
		
		System.out.println("Printing the Ladder class");
		System.out.println("Name:" + name);
	}
	
	public static void down(int age){
		System.out.println("Age:" + age);	
	}
	
	public static void up(char group ){
		System.out.println("Group:" + group);	
	}
	
	public static void lift(double weight, double height ){
		System.out.println("Weight:" + weight);
		System.out.println("Height:" + height);		
	}
	
	public static void travel(int distance, String shape ){
		System.out.println("Distance:" + distance);
		System.out.println("Shape:" + shape);		
	}
	
	public static void move(float time , double seconds, int item ){
		System.out.println("Time:" + time);
		System.out.println("Seconds:" + seconds);
		System.out.println("Item:" + item);
	}
	
	public static void come(double milisec, String colour, int cost ){
		System.out.println("Milisec:" + milisec);
		System.out.println("Colour:" + colour);
		System.out.println("Cost:" + cost);
		System.out.println(" ");
	}
}