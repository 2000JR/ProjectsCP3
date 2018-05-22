import java.awt.Point;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Ships {
	// Scanner in = new Scanner(System.in);
	private String shipname;
	private int shiplength;
	private int shiphealth;
	private int x;
	private int y;
	// private int[] hitList;
	private String[] hitList;
	private boolean downright;
	private boolean dead;
	private Point[] shippart;
	private Point coord;
	public static int totals = 0;
	// String hit;
	// boolean toobig;
	public static ArrayList<Ships> shiplist = new ArrayList<Ships>();
	static int shipnum = 0;
	// private Arraylist<> Positioning; possibly for positioning
	private boolean placed;
	public Ships(String name, int length) {

		this.shipname = name;
		this.shiplength = length;
		this.shiphealth = length;
		this.x = 0;
		this.y = 0;

	}

	public Ships(String name, int length, int x, int y, boolean downright) {

		this.shipname = name;
		this.shiplength = length;
		this.shiphealth = length;
		this.x = x;
		this.y = y;
		this.dead = false;
		this.coord = new Point(x, y);
		this.hitList = new String[length];
		totals+=length;
		for (int i = 0; i < this.shiplength; i++) {
			this.hitList[i] = name;
		}
		this.shippart = new Point[length];

		for (int i = 0; i < length * 2; i++) {
			coord.clone();

		}
		/*
		 * this.setHealth(new int[]{seg1,seg2,seg3}); for (int i = 0; i <
		 * this.shiplength; i++) { this.getHealth()[i] = 1; }
		 */

		Ships.shiplist.add(this);

	}

	public static void placement() {

	}

	public static void shipcheck() {

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

	public boolean isDead(Ships ship) {
		if (ship.shiplength == 3 && (ship.hitList[0].toString().contains("X")) && (ship.hitList[1].toString().contains("X")) && (ship.hitList[2].toString().contains("X"))) {
			System.out.println(ship + "has been destroyed.");
			shiplist.remove(ship);
		}
		return dead;
	}

	public void setDead(boolean dead) {
		this.dead = dead;
		
	}

	// two methods are used to check if a ship is hit and to rewrite for printing

	public static boolean registerHit(Ships ship, int attackX, int attacky) {
		ship.setShippart();
		int x = ship.getX();
		int y = ship.getY();
		int z = 0;

		Point temppoint = new Point(ship.getShippart()[0].x,ship.getShippart()[0].y);
		Point temppoint1 = new Point(ship.getShippart()[1].x,ship.getShippart()[1].y);
		Point temppoint2 = new Point(ship.getShippart()[2].x,ship.getShippart()[2].y);
		
		Point attackpoint = new Point(attackX - 1,attacky - 1);
		int length = ship.shiplength;
		boolean facing = ship.getDownright();

		System.out.println("Beginning x and y coord for ship (" + x + ", " + y + ")");
		System.out.println("attack x and y coord for ship (" + attackX + ", " + attacky + ")");
		System.out.println("Attack Point "+attackpoint);
		System.out.println("Temppoint " + temppoint);
		if (facing) {
			if (temppoint.getX() == attackpoint.getX()) {
				System.out.println("Ship name: " + ship.getShipname());



				Point tempcoord = new Point(x, y);
				System.out.println(tempcoord);
				System.out.println(temppoint);
				if ((attackpoint.getX() == temppoint.getX() && attackpoint.getY() == temppoint.getY())  ) {

					if (ship.getShippart()[0].x == temppoint.getX()) {
						System.out.println("HIT");
						ship.hitList[0] += "X";
						System.out.println(ship.getShippart().toString());
						System.out.println(Arrays.toString(ship.hitList));
						return true;
					}


				}
				if (attackpoint.getX() == temppoint1.getX() && attackpoint.getY() == temppoint1.getY()){
					if (ship.getShippart()[1].x == temppoint1.getX()) {
						ship.hitList[1] += "X";
						System.out.println(ship.getShippart().toString());
						System.out.println(Arrays.toString(ship.hitList));
						return true;
					}
				}
				if (attackpoint.getX() == temppoint2.getX() && attackpoint.getY() == temppoint2.getY()) {
					if (ship.getShippart()[2].x == temppoint2.getX()) {
						ship.hitList[2] += "X";
						System.out.println(ship.getShippart().toString());
						System.out.println(Arrays.toString(ship.hitList));
						return true;
					}
				}
				if (ship.hitList.length == 4) {
					Point temppoint3 = new Point(ship.getShippart()[3].x,ship.getShippart()[3].y);
					if (attackpoint.getX() == temppoint3.getX() && attackpoint.getY() == temppoint3.getY()) {
						if (ship.getShippart()[3].x == temppoint2.getY()) {
							ship.hitList[3] += "X";
							System.out.println(ship.getShippart().toString());
							System.out.println(Arrays.toString(ship.hitList));
							return true;
						}
				}
				}
				if (ship.hitList.length == 5) {
					Point temppoint4 = new Point(ship.getShippart()[4].x,ship.getShippart()[4].y);
					if (attackpoint.getX() == temppoint4.getX() && attackpoint.getY() == temppoint4.getY()) {
						if (ship.getShippart()[4].x == temppoint2.getY()) {
							ship.hitList[4] += "X";
							System.out.println(ship.getShippart().toString());
							System.out.println(Arrays.toString(ship.hitList));
							return true;
						}
					}
				}
			}		
		} else {
			if (temppoint.getY() == attackpoint.getY()) {
				System.out.println("Ship name: " + ship.getShipname());



				Point tempcoord = new Point(x, y);
				System.out.println(tempcoord);
				System.out.println(temppoint);
				if ((attackpoint.getX() == temppoint.getX() && attackpoint.getY() == temppoint.getY())  ) {

					if (ship.getShippart()[0].y == temppoint.getY()) {
						System.out.println("HIT");
						ship.hitList[0] += "X";
						System.out.println(ship.getShippart().toString());
						System.out.println(Arrays.toString(ship.hitList));
						return true;
					}


				}
				if (attackpoint.getX() == temppoint1.getX() && attackpoint.getY() == temppoint1.getY()){
					if (ship.getShippart()[1].y == temppoint1.getY()) {
						ship.hitList[1] += "X";
						System.out.println(ship.getShippart().toString());
						System.out.println(Arrays.toString(ship.hitList));
						return true;
					}
				}
				if (attackpoint.getX() == temppoint2.getX() && attackpoint.getY() == temppoint2.getY()) {
					if (ship.getShippart()[2].y == temppoint2.getY()) {
						ship.hitList[2] += "X";
						System.out.println(ship.getShippart().toString());
						System.out.println(Arrays.toString(ship.hitList));
						return true;
					}
					
				}
				if (ship.hitList.length == 4) {
					Point temppoint3 = new Point(ship.getShippart()[3].x,ship.getShippart()[3].y);
					if (attackpoint.getX() == temppoint3.getX() && attackpoint.getY() == temppoint3.getY()) {
						if (ship.getShippart()[3].y == temppoint2.getY()) {
							ship.hitList[3] += "X";
							System.out.println(ship.getShippart().toString());
							System.out.println(Arrays.toString(ship.hitList));
							return true;
						}
				}
				}
				if (ship.hitList.length == 5) {
					Point temppoint4 = new Point(ship.getShippart()[4].x,ship.getShippart()[4].y);
					if (attackpoint.getX() == temppoint4.getX() && attackpoint.getY() == temppoint4.getY()) {
						if (ship.getShippart()[4].y == temppoint2.getY()) {
							ship.hitList[4] += "X";
							System.out.println(ship.getShippart().toString());
							System.out.println(Arrays.toString(ship.hitList));
							return true;
						}
					}
				}
				
			}
			
		}
		
		return false;
	}
	/* public static boolean registerHit(Ships ship, int attackX, int attacky) {
		int x = ship.getX();
		int y = ship.getY();
		int length = ship.shiplength;
		boolean facing = ship.getDownright();

		System.out.println("Beginning x and y coord for ship (" + x + ", " + y + ")");
		System.out.println("attack x and y coord for ship (" + attackX + ", " + attacky + ")");

		if (facing) {
			if (x == attackX - 1) {
				System.out.println("Ship name: " + ship.getShipname() + " facing: " + facing);
				for (int i = y; i < (y + length); i++) {
					if (i == attacky - 1) {
						try {

							ship.hitList[i] += "X";
							System.out.println(Arrays.toString(ship.hitList));
							System.out.println(Arrays.toString(ship.shippart));
							System.out.println(i);
							return true;
						} catch (java.lang.ArrayIndexOutOfBoundsException e) { // This is when the hitlist is smaller
																				// than the hit coordinates
							System.out.println("There's a problem here?");
							System.err.println(Arrays.toString(ship.hitList));
							System.out.println(i);
						}
					}
				}
			}
		}

		else {
			// todo have to do a if the ship is horizontal
			if (y == attacky - 1) {
				for (int j = x; j < (x + length); j++) {
					if (j == attackX - 1) {
						try {
							ship.hitList[j] += "X";
							System.out.println(j);
							System.out.println("yay");
							System.out.println(Arrays.toString(ship.hitList));
							return true;
						} catch (java.lang.ArrayIndexOutOfBoundsException e) { // This is when the hitlist is smaller
																				// than the hit coordinates
							System.out.println("There's a problem here?");
							System.err.println(Arrays.toString(ship.hitList));
							System.out.println(j);
						}
					}
				}
			}
		}

		return false;
	}*/
	//	public static int index(Ships ship, int attackX, int attackY) {
	//		int index = 0;
	//		ship.setShippart();
	//		attackX = attackX;
	//		attackY = attackY;
	//		Point s = new Point(attackX, attackY);
	//		if (attackX == ship.getX()){
	//		for (int  i = 0; i < ship.getShippart().length; i++ ) {
	//			
	//			if (ship.getShippart()[i] == s)
	//
	//
	//			index = i;
	//			
	//		}
	//		
	//		}
	//		
	//		return index;
	//		
	//	}
	public static boolean registerHitforAllShips(ArrayList<Ships> list, int attackX, int attackY) {
		boolean hit;
		attackX = attackX + 1;
		attackY = attackY + 1;
		for (Ships ship : list) {
			hit = registerHit(ship, attackX, attackY);
			if (hit) {
				hit = true;

				return hit;
			}
		}
		return false;

	}

	public Point[] getShippart() {
		return shippart;
	}

	public void setShippart() {
		// this.shippart = shippart;
		this.shippart[0] = this.coord;
		if (this.getDownright()) {
			System.out.println(this.getDownright());
			for (int i = 0; i < this.shiplength; i++) {
				int a = i + this.getY();		//int a = this.coord.y + i + this.getY();
				Point tempcoord = new Point(this.x, a);
				this.shippart[i] = tempcoord;

			}
		} else {
			System.out.println(this.getDownright());
			for (int i = 0; i < this.shiplength; i++) {
				int a = i + this.getX();		//int a = this.coord.x + i + this.getX();
				Point tempcoord = new Point(a, this.y);
				this.shippart[i] = tempcoord;
			}
		}
	}
	public boolean isPlaced() {
		return placed;
	}
	public Point getCoord() {
		return coord;
	}

	public void setCoord(Point coord) {
		this.coord = coord;
	}

	public void setPlaced(boolean placed) {
		this.placed = placed;
	}
}
