import java.util.Scanner;

public class Battleship {
	static String[][] mapmatrix;
	static String[][] attackmap;
	static boolean downright;
	static Scanner in = new Scanner(System.in);
	static Ships s1 = new Ships(" S1 ", 3, 0, 1,true);
	static Ships s2 = new Ships(" S2 ", 3, 0, 1, true);
	static Ships s3 = new Ships(" S3 ", 3, 0, 1, true);
	static Ships s4 = new Ships(" S4 ", 3, 0, 1, true);
	static int inputa;
	static int inputb;// Generic Input Value 2// Generic Input Value 1
	static int bounds;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		boolean game=true;




		System.out.println("Input size of maps");// Allows user to control size of map

		inputa = in.nextInt();
		bounds=inputa;
		teammap(inputa);// The map with your own ships on it

		attackmap(inputa);// the map that marks the hits and misses on the enemy map
		in.nextLine();
		System.out.println("Input Battle for battle team, Input HQ for HQ team");
String hqbattle = in.nextLine();
		switch (hqbattle) { 
		case "Battle":


			//Creating ships on map !NEED TO MAKE METHOD FOR THIS!

			for(Ships ship: Ships.shiplist) {
				placinginput(ship);
			mapprint(mapmatrix);
		}
		/*placinginput(s1);
			mapprint(mapmatrix);



			placinginput(s2);
			mapprint(mapmatrix);

			placinginput(s3);

			mapprint(mapmatrix);


			placinginput(s4);

			mapprint(mapmatrix);
		 */
		System.out.println("");
		System.out.println("Send this to the HQ team: ");
		// x y downright *4
		sendShiplocations();//String for Ship sending Goes here-Owen
		System.out.println("");
		//Finished placing ships

		while(game) {
			System.out.println("Option Choice");
			int choice = in.nextInt();
			switch(choice) {
			case 1:
				System.out.println("Attack map\n ");
				mapprint(attackmap);
				break;
			case 2:
				System.out.println("Where did the enemy attack you?");
				System.out.println("before Hit check method");
				hitcheck(mapmatrix);
				mapprint(mapmatrix);
				break;
			case 3:

				System.out.println("Which ship will you move?\n s1, s2, s3, s4,");
				String moveship = in.nextLine();

				System.out.println("Forward=true, Backward = false");
				boolean move1 = in.nextBoolean();

				for(Ships ship: Ships.shiplist) {
					if(ship.getShipname().equalsIgnoreCase(moveship))	{
						if(move1) {
							movingforward(ship);
							System.out.println("Send this to HQ team");
							System.out.println(ship.getShipname()+" "+ship.getX()+" "+ship.getY()+" "+ship.getDownright());
						}
						else {
							movingbackward(ship);
							System.out.println("Send this to HQ team");
							System.out.println(ship.getShipname()+" "+ship.getX()+" "+ship.getY()+" "+ship.getDownright());
						}
					}
				}
				break;

					


				}
		}




				/*System.out.println("Attack map\n ");
				mapprint(attackmap);



				System.out.println("Where did the enemy attack you?");
				System.out.println("before Hit check method");
				hitcheck(mapmatrix);


				System.out.println("Which ship will you move?\n s1, s2, s3, s4,");
				String moveship = in.nextLine();
				System.out.println("Value of String for switch: "+moveship);
				switch(moveship) {

				case "s1":
					System.out.println("Forward=true, Backward = false");
					boolean move1= in.nextBoolean();
					if(move1) {
						movingforward(s1);
						System.out.println("Send this to HQ team");
						System.out.println("s1"+" "+s1.getX()+" "+s1.getY()+" "+s1.getDownright());
					}
					else {
						movingbackward(s1);
						System.out.println("Send this to HQ team");
						System.out.println("s1"+" "+s1.getX()+" "+s1.getY()+" "+s1.getDownright());

					}
				case "s2":
					System.out.println("Forward=true, Backward = false");
					boolean move2= in.nextBoolean();
					if(move2) {
						movingforward(s2);
						System.out.println("Send this to HQ team");
						System.out.println("s2"+" "+s2.getX()+" "+s2.getY()+" "+s2.getDownright());
					}
					else {
						movingbackward(s2);
						System.out.println("Send this to HQ team");
						System.out.println("s2"+" "+s2.getX()+" "+s2.getY()+" "+s2.getDownright());

					}
				case "s3":
					System.out.println("Forward=true, Backward = false");
					boolean move3= in.nextBoolean();
					if(move3) {
						movingforward(s3);
						System.out.println("Send this to HQ team");
						System.out.println("s3"+" "+s3.getX()+" "+s3.getY()+" "+s3.getDownright());
					}
					else {
						movingbackward(s3);
						System.out.println("Send this to HQ team");
						System.out.println("s3"+" "+s3.getX()+" "+s3.getY()+" "+s3.getDownright());

					}
				case "s4":
					System.out.println("Forward=true, Backward = false");
					boolean move4= in.nextBoolean();
					if(move4) {
						movingforward(s4);
						System.out.println("Send this to HQ team");
						System.out.println("s4"+" "+s4.getX()+" "+s4.getY()+" "+s4.getDownright());
					}
					else {
						movingbackward(s4);
						System.out.println("Send this to HQ team");
						System.out.println("s4"+" "+s4.getX()+" "+s4.getY()+" "+s4.getDownright());

					}

				}*/
	

		
			
		case "HQ":
			ingestshiplocations();
			while (game) {

				mapprint(mapmatrix);
				System.out.println("Where do you want to attack?");
				hitcheck(attackmap);
				System.out.println("Enter the movement the Battle team sent you:");
				switch(in.next()) {
				case "s1" :
					s1.setX(in.nextInt());
					s1.setY(in.nextInt());
					s1.setDownright(in.nextBoolean());
				case "s2" :
					s2.setX(in.nextInt());
					s2.setY(in.nextInt());
					s2.setDownright(in.nextBoolean());
				case "s3" :
					s3.setX(in.nextInt());
					s3.setY(in.nextInt());
					s3.setDownright(in.nextBoolean());
				case "s4" :
					s4.setX(in.nextInt());
					s4.setY(in.nextInt());
					s4.setDownright(in.nextBoolean());
				}

			}
}



