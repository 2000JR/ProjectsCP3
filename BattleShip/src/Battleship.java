import java.util.Scanner;

public class Battleship {
	static String[][] mapmatrix;
	static String[][] attackmap;
	static boolean downright;
	static Scanner in = new Scanner(System.in);
	static Ships s1 = new Ships(" S1 ", 3, 0, 1, true);
	static Ships s2 = new Ships(" S2 ", 3, 0, 1, true);
	static Ships s3 = new Ships(" S3 ", 3, 0, 1, true);
	static Ships s4 = new Ships(" S4 ", 3, 0, 1, true);
	static int inputa;
	static int inputb;// Generic Input Value 2// Generic Input Value 1
	public static void main(String[] args) {

		boolean game=true;
	
		
		
		System.out.println(s4.getHealth());
		System.out.println("Input size of maps");// Allows user to control size of map

		inputa = in.nextInt();

		teammap(inputa);// The map with your own ships on it

		attackmap(inputa);// the map that marks the hits and misses on the enemy map
		in.nextLine();
		System.out.println("Input Battle for battle team, Input HQ for HQ team");
		
		switch (in.nextLine()) { 
		case "Battle":
			
				
			//Creating ships on map !NEED TO MAKE METHOD FOR THIS!
			
		placingship(s1);
		mapprint(mapmatrix);
		
		
		
	placingship(s2);
	mapprint(mapmatrix);
	
placingship(s3);

mapprint(mapmatrix);


placingship(s4);

mapprint(mapmatrix);

System.out.println("");
//Finished placing ships

while(game) {
	/*mapprint(attackmap);
	
	System.out.println("Where do you want to attack?");
	hitcheck(attackmap);
	
	System.out.println("Where did the enemy attack you?");
	hitcheck(mapmatrix); */
	
	System.out.println("Which ship will you move?\n s1, s2, s3, s4");
	switch(in.nextLine()) {
	case "s1":
		System.out.println("Forward=true, Backward = false");
		boolean move1= in.nextBoolean();
		if(move1) {
			movingforward(s1);
			mapprint(mapmatrix);
		}
		else {
			movingbackward(s1);
			mapprint(mapmatrix);
		}
	case "s2":
		System.out.println("Forward=true, Backward = false");
		boolean move2= in.nextBoolean();
		if(move2) {
			movingforward(s2);
		}
		else {
			movingbackward(s2);
			
		}
	case "s3":
		System.out.println("Forward=true, Backward = false");
		boolean move3= in.nextBoolean();
		if(move3) {
			movingforward(s3);
		}
		else {
			movingbackward(s3);
			
		}
	case "s4":
		System.out.println("Forward=true, Backward = false");
		boolean move4= in.nextBoolean();
		if(move4) {
			movingforward(s4);
		}
		else {
			movingbackward(s4);
			
		}
		mapprint(mapmatrix);
	}
}
		case "HQ":
			
		}
		
		mapprint(mapmatrix);
		System.out.println(" ");
		
	//	hitcheck(minus1(inputa), minus1(inputb), mapmatrix);// How to input an attack on the player

		mapprint(mapmatrix);// prints out whatever map you enter into it
	}
	
	public static void movingforward(Ships ship) {
		if (ship.getDownright()) {
			mapmatrix[ship.getY()][ship.getX()] =" ~~ ";
			ship.setY(ship.getY()+1);
			placingship(ship);
		} else {
			mapmatrix[ship.getY()][ship.getX()] =" ~~ ";
			ship.setX(ship.getX()+1);
			placingship(ship);
		}
	}
	public static void movingbackward(Ships ship) {
		if (ship.getDownright()) {
			mapmatrix[ship.getY()+ship.getShiplength()-2][ship.getX()-1] =" ~~ ";
			ship.setY(ship.getY()-1);
			
			placingship(ship);
		} else {
			mapmatrix[ship.getY()+1][ship.getX()+ship.getShiplength()-2] =" ~~ ";
			ship.setX(ship.getX()-1);
		
			placingship(ship);
		}
	}
	public static void placingship(Ships ship) {
		System.out.println("Input the x and y cords seperated by a space, where you want a "+ship.getShiplength()+" space ship");
		//boolean conflict = false;
		
		inputa = in.nextInt();// x coordinate
		ship.setX(inputa-1);
		
		inputb = in.nextInt();// y coordinate
		ship.setY(inputb-1);
		
		System.out.println("Input true for facing the ship down, input false for facing the ship right");
		ship.setDownright(in.nextBoolean());
		
		if(ship.getDownright()) {
			
			for(int i=0; i<ship.getShiplength(); i++ ) {
			mapmatrix[ship.getY()+i][ship.getX()] = ship.getShipname();// Allows you to input the value on the map
			}
		} else {
			
			for(int i=0; i<ship.getShiplength(); i++ ) {
				mapmatrix[ship.getY()][ship.getX()+i] = ship.getShipname();// Allows you to input the value on the map
				}
		} if ((s2.getX() == s1.getX()) && (s2.getY() == s1.getY())) {
			//conflict = true;
			
			System.out.println("Cant place");
		}
	//	while (true) {
			
		//}
	}

	public static String[][] teammap(int mapsize) {// Creates the User's own map

		mapmatrix = new String[mapsize][mapsize];// Declaring matrix

		for (int i = 0; i < mapsize; i++) {// Y coordinate

			for (int j = 0; j < mapsize; j++) {// x coordinate
				if (mapmatrix[i][j] == null) {
					mapmatrix[i][j] = " ~~ ";
				}

			}

		}
		return mapmatrix;
	}

	public static String[][] attackmap(int mapsize) {// Creates a map the enemies map that show hit markers

		attackmap = new String[mapsize][mapsize];// Declaring matrix

		for (int i = 0; i < mapsize; i++) {// Y coordinate

			for (int j = 0; j < mapsize; j++) {// x coordinate
				if (attackmap[i][j] == null) {
					attackmap[i][j] = " ~~ ";
				}

			}

		}
		return attackmap;
	}

	public static void mapprint(String[][] multiarray) { // Prints out any matrix inputed

		for (int i = 0; i < multiarray.length; i++) {
			System.out.print("|");
			for (int j = 0; j < multiarray.length; j++) {

				System.out.print(mapmatrix[i][j] + "|");
			}
			System.out.println("");
		}

	}

	public static int minus1(int num) {// minuses by one, pointless but used to ensure that the users inputs are
										// correct due to 0 being the beginning
		return num - 1;

	}

	public static void hitcheck(String[][] matrix) {
		System.out.println("X coord");
		int x = in.nextInt()-1;
		System.out.println("y coord");
		int y = in.nextInt()-1;
		System.out.println("hit? True/False");
		boolean hit = in.nextBoolean();
		if(hit) {
			matrix[x][y] = " XX ";  
			
		}
		
		else {
			matrix[x][y] = " OO ";
		}
	}

}