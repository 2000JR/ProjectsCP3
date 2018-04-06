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
		//String hit;
		//boolean toobig;
		public static ArrayList <Ships> shiplist = new ArrayList<Ships>();
		static int shipnum = 0;
		//private Arraylist<> Positioning; possibly for positioning
		
		public Ships(String name, int length) {

			this.shipname = name;
			this.shiplength = length;
			this.shiphealth = length;
			this.x =  (Integer) null;
			this.y = (Integer) null;
			this.downright = true;
		}
	public Ships(String name, int length, int x, int y, boolean downright) {

		this.shipname = name;
		this.shiplength = length;
		this.shiphealth = length;
		this.x = x;
		this.y = y;
		this.hitList = new int[length];
		this.downright = downright;
		for (int i = 0; i < this.shiplength; i++) {
			this.hitList[i] = 0;		
		}
		
		Ships.shiplist.add(this);

	}
	public static void placement() {
		
	}
	public static void shipcheck() {
		
	}
	public static void Fire(int x, int y) { //ArrayList <Ships> shiplist
		
		for (Ships ship: shiplist) {
			if (ship.downright = true && (ship.y == y) || (ship.x == x)) {
				System.out.println("hit");
					Ships tempship = ship ;
				for(int i=0; i< tempship.getShiplength(); i-- ) {
				Battleship.mapmatrix[tempship.getY()][tempship.getX()] = tempship.getShipname();// Allows you to input the value on the map
				}
			} else {
				Ships tempship = ship;
				for(int i=0; i< tempship.getShiplength(); i--) {
					Battleship.mapmatrix[tempship.getY()][tempship.getX()] = tempship.getShipname();// Allows you to input the value on the map
					}
			}
			}
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
	
	
}

