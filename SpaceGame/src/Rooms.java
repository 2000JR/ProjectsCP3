import java.util.Scanner;

public class Rooms {
	static Room currentlocation;
	public static void main(String[] args) {
		boolean loop = true;
		Room room1 = new Room("Top-down entrance","Entrance to the maze, there is a door to the south and a hatch going up", 2);
		Room room2 = new Room("4-way intersection","a 4-way intersection with exits to the north, east, south, and west", 4);
		Room room3 = new Room("Hallway end","The end of the hallway with an exit to the east", 1);
		Room room4 = new Room("4-way intersection","a 4-way intersection with exits to the north, east, south, and west", 4);
		Room room5 = new Room("T-intersection","an intersection with exits to the north, east, and south", 3);
		Room room6 = new Room("T-intersection","an intersection with exits to the west, east, and south", 3);
		Room room7 = new Room("Corner","Corner with exits to the north and east", 2);
		Room room8 = new Room("Hallway end","The end of the hallway with an exit to the south", 1);
		Room room9 = new Room("Corner","Corner with exits to the north and west", 2);
		Room room10 = new Room("Hallway end","The end of the hallway with an exit to the south", 1);
		Room room11 = new Room("T-intersection","an intersection with exits to the west, east, and south", 3);
		Room room12 = new Room("Corner","Corner with exits to the south and west", 2);
		Room room13 = new Room("Hallway end","The end of the hallway with an exit to the north", 1);
		Room room14 = new Room("T-intersection","an intersection with exits to the west, east, and south", 3);
		Room room15 = new Room("Corner","Corner with exits to the south and east", 2);
		Room room16 = new Room("Hallway end","The end of the hallway with an exit to the north", 1);
		Room room17 = new Room("Corner","Corner with exits to the south and west", 2);
		Room room18 = new Room("Hallway end","The end of the hallway with an exit to the east", 1);
		Room room19 = new Room("Corner","Corner with exits to the north and west", 2);
		Room room20 = new Room("Corner","Corner with exits to the south and west", 2);
		Room room21 = new Room("Hallway end","The end of the hallway with an exit to the north", 1);
		Room room22 = new Room("T-intersection","an intersection with exits to the west, east, and north", 3);
		Room room23 = new Room("Corner","Corner with exits to the south and west", 2);
		Room room24 = new Room("Corner","Corner with exits to the north and east", 2);
		Room room25 = new Room("Hallway end","The end of the hallway with an exit to the west", 1);
		Room room26 = new Room("Corner","Corner with exits to the south and east", 2);
		Room room27 = new Room("T-intersection","an intersection with exits to the west, east, and north", 3);
		Room room28 = new Room("T-intersection","an intersection with exits to the west, east, and south", 3);
		Room room29 = new Room("Hallway end","The end of the hallway with an exit to the east", 1);
		Room room30 = new Room("Corner","Corner with exits to the north and west", 2);
		Room room31 = new Room("Hallway end","The end of the hallway with an exit to the east", 1);
		Room room32 = new Room("Corner","Corner with exits to the south and west", 2);
		Room room33 = new Room("T-intersection","an intersection with exits to the west, east, and north", 3);
		Room room34 = new Room("Corner","Corner with exits to the south and east", 2);
		Room room35 = new Room("Hallway end","The end of the hallway with an exit to the north", 1);
		Room room36 = new Room("Corner","Corner with exits to the south and east", 2);
		Room room37 = new Room("Hallway end","The end of the hallway with an exit to the west", 1);
		Room room38 = new Room("4-way intersection","a 4-way intersection with exits to the north, east, south, and west", 4);
		Room room39 = new Room("Corner","Corner with exits to the north and east", 2);
		Room room40 = new Room("Hallway end","The end of the hallway with an exit to the west", 1);
		Room room41 = new Room("Y-intersection","Y-intersection with exits going north west and southeast", 2);
		Room room42 = new Room("Corner","Corner with exits to the south and east", 2);
		Room room43 = new Room("Hallway end","The end of the hallway with an exit to the west", 1);
		Room room44 = new Room("Hallway end","The end of the hallway with an exit to the northwest\n"
							   +"There is a keycard on the floor here", 1);
		Room room45 = new Room("Corner","Corner with exits to the north and west", 2);
		Room room46 = new Room("T-intersection","an intersection with exits to the west, east, and south", 3);
		Room room47 = new Room("Corner","Corner with exits to the north and west", 2);
		Room room48 = new Room("Hallway end","The end of the hallway with an exit to the east", 1);
		Room room49 = new Room("T-intersection","an intersection with exits to the north, east, and south", 3);
		Room room50 = new Room("Corner","Corner with exits to the south and west", 2);
		Room room51 = new Room("Hallway end","The end of the hallway with an exit to the east", 1);
		Room room52 = new Room("Corner","Corner with exits to the north and west", 2);
		Room room53 = new Room("T-intersection","an intersection with exits to the west, east, and south", 3);
		Room room54 = new Room("Corner","Corner with exits to the south and east", 2);
		Room room55 = new Room("Hallway end","The end of the hallway with an exit to the north", 1);
		Room room56 = new Room("Corner","Corner with exits to the north and west", 2);
		
		currentlocation = room41;	
		showlnglocation();
		while (loop) {
			Scanner keyboard = new Scanner(System.in);
			System.out.println("What do you want to do?");
			String command = keyboard.nextLine().toUpperCase();
			if(command.equals("LOOK")) {					showlnglocation();
			}
			if(command.equals("N")) {
				if(currentlocation == room2) {
					currentlocation = room1;
				}
				else if(currentlocation == room45) {
					currentlocation = room2;
				}
				else if(currentlocation == room5) {
					currentlocation = room6;
				}
				else if(currentlocation == room4) {
					currentlocation = room5;
				}
				else if(currentlocation == room22) {
					currentlocation = room4;
				}
				else if(currentlocation == room21) {
					currentlocation = room20;
				}
				else if(currentlocation == room7) {
					currentlocation = room8;
				}
				else if(currentlocation == room9) {
					currentlocation = room10;
				}
				else if(currentlocation == room13) {
					currentlocation = room11;
				}
				else if(currentlocation == room14) {
					currentlocation = room12;
				}
				else if(currentlocation == room16) {
					currentlocation = room15;
				}
				else if(currentlocation == room19) {
					currentlocation = room17;
				}
				else if(currentlocation == room41) {
					currentlocation = room42;
				}
				else if(currentlocation == room38) {
					currentlocation = room36;
				}
				else if(currentlocation == room39) {
					currentlocation = room38;
				}
				else if(currentlocation == room24) {
					currentlocation = room23;
				}
				else if(currentlocation == room33) {
					currentlocation = room32;
				}
				else if(currentlocation == room35) {
					currentlocation = room34;
				}
				else if(currentlocation == room27) {
					currentlocation = room26;
				}
				else if(currentlocation == room30) {
					currentlocation = room28;
				}
				else if(currentlocation == room47) {
					currentlocation = room46;
				}
				else if(currentlocation == room49) {
					currentlocation = room50;
				}
				else if(currentlocation == room52) {
					currentlocation = room49;
				}
				else if(currentlocation == room56) {
					currentlocation = room53;
				}
				else if(currentlocation == room55) {
					currentlocation = room54;
				}
				
					showlnglocation();
			}
			if(command.equals("S")) {
				if(currentlocation == room1) {
					currentlocation = room2;
				}
				else if(currentlocation == room2) {
					currentlocation = room45;
				}
				else if(currentlocation == room6) {
					currentlocation = room5;
				}
				else if(currentlocation == room5) {
					currentlocation = room4;
				}
				else if(currentlocation == room4) {
					currentlocation = room22;
				}
				else if(currentlocation == room20) {
					currentlocation = room21;
				}
				else if(currentlocation == room8) {
					currentlocation = room7;
				}
				else if(currentlocation == room10) {
					currentlocation = room9;
				}
				else if(currentlocation == room11) {
					currentlocation = room13;
				}
				else if(currentlocation == room12) {
					currentlocation = room14;
				}
				else if(currentlocation == room15) {
					currentlocation = room16;
				}
				else if(currentlocation == room17) {
					currentlocation = room19;
				}
				else if(currentlocation == room42) {
					currentlocation = room41;
				}
				else if(currentlocation == room36) {
					currentlocation = room38;
				}
				else if(currentlocation == room38) {
					currentlocation = room39;
				}
				else if(currentlocation == room23) {
					currentlocation = room24;
				}
				else if(currentlocation == room32) {
					currentlocation = room33;
				}
				else if(currentlocation == room34) {
					currentlocation = room35;
				}
				else if(currentlocation == room26) {
					currentlocation = room27;
				}
				else if(currentlocation == room28) {
					currentlocation = room30;
				}
				else if(currentlocation == room46) {
					currentlocation = room47;
				}
				else if(currentlocation == room50) {
					currentlocation = room49;
				}
				else if(currentlocation == room49) {
					currentlocation = room52;
				}
				else if(currentlocation == room53) {
					currentlocation = room56;
				}
				else if(currentlocation == room54) {
					currentlocation = room55;
				}
			}
			if(command.equals("E")) {
				if(currentlocation == room54) {
					currentlocation = room53;
				}
				else if(currentlocation == room53) {
					currentlocation = room52;
				}
				else if(currentlocation == room3) {
					currentlocation = room2;
				}
				else if(currentlocation == room3) {
					currentlocation = room2;
				}
				else if(currentlocation == room3) {
					currentlocation = room2;
				}
				else if(currentlocation == room3) {
					currentlocation = room2;
				}
				else if(currentlocation == room3) {
					currentlocation = room2;
				}
				else if(currentlocation == room3) {
					currentlocation = room2;
				}
				else if(currentlocation == room3) {
					currentlocation = room2;
				}
				else if(currentlocation == room3) {
					currentlocation = room2;
				}
				else if(currentlocation == room3) {
					currentlocation = room2;
				}
				else if(currentlocation == room3) {
					currentlocation = room2;
				}
				else if(currentlocation == room3) {
					currentlocation = room2;
				}
				else if(currentlocation == room3) {
					currentlocation = room2;
				}
				else if(currentlocation == room3) {
					currentlocation = room2;
				}
				else if(currentlocation == room3) {
					currentlocation = room2;
				}
				else if(currentlocation == room3) {
					currentlocation = room2;
				}
				else if(currentlocation == room3) {
					currentlocation = room2;
				}
				else if(currentlocation == room3) {
					currentlocation = room2;
				}
				else if(currentlocation == room3) {
					currentlocation = room2;
				}
				else if(currentlocation == room3) {
					currentlocation = room2;
				}
				else if(currentlocation == room3) {
					currentlocation = room2;
				}
				else if(currentlocation == room3) {
					currentlocation = room2;
				}
				else if(currentlocation == room3) {
					currentlocation = room2;
				}
				else if(currentlocation == room3) {
					currentlocation = room2;
				}
				else if(currentlocation == room3) {
					currentlocation = room2;
				}
				else if(currentlocation == room3) {
					currentlocation = room2;
				}
				else if(currentlocation == room3) {
					currentlocation = room2;
				}
				else if(currentlocation == room3) {
					currentlocation = room2;
				}
				else if(currentlocation == room3) {
					currentlocation = room2;
				}
				
			}
			showlnglocation();
		}
	}
	public static void showlnglocation() {
		System.out.println(currentlocation.getRoomName());
		System.out.println(currentlocation.getRoomLngDesc());
	}
}