	mapprint(mapmatrix);
		System.out.println(" ");

		//	hitcheck(minus1(inputa), minus1(inputb), mapmatrix);// How to input an attack on the player

		mapprint(mapmatrix);// prints out whatever map you enter into it
	}


	public static void ingestshiplocations() {
		System.out.println("Input Ship locations code from Battle Team.");
		s1.setX(in.nextInt());
		s1.setY(in.nextInt()-1);
		s1.setShiplength(3);
		s1.setDownright(in.nextBoolean());
		s2.setX(in.nextInt());
		s2.setY(in.nextInt());
		s2.setShiplength(3);
		s2.setDownright(in.nextBoolean());
		s3.setX(in.nextInt());
		s3.setY(in.nextInt());
		s3.setShiplength(3);
		s3.setDownright(in.nextBoolean());
		s4.setX(in.nextInt());
		s4.setY(in.nextInt());
		s4.setShiplength(3);
		s4.setDownright(in.nextBoolean());
		placingship(s1);
		placingship(s2);
		placingship(s3);
		placingship(s4);



	}
	public static void sendShiplocations() {
		System.out.println(s1.getX()+" "+s1.getY()+" "+s1.getDownright()+" "+s2.getX()+" "+s2.getY()+" "+" "+s2.getDownright()+" "+s3.getX()+" "+s3.getY()+" "+" "+s3.getDownright()+" "+s4.getX()+" "+s4.getY()+" "+" "+s4.getDownright()+" ");
	}
	public static void movingforward(Ships ship) {
		if (ship.getDownright()) {
			mapmatrix[ship.getY()-1][ship.getX()-1] =" ~~ ";
			ship.setY(ship.getY()+1);
			placingship(ship);
		} else {
			mapmatrix[ship.getY()-1][ship.getX()-1] =" ~~ ";
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
	public static void placinginput(Ships ship) {
		boolean T=true;
		while(T) {
			System.out.println("Input the x and y cords seperated by a space, where you want a "+ship.getShiplength()+" space ship");

			inputa = in.nextInt();// x coordinate
			ship.setX(inputa-1);

			inputb = in.nextInt();// y coordinate
			ship.setY(inputb-1);

			System.out.println("Input true for facing the ship down, input false for facing the ship right");
			ship.setDownright(in.nextBoolean());



			if(ship.getDownright()) {
				if(ship.getY()+ship.getShiplength()<=bounds/*&& shipbound(ship,mapmatrix)*/) {

					placingship(ship);
					break;



				}
			}
			else {
				if(ship.getX()+ship.getShiplength()<=bounds /*&& shipbound(ship,mapmatrix)*/) {


					placingship(ship);
					break;

				}

			}
			System.out.println("Try again");	
		}

	}

	public static void placingship(Ships ship) {


		if(ship.getDownright()) {
			if(ship.getY()+ship.getShiplength()<=bounds ) {
				if(ship.getDownright()) {

					for(int i=0; i<ship.getShiplength(); i++ ) {
						mapmatrix[ship.getY()+i][ship.getX()] = ship.getShipname();// Allows you to input the value on the map
					}

				} 


			}
		}
		else {
			if(ship.getX()+ship.getShiplength()<=bounds) {



				for(int i=0; i<ship.getShiplength(); i++ ) {
					mapmatrix[ship.getY()][ship.getX()+i] = ship.getShipname();// Allows you to input the value on the map
				}



			}

		}

	}


	public static Boolean shipbound(Ships ship,String[][] multiarray) {
		if(ship.getDownright()) {
			for(int i=0; i<ship.getShiplength(); i++ ) {
				if(multiarray[ship.getY()+i][ship.getX()]==" ~~ ") {
					if(i>=ship.getShiplength()) {
						return true;
					}
				}
				else {
					break;
				}
			}
			return false;

		}
		else {
			for(int i=0; i<ship.getShiplength(); i++ ) {
				if(multiarray[ship.getY()][ship.getX()+i]==" ~~ ") {
					if(i>=ship.getShiplength()) {
						return true;
					}
				}
				else {
					break;
				}
			}
			return false;

		}
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

				System.out.print(multiarray[i][j] + "|");
			}
			System.out.println("");
		}

	}

	public static int minus1(int num) {// minuses by one, pointless but used to ensure that the users inputs are
		// correct due to 0 being the beginning
		return num - 1;

	}

	public static void hitcheck(String[][] matrix) {
		System.out.println("X coordinate");
		int x = in.nextInt() - 1;
		System.out.println("y coordinate");
		int y = in.nextInt() - 1;
		
		if(Ships.registerHitforAllShips(Ships.shiplist, x, y)  == true  ) {
			System.out.println("HIT");
		}
		else {
			System.out.println("Miss");
		}
		
	
		
	}

}