import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Ships {
	Scanner in = new Scanner(System.in);
	 private String shipname;
		private int shiplength;
		private int shiphealth;
		String[][] shipPosition = new String[0][0];
		String hit;
		boolean toobig;
		static Ships[] shiplist = new Ships[4];
		static int shipnum = 0;
	//private Arraylist<> Positioning; possibly for positioning

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome to the shape builder!");
		System.out.println("How many ships do you want?");
		Shipsbuild();
		//Scanner measurements = new Scanner(System.in);
		System.out.println();
		//shipPosition[2][3] = "";
	}

	public Ships(String name, int length, int health, String[][] position) {

		this.shipname = name;
		this.shiplength = length;
		this.shiphealth = health;
		this.shipPosition = position;
		Ships.shiplist[shipnum++] = new Ships(name, length, health, position);





	}
	public static void Shipsbuild() {
	
	}
}

