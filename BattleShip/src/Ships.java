import java.util.ArrayList;
import java.util.Scanner;

public class Ships {
	Scanner in = new Scanner(System.in);
	static private String shipname;
	static private int shiplength;
	static private int shiphealth;
	static int[][] shipposition = new int[0][0];
	static String hit;
	static boolean toobig;
	
	//private Arraylist<> Positioning; possibly for positioning
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome to the shape builder!");
		System.out.println("How many ships do you want?");
		Shipsbuild();
		//Scanner measurements = new Scanner(System.in);
		System.out.println();
		
	}




	public Ships(String name, int length, int health, int[][] position) {
		
		shipname = name = "null";
		shiplength = length = 0;
		shiphealth = health = 5;
		shipposition = position;
			
			
		


	}
	public static void Shipsbuild() {
		
		Scanner namer = new Scanner(System.in);
		Ships.shipname = namer.next();
		
		Ships.shiplength = namer.nextInt();
		
		
		
		
	}
}

