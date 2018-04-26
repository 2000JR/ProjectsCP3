import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Ships {
	//Scanner in = new Scanner(System.in);
	 	private String shipname;
		private int shiplength;
		private int shiphealth;
		private int x;
		private int y;
		private int[] hitList;
		private boolean downright;
		private int seg1 = 1;
		private int seg2 = 1;
		private int seg3 = 1;
		private int[] health = {1,1,1};
		//String hit;
		//boolean toobig;
		public static ArrayList <Ships> shiplist = new ArrayList<Ships>();
		static int shipnum = 0;
		//private Arraylist<> Positioning; possibly for positioning
		
		public Ships(String name, int length) {

			this.shipname = name;
			this.shiplength = length;
			this.shiphealth = length;
			this.x =  0;
			this.y = 0;
			
		}
	public Ships(String name, int length, int x, int y,boolean downright ) {

		this.shipname = name;
		this.shiplength = length;
		this.shiphealth = length;
		this.x = x;
		this.y = y;
		this.hitList = new int[length];
		for (int i = 0; i < this.shiplength; i++) {
			this.hitList[i] = 0;		
		}
		this.setHealth(new int[]{seg1,seg2,seg3});
		for (int i = 0; i < this.shiplength; i++) {
			this.getHealth()[i] = 1;
		}
	
		Ships.shiplist.add(this);

	}
	public static void placement() {
		
	}
	public static void shipcheck() {
		
	}
	public static void Fire() {
		
	}
	public static void HitShip() {
		
	}
	public String getShipname() {
		return shipname;
	}
	public void setShipname(String shipname) {
		this.shipname = shipname;
	}
	public int getShiplength() {
		return shiplength;
	}
	public void setShiplength(int shiplength) {
		this.shiplength = shiplength;
	}
	public int getShiphealth() {
		return shiphealth;
	}
	public void setShiphealth(int shiphealth) {
		this.shiphealth = shiphealth;
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public boolean getDownright() {
		return downright;
	}
	public void setDownright(boolean downright) {
		this.downright = downright;
	}
	public int[] getHealth() {
		return health;
	}
	public void setHealth(int[] health) {
		this.health = health;
	}
}
