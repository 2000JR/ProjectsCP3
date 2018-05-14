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
	//private int[] hitList;
	private  String[] hitList;
	private boolean downright;
	private boolean dead;
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
	public Ships(String name, int length, int x, int y, boolean downright) {

		this.shipname = name;
		this.shiplength = length;
		this.shiphealth = length;
		this.x = x;
		this.y = y;
		this.dead = false;
		this.hitList = new String[length];
		for (int i = 0; i < this.shiplength; i++) {
			this.hitList[i] = name;		
		}
		/*this.setHealth(new int[]{seg1,seg2,seg3});
		for (int i = 0; i < this.shiplength; i++) {
			this.getHealth()[i] = 1;
		}*/

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
	public boolean isDead() {
		System.out.println(this.shipname + "is destroyed");
		System.out.println(shiplist);
		this.shiplist.remove(this);
		System.out.println(shiplist);
		return dead;
	}
	public void setDead(boolean dead) {
		this.dead = dead;
	}


	//two methods are used to check if a ship is hit and to rewrite for printing

	public static boolean registerHit(Ships ship, int attackX, int attacky) {
		int x = ship.getX();
		int y = ship.getY();
		int length = ship.shiplength;
		boolean facing = ship.getDownright();
		
		System.out.println("Beginning x and y coord for ship ("+x+", "+y+")" );
		System.out.println("attack x and y coord for ship ("+attackX+", "+attacky+")");
		

		if(facing) {
			if(x==attackX - 1) {
				System.out.println("Ship name: " + ship.getShipname()+ " facing: "+ facing);
				for(int i = y;i < (y+length);i++) {
					if(i==attacky-1) {
						try {
						ship.hitList[i-1] += "X";
						System.out.println(Arrays.toString(ship.hitList));
						System.out.println(i);
					return true;
						}catch ( java.lang.ArrayIndexOutOfBoundsException e){ // This is when the hitlist is smaller than the hit coordinates
							System.out.println("There's a problem here?");
							System.err.println(Arrays.toString(ship.hitList));
							System.out.println(i);
						}
					}
				}
				}
			}
		
			else {
				//todo have to do a if the ship is horizontal 
				if(y==attacky -1) {
					for(int j = x;j<(x+length);j++) {
						if(j==attackX-2) {
							try {
							ship.hitList[j-1] += "X";
							System.out.println(j);
							System.out.println("yay");
							System.out.println(Arrays.toString(ship.hitList));
							return true; 
							} catch ( java.lang.ArrayIndexOutOfBoundsException e){ // This is when the hitlist is smaller than the hit coordinates
								System.out.println("There's a problem here?");
								System.err.println(Arrays.toString(ship.hitList));
								System.out.println(j);
							}
						}
					}
					}
				}
			
		
		return false;
	}
	public static boolean registerHitforAllShips(ArrayList<Ships> list, int attackX, int attackY) {
		boolean hit;
		attackX = attackX+ 1;
		attackY = attackY+ 1;
		for(Ships ship: list) {
			hit=registerHit(ship, attackX, attackY);
			if(hit) {
				hit = true;
				return hit;
			}
		}
		return false;

	}
}
