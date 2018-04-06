
import java.util.Scanner;

public class Battleship {
	static String[][] mapmatrix;
	static String[][] attackmap;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int inputa;// Generic Input Value 1
		
		int inputb;// Generic Input Value 2
		
		int shotx = 1;
		int shoty = 2;
		boolean downright;
		Ships s1 = new Ships(" T1 ", 3, 0, 1, false);
		Ships s2 = new Ships(" T2 ",3,4,5, false);
		
		System.out.println("Input size of maps" );// Allows user to control size of map

		inputa = in.nextInt();

		teammap(inputa);// The map with your own ships on it

		attackmap(inputa);// the map that marks the hits and misses on the enemy map

		System.out.println("Input the y and x cords seperated by a space, where you want a ship");

		//inputa = in.nextInt();// y coordinate
		s1.setY(in.nextInt());
		inputb = in.nextInt();// x coordinate
		s1.setX(inputb);
		System.out.println("Input true for facing the ship down, input false for facing the ship right");
		downright=in.nextBoolean();
		if(downright) {
	
			for(int i=0; i<s1.getShiplength(); i++ ) {
			mapmatrix[s1.getY()-1+i][s1.getX()-1] = s1.getShipname();// Allows you to input the value on the map
			}
		} else {
			
			for(int i=0; i<s1.getShiplength(); i++ ) {
				mapmatrix[s1.getY()-1][s1.getX()-1+i] = s1.getShipname();// Allows you to input the value on the map
				}
		}
		
		//hitcheck(minus1(shotx), minus1(shoty), mapmatrix);// How to input an attack on the player
		if (hitcheck(minus1(shotx), minus1(shoty), mapmatrix) == true) {
			
			mapmatrix[minus1(shotx)][minus1(shoty)] = " H1 " ;
		}
		mapprint(mapmatrix);// prints out whatever map you enter into it
		
		System.out.println("\n");
		
		
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

	public static boolean hitcheck(int x, int y, String[][] matrix) {// Checks to see if a ships is located at that
																		// location and if it is not damaged already

		if (matrix[x][y] != " ~~ " && matrix[x][y].contains( "T1" )) {
			System.out.println("HIT");
			
			
			
			return true;
			
		} else {
			System.out.println("MISS");
			return false;
		}
	} 

}