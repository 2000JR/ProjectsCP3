
import java.io.DataInputStream;
import java.io.IOException;
import java.util.*;






public class Game {
	
	private Vector StationRooms;
	static StationRooms currentLocation;
	static String command = null;
	private Vector Exits = new Vector();
	//static ArrayList inventory = new ArrayList(); // Haven't used inventory into the room description yet
	
	public static void main(String [] args) {
		// Use your ISPlaying code
		//boolean isPlaying = true;
		boolean loop = true;
		DataInputStream din = new DataInputStream ( System.in );
		
		System.out.println("				Welcome to our Space Adventure game! You wake up in a room with no recollection of how you go here."
				+ " \n" +"					Your task is to find a way out of this strange place. Click Enter to continue.");
		for (;;)
		{
			

			// Get user input
			try
			{
				command = din.readLine();
				
				// Print a new line
				System.out.println();
			}
			catch (IOException e)
			{
			}
			
		// Floor 1
		StationRooms R1F1E1 = new StationRooms("R1F1E1", "It's the captain's room of the ship aka “The Bridge”" ,"There us an exit leading south.");
		StationRooms R2F1E1  = new StationRooms("R2F1E1", "It's a small room with an elevator in it.","There are 2 exits, one going north and one going south." );
		StationRooms R3F1E1  = new StationRooms("R3F1E1", "It's the room where the captain of the station sleeps.","There is an exit leading north.");
		StationRooms R4F1E2  = new StationRooms("R4F1E2", "The room is very small but has a small crate in the middle that seems to require a keycard.","There is an exit leading south.");
		StationRooms R5F1E2  = new StationRooms("R5F1E2 ", "The air in the room is very thin and smells strange. It is probably best to not stay here for long.",
				 "There are 2 exits, one going north and one going south");
		StationRooms R6F1E2  = new StationRooms("R6F1E2", "It's a small room with stairs leading down to the second floor.","The stairs leads SouthWest");
		// Floor 2
		StationRooms R7F2E1  = new StationRooms("R7F2E1", "It's a small room with what seems to be an elevator","There is an exit going east.");
		StationRooms R8F2E1  = new StationRooms("R8F2E1", "It's a large room with stairs leading up to the first floor.","There are 2 exits, one going west and one going east.");
		StationRooms R9F2E1  = new StationRooms("R9F2E1", "It's a small dark room with an alien in the center, luckily he's asleep.","There are 2 exits, one leading west and one leading east.");
		StationRooms R10F2E1  = new StationRooms("R10F2E1", "It's a small room with stairs leading down to the third floor.", "There is an exit leading west.");
		// Floor 3
		StationRooms R11F3E1  = new StationRooms("R11F3E1", "It's a dark room with a bunch of control panels that aren't powered.","There are 2 exits, one going west and one going east.");
		StationRooms R12F3E1  = new StationRooms("R12F3E1", "It's a small room with what seems to be an elevator","There is an exit going east.");
		StationRooms R13F3E1 = new StationRooms("R13F3E1", "It's a small broom closet.", "There is an exit going west.");
		StationRooms R14F3E1  = new StationRooms("R14F3E1", "It's a large room with a giant z on the floor.", "There is an exit going south.");
		StationRooms R15F3E1  = new StationRooms("R15F3E1", "It's another large room with power control for the station at the corner of the room.","There are 2 exits, one going north and one going west.");
		StationRooms MAZE  = new StationRooms("Maze Entrance", "This is the link to the maze");
		// Floor 4
		StationRooms R17F4E1  = new StationRooms("R17F4E1", "It's a small room with an elevator in it","There is an exit leading west.");
		StationRooms R18F4E1  = new StationRooms("R18F4E1", "It's the start of a long hallway to what seems to be the escape pods.","The hallway continue east with an exit to the west.");
		StationRooms R19F4E1  = new StationRooms("R19F4E1", "It's the end of the long hallway with three aliens in it.","The exit for the hallway continue east with an exit to the west but the aliens block your progress.");
		StationRooms R20F4E1  = new StationRooms("R20F4E1", "It's the room with the escape pods for the station.","There is an exit leading west.");
		// Elevators
		StationRooms E1  = new StationRooms("E1", "There are 3 floors to go to F2, F3, F4");
		StationRooms E2  = new StationRooms("E2", "There are 3 floors to go to F1, F3, F4");
		StationRooms E3  = new StationRooms("E3", "There are 3 floors to go to F1, F2, F4");
		StationRooms E4  = new StationRooms("E4", "There are 3 floors to go to F1, F2, F3"); 
		
		//MAZE
		StationRooms room1 = new StationRooms("Top-down entrance","Entrance to the maze, there is a door to the south and a hatch going up");
		StationRooms room2 = new StationRooms("4-way intersection","a 4-way intersection with exits to the north, east, south, and west");
		StationRooms room3 = new StationRooms("Hallway end","The end of the hallway with an exit to the east");
		StationRooms room4 = new StationRooms("4-way intersection","a 4-way intersection with exits to the north, east, south, and west");
		StationRooms room5 = new StationRooms("T-intersection","an intersection with exits to the north, east, and south");
		StationRooms room6 = new StationRooms("T-intersection","an intersection with exits to the west, east, and south");
		StationRooms room7 = new StationRooms("Corner","Corner with exits to the north and east");
		StationRooms room8 = new StationRooms("Hallway end","The end of the hallway with an exit to the south");
		StationRooms room9 = new StationRooms("Corner","Corner with exits to the north and west");
		StationRooms room10 = new StationRooms("Hallway end","The end of the hallway with an exit to the south");
		StationRooms room11 = new StationRooms("T-intersection","an intersection with exits to the west, east, and south");
		StationRooms room12 = new StationRooms("Corner","Corner with exits to the south and west");
		StationRooms room13 = new StationRooms("Hallway end","The end of the hallway with an exit to the north");
		StationRooms room14 = new StationRooms("T-intersection","an intersection with exits to the west, east, and north");
		StationRooms room15 = new StationRooms("Corner","Corner with exits to the south and east");
		StationRooms room16 = new StationRooms("Hallway end","The end of the hallway with an exit to the north");
		StationRooms room17 = new StationRooms("Corner","Corner with exits to the south and west");
		StationRooms room18 = new StationRooms("Hallway end","The end of the hallway with an exit to the east");
		StationRooms room19 = new StationRooms("Corner","Corner with exits to the north and west");
		StationRooms room20 = new StationRooms("Corner","Corner with exits to the south and west");
		StationRooms room21 = new StationRooms("Hallway end","The end of the hallway with an exit to the north");
		StationRooms room22 = new StationRooms("T-intersection","an intersection with exits to the west, east, and north");
		StationRooms room23 = new StationRooms("Corner","Corner with exits to the south and west");
		StationRooms room24 = new StationRooms("Corner","Corner with exits to the north and east");
		StationRooms room25 = new StationRooms("Hallway end","The end of the hallway with an exit to the west");
		StationRooms room26 = new StationRooms("Corner","Corner with exits to the south and east");
		StationRooms room27 = new StationRooms("T-intersection","an intersection with exits to the west, east, and north");
		StationRooms room28 = new StationRooms("T-intersection","an intersection with exits to the west, east, and south");
		StationRooms room29 = new StationRooms("Hallway end","The end of the hallway with an exit to the east");
		StationRooms room30 = new StationRooms("Corner","Corner with exits to the north and west");
		StationRooms room31 = new StationRooms("Hallway end","The end of the hallway with an exit to the east");
		StationRooms room32 = new StationRooms("Corner","Corner with exits to the south and west");
		StationRooms room33 = new StationRooms("T-intersection","an intersection with exits to the west, east, and north");
		StationRooms room34 = new StationRooms("Corner","Corner with exits to the south and east");
		StationRooms room35 = new StationRooms("Hallway end","The end of the hallway with an exit to the north");
		StationRooms room36 = new StationRooms("Corner","Corner with exits to the south and east");
		StationRooms room37 = new StationRooms("Hallway end","The end of the hallway with an exit to the west");
		StationRooms room38 = new StationRooms("4-way intersection","a 4-way intersection with exits to the north, east, south, and west");
		StationRooms room39 = new StationRooms("Corner","Corner with exits to the north and east");
		StationRooms room40 = new StationRooms("Hallway end","The end of the hallway with an exit to the west");
		StationRooms room41 = new StationRooms("T-intersection","T-intersection with exits going north, west and east");
		StationRooms room42 = new StationRooms("Corner","Corner with exits to the south and east");
		StationRooms room43 = new StationRooms("Hallway end","The end of the hallway with an exit to the west");
		StationRooms room44 = new StationRooms("Hallway end","The end of the hallway with an exit to the northwest\n"
							   +"There is a keycard on the floor here");
		StationRooms room45 = new StationRooms("Corner","Corner with exits to the north and west");
		StationRooms room46 = new StationRooms("T-intersection","an intersection with exits to the west, east, and south");
		StationRooms room47 = new StationRooms("Corner","Corner with exits to the north and west");
		StationRooms room48 = new StationRooms("Hallway end","The end of the hallway with an exit to the east");
		StationRooms room49 = new StationRooms("T-intersection","an intersection with exits to the north, east, and south");
		StationRooms room50 = new StationRooms("Corner","Corner with exits to the south and west");
		StationRooms room51 = new StationRooms("Hallway end","The end of the hallway with an exit to the east");
		StationRooms room52 = new StationRooms("Corner","Corner with exits to the north and west");
		StationRooms room53 = new StationRooms("T-intersection","an intersection with exits to the west, east, and south");
		StationRooms room54 = new StationRooms("Corner","Corner with exits to the south and east");
		StationRooms room55 = new StationRooms("Hallway end","The end of the hallway with an exit to the north");
		StationRooms room56 = new StationRooms("Corner","Corner with exits to the north and west");
		// Items
		
			Items spaceMachete = new Items("Space Machete","There's a Space Machete, a weapon that serves as standard issue for the crews of spaceships. It is a reasonable melee weapon, "
				+ "but not ideal for group combat." , "A sharp machete that you found in the broom closet of all places." ,  3 , 2);		
								
							Items Bombs = new Items("Bombs","There are some bombs,"
								+ " explosive metal spheres with a button and a short countdown timer. Best not mess around with these.",
				"Very old but powerful bombs, simply holding them fills you with power",3,4);
								
							Items keyCard1 = new Items("Keycard 1","There's a small plastic keycard. In small text along the top its says “Full Floor Clearance”",
				"A keycard owned by someone on the space station",1,0);
								
						Items Broom = new Items("Broom","There's a wooden broom with no real use other than hitting things with it.","A broom that you found in "
				+ "the broom closet that you took with you for no real reason other than to hit things with it.",2,1);
									
							Items escapePodKey = new Items("Escape Pod Key","There's a key used to escape the Space Station if needed.","A key you found in the navigation room. "
				+ "It is used to open an escape pod on the Space Station",1,0);
								
							Items powerCords = new Items("Power Cords","There's cords that were ripped out of somewhere but are still usable.","Cords that can possibly be "
				+ "used to power a part of the ship.",2,0);
									
							Items Journal = new Items("Captain's Journal","There's a journal with many entries made by the Captain of the Space Station.","The Captain's journal, "
				+ "all the entries aren't legible for some reason.",2,0);
									
							Items powerNotes = new Items("Station Power Notes","There's seems to be notes for the power control on the station.","You read the notes,"
				+ "Elevators=0, Floor 1=1, Floor 2=2, Floor 3=3, Floor 4=4",1,0);

							Items waterBottle = new Items("Water Bottle","There's a bottle full of old water.","It's a bottle of water that can't be drank due to it's contents.",2,0);

							Items keyCard2 = new Items("Key Card 2","There's a strange key card on the ground.","The second of two keycards on the Space Station. "
				+ "In bold letters it says, “Highest Clearence”",1,0);

							Items oldPhone = new Items("Broken Phone","There's a phone that was recently broken.","It's an old phone that is "
				+ "broken so no phone calls for you sadly",2,0);

							Items Hand = new Items("Hand","There's a human hand that seemed to be cut off in a battle.","A digusting human hand that you "
				+ "picked up off the ground and nobody knows why .",2,0);

							Items Ring = new Items("Ring","There's a golden ring that was left on the floor","A ring that can be worn but not recommended",1,0);

							Items Doll = new Items("Doll","There's an old doll that was abandoned during an attack.","A doll that has no real use "
				+ "other than to comfort you.",1,0);

							Items Gun = new Items("Old Gun","There's an old gun that was left on the ground.","An old gun with no ammo so it'll be of no use.",2,0);
								
							Items Note = new Items("Note","There's a tiny note on the ground","Thanks for playing our game!",1,0);
								
						  Items repairKit = new Items("Repair Kit","There's a repair kit in the crate",
				"It's a kit for repairing things! Perhaps it could be used somewhere.",2,0);
						
						 Items lostNote = new Items("Lost Note","There appears to be a note on the ground",
				"The note says “Jim lost his keycard in the maze again, whoever finds it please return it to him.”",1,0);
					
					

						R4F1E2.addRoomItems(Bombs);
						R4F1E2.addRoomItems(repairKit);
						R6F1E2.addRoomItems(Note);
						R7F2E1.addRoomItems(Ring);
						R9F2E1.addRoomItems(Hand);
						R9F2E1.addRoomItems(powerCords);
						R9F2E1.addRoomItems(Doll);
						R10F2E1.addRoomItems(lostNote);
						R15F3E1.addRoomItems(powerNotes);
						R14F3E1.addRoomItems(oldPhone);
						R13F3E1.addRoomItems(Broom);
						R13F3E1.addRoomItems(spaceMachete);
						R1F1E1.addRoomItems(Journal);
						R1F1E1.addRoomItems(keyCard1);
						R3F1E1.addRoomItems(waterBottle);
						R3F1E1.addRoomItems(Gun);
						R3F1E1.addRoomItems(escapePodKey);
						room44.addRoomItems(keyCard2);
						
		// Exits for Floor 1
		//Room 1 movement
		Exit R1e1 = new Exit (Exit.SOUTHWEST, R2F1E1);
		//room 2 movement
		Exit R2e1 = new Exit (Exit.NORTHWEST, R1F1E1);
		Exit R2e2 = new Exit (Exit.IN, E1); 
		Exit R2e3 = new Exit (Exit.SOUTHWEST, R3F1E1);
		//room 3 movement 
		Exit R3e1 = new Exit (Exit.SOUTHEAST, R4F1E2);
		Exit R3e2 = new Exit (Exit.SOUTHEAST, R6F1E2);
		// room 4
		Exit R4e1 = new Exit (Exit.SOUTHEAST, R5F1E2);
		//Room 5
		Exit R5e1 = new Exit (Exit.NORTHWEST, R4F1E2);
		Exit R5e2 = new Exit (Exit.SOUTHWEST, R6F1E2);
		//StationRooms 6
		Exit R6e1 = new Exit (Exit.IN, R8F2E1);
		Exit R6e2 = new Exit (Exit.NORTHEAST, R5F1E2);
		
		// Exits for Floor 2
		// Room 7
		Exit R7e1 = new Exit (Exit.SOUTHEAST, R8F2E1);
		Exit R7e2 = new Exit (Exit.IN, E2);
		// Room 8
		Exit R8e1 = new Exit (Exit.NORTHEAST, R9F2E1);
		Exit R8e2 = new Exit (Exit.IN, R2F1E1);
		Exit R8e3 = new Exit (Exit.NORTHWEST, R7F2E1);
		// Room 9
		Exit R9e1 = new Exit (Exit.SOUTHWEST, R8F2E1);
		Exit R9e2 = new Exit (Exit.EAST, R10F2E1);
		// Room 10
		Exit R10e1 = new Exit (Exit.WEST, R9F2E1);
		Exit R10e2 = new Exit (Exit.IN, R14F3E1);
		// Exits for floor 3
		
		// Room 11
		Exit R11e1 = new Exit (Exit.EAST, R12F3E1);
		// Room 12 
		Exit R12e1 = new Exit (Exit.EAST, R13F3E1);
		Exit R12e2 = new Exit (Exit.IN, R17F4E1);
		Exit R12e3 = new Exit (Exit.WEST, R11F3E1);
		// Room 13
		Exit R13e1 = new Exit (Exit.EAST, R14F3E1);
		Exit R13e2 = new Exit (Exit.WEST, R12F3E1);
		// Room 14
		Exit R14e1 = new Exit (Exit.EAST, MAZE);
		Exit R14e2 = new Exit (Exit.WEST, R13F3E1);
		Exit R14e3 = new Exit (Exit.SOUTH, R15F3E1);
		// Room 15
		Exit R15e1 = new Exit (Exit.EAST, MAZE);
		Exit R15e2 = new Exit (Exit.WEST, R13F3E1);
		Exit R15e3 = new Exit (Exit.NORTH, R14F3E1); 
		//MAZE Includes entrance and exit without entering the maze if player gets frustrated or wanted to get the key later.
		Exit R16e1 = new Exit (Exit.IN, room1);
		Exit R16e2 = new Exit (Exit.WEST, R14F3E1);
		//Exits Floor 4
		
		// R17
		Exit R17e1 = new Exit (Exit.EAST, R18F4E1);
		Exit R17e2 = new Exit (Exit.IN, E4);
		// R18
		Exit R18e1 = new Exit (Exit.EAST, R19F4E1);
		Exit R18e2 = new Exit (Exit.WEST, R17F4E1);
		// R19
		Exit R19e2 = new Exit (Exit.EAST, R20F4E1);
		Exit R19e1 = new Exit (Exit.WEST, R18F4E1);
		
		// R20
		Exit R20e1 = new Exit (Exit.WEST, R19F4E1);
		//Exit e7 = new Exit (Exit.);
		// Elevator going up
		Exit EE1toE2 = new Exit (Exit.UP, E2);
		Exit EE2toE3 = new Exit (Exit.UP, E3);
		Exit EE3toE4 = new Exit (Exit.UP, E4);
		// Elevator going down
		Exit EE4toE3 = new Exit (Exit.DOWN, E3);
		Exit EE3toE2 = new Exit (Exit.DOWN, E2);
		Exit EE2toE1 = new Exit (Exit.DOWN, E1);
		// Leaving the Elevator
		Exit EE1OUT = new Exit (Exit.OUT, R2F1E1);
		Exit EE2OUT = new Exit (Exit.OUT, R7F2E1);
		Exit EE3OUT = new Exit (Exit.OUT, R12F3E1);
		Exit EE4OUT = new Exit (Exit.OUT, R17F4E1);
		// Maze
		// North Exits
		Exit r2tor1 = new Exit (Exit.NORTH, room1);
		Exit r45tor2 = new Exit (Exit.NORTH, room2);
		Exit r5tor6 = new Exit (Exit.NORTH, room6);
		Exit r4tor5 = new Exit (Exit.NORTH, room5);
		Exit r22tor4 = new Exit (Exit.NORTH, room4);
		Exit r21tor20 = new Exit (Exit.NORTH, room20);
		Exit r7tor8 = new Exit (Exit.NORTH, room8);
		Exit r9tor10 = new Exit (Exit.NORTH, room10);
		Exit r13tor11 = new Exit (Exit.NORTH, room11);
		Exit r14tor12 = new Exit (Exit.NORTH, room12);
		Exit r16tor15 = new Exit (Exit.NORTH, room15);
		Exit r19tor17 = new Exit (Exit.NORTH, room7);
		Exit r41tor42 = new Exit (Exit.NORTH, room42);
		Exit r38tor36 = new Exit (Exit.NORTH, room36);
		Exit r39tor38 = new Exit (Exit.NORTH, room39);
		Exit r24tor23 = new Exit (Exit.NORTH, room39);
		Exit r33to32 = new Exit (Exit.NORTH, room33);
		Exit r35tor34 = new Exit (Exit.NORTH, room34);
		Exit r27tor26 = new Exit (Exit.NORTH, room27);
		Exit r30tor28 = new Exit (Exit.NORTH, room28);
		Exit r47tor46 = new Exit (Exit.NORTH, room46);
		Exit r49tor50 = new Exit (Exit.NORTH, room50);
		Exit r52tor49 = new Exit (Exit.NORTH, room49);
		Exit r56tor53 = new Exit (Exit.NORTH, room53);
		Exit r55tor54 = new Exit (Exit.NORTH, room54);
		// South Exits
		Exit r1tor2 = new Exit (Exit.SOUTH, room2);
		Exit r2tor45 = new Exit (Exit.SOUTH, room45);
		Exit r6tor5 = new Exit (Exit.SOUTH, room5);
		Exit r5tor4 = new Exit (Exit.SOUTH, room4);
		Exit r4tor22 = new Exit (Exit.SOUTH, room22);
		Exit r20tor21 = new Exit (Exit.SOUTH, room21);
		Exit r8tor7 = new Exit (Exit.SOUTH, room7);
		Exit r10tor9 = new Exit (Exit.SOUTH, room9);
		Exit r11tor13 = new Exit (Exit.SOUTH, room13);
		Exit r12tor14 = new Exit (Exit.SOUTH, room14);
		Exit r15torr16 = new Exit (Exit.SOUTH, room16);
		Exit r17tor19 = new Exit (Exit.SOUTH, room19);
		Exit r42tor41 = new Exit (Exit.SOUTH, room41);
		Exit r36to38 = new Exit (Exit.SOUTH, room38);
		Exit r23tor24 = new Exit (Exit.SOUTH, room24);
		Exit r32tor33 = new Exit (Exit.SOUTH, room33);
		Exit r34tor35 = new Exit (Exit.SOUTH, room35);
		Exit r26tor27 = new Exit (Exit.SOUTH, room27);
		Exit r28tor30 = new Exit (Exit.SOUTH, room30);
		Exit r46tor47 = new Exit (Exit.SOUTH, room47);
		Exit r50tor49 = new Exit (Exit.SOUTH, room49);
		Exit r49tor52 = new Exit (Exit.SOUTH, room52);
		Exit r53tor56 = new Exit (Exit.SOUTH, room56);
		Exit r54tor55 = new Exit (Exit.SOUTH, room55);
		
		//East
		Exit r54tor53 = new Exit (Exit.EAST, room53 );
		Exit r53tor52 = new Exit (Exit.EAST, room52);
		Exit r51tor50 = new Exit (Exit.EAST, room50);
		Exit r48tor47 = new Exit (Exit.EAST, room47);
		Exit r49tor46 = new Exit (Exit.EAST, room46);
		Exit r46tor45 = new Exit (Exit.EAST, room45);
		Exit r29tor28 = new Exit (Exit.EAST, room28);
		Exit r31tor30 = new Exit (Exit.EAST, room30);
		Exit r28tor27 = new Exit (Exit.EAST, room27);
		Exit r27tor32 = new Exit (Exit.EAST, room32);
		Exit r34tor33 = new Exit (Exit.EAST, room33);
		Exit r33tor38 = new Exit (Exit.EAST, room38);
		Exit r38tor41 = new Exit (Exit.EAST, room41);
		Exit r41tor44 = new Exit (Exit.EAST, room44);
		Exit r36tor37 = new Exit (Exit.EAST, room37);
		Exit r42tor43 = new Exit (Exit.EAST, room43);
		Exit r39tor40 = new Exit (Exit.EAST, room40);
		Exit r24to25 = new Exit (Exit.EAST, room25);
		Exit r18tor19 = new Exit (Exit.EAST, room19);
		Exit r15tor14 = new Exit (Exit.EAST, room14);
		Exit r14tor17 = new Exit (Exit.EAST, room17);
		Exit r26tor22 = new Exit (Exit.EAST, room22);
		Exit r22tor23 = new Exit (Exit.EAST, room23);
		Exit r3tor2 = new Exit (Exit.EAST, room2);
		Exit r2tor4 = new Exit (Exit.EAST, room4);
		Exit r4tor20 = new Exit (Exit.EAST, room20);
		Exit r5tor11 = new Exit (Exit.EAST, room11);
		Exit r11tor12 = new Exit (Exit.EAST, room12);
		Exit r7tor6 = new Exit (Exit.EAST, room6);
		Exit r6tor9 = new Exit (Exit.EAST, room9);
		
		//West
		Exit r53tor54 = new Exit (Exit.WEST, room54);
		Exit r52tor53 = new Exit (Exit.WEST, room53);
		Exit r50tor51 = new Exit (Exit.WEST, room51);
		Exit r47tor48 = new Exit (Exit.WEST, room48);
		Exit r46tor49 = new Exit (Exit.WEST, room49);
		Exit r45tor46 = new Exit (Exit.WEST, room46);
		Exit r28to29 = new Exit (Exit.WEST, room29);
		Exit r30to31 = new Exit (Exit.WEST, room31);
		Exit r27tor28 = new Exit (Exit.WEST, room28);
		Exit r32tor27 = new Exit (Exit.WEST, room27);
		Exit r33tor34 = new Exit (Exit.WEST, room34);
		Exit r38tor33 = new Exit (Exit.WEST, room33);
		Exit r41tor28 = new Exit (Exit.WEST, room28);
		Exit r44to41 = new Exit (Exit.WEST, room41);
		Exit r37tor36 = new Exit (Exit.WEST, room36);
		Exit r43tor42 = new Exit (Exit.WEST, room42);
		Exit r40tor39 = new Exit (Exit.WEST, room39);
		Exit r25tor24 = new Exit (Exit.WEST, room24);
		Exit r19tor28 = new Exit (Exit.WEST, room28);
		Exit r14tor15 = new Exit (Exit.WEST, room15);
		Exit r17tor14 = new Exit (Exit.WEST, room14);
		Exit r22tor26 = new Exit (Exit.WEST, room26);
		Exit r23tor22 = new Exit (Exit.WEST, room22);
		Exit r2tor3 = new Exit (Exit.WEST, room3);
		Exit r4tor2 = new Exit (Exit.WEST, room2);
		Exit r20tor4 = new Exit (Exit.WEST, room4);
		Exit r11tor5 = new Exit (Exit.WEST, room5);
		Exit r12tor11 = new Exit (Exit.WEST, room11);
		Exit r6tor7 = new Exit (Exit.WEST, room7);
		Exit r9tor6 = new Exit (Exit.WEST, room6);
		// out if MAZE
		Exit r1out = new Exit (Exit.OUT, MAZE);
		// adding Exits to the rooms 
		R1F1E1.addExit ( R1e1 );
		R2F1E1.addExit ( R2e1 );
		R2F1E1.addExit ( R2e2 );
		R2F1E1.addExit ( R2e3 );
		R3F1E1.addExit ( R3e1 );
		R3F1E1.addExit ( R3e2 );
		R4F1E2.addExit ( R4e1 );
		R5F1E2.addExit ( R5e1 );
		R5F1E2.addExit ( R5e2 );
		R6F1E2.addExit ( R6e1 );
		R6F1E2.addExit ( R6e2 );
		R7F2E1.addExit ( R7e1 );
		R7F2E1.addExit ( R7e2 );
		R8F2E1.addExit ( R8e1 );
		R8F2E1.addExit ( R8e2 );
		R8F2E1.addExit ( R8e3 );
		R9F2E1.addExit ( R9e1 );
		R9F2E1.addExit ( R9e2 );
		R10F2E1.addExit ( R10e1 );
		R10F2E1.addExit ( R10e2 );
		R11F3E1.addExit ( R11e1 );
		R12F3E1.addExit ( R12e1 );
		R12F3E1.addExit ( R12e2 );
		R12F3E1.addExit ( R12e3 );
		R13F3E1.addExit ( R13e1 );
		R13F3E1.addExit ( R13e2 );
		R14F3E1.addExit ( R14e1 );
		R14F3E1.addExit ( R14e2 );
		R14F3E1.addExit (R14e3);
		R15F3E1.addExit ( R15e1 );
		R15F3E1.addExit ( R15e2 );
		R15F3E1.addExit (R15e2);
		R15F3E1.addExit (R15e3);
		MAZE.addExit ( R16e1 );
		MAZE.addExit ( R16e2 );
		R17F4E1.addExit ( R17e1 );
		R17F4E1.addExit ( R17e2 );
		R18F4E1.addExit ( R18e1 );
		R18F4E1.addExit ( R18e2 );
		R19F4E1.addExit ( R19e1 );
		R19F4E1.addExit ( R19e2 );
		R20F4E1.addExit ( R20e1 );
		E1.addExit (EE1toE2);
		E1.addExit (EE1OUT);
		E2.addExit (EE2toE3);
		E2.addExit (EE2toE1);
		E2.addExit (EE2OUT);
		E3.addExit (EE3toE4);
		E3.addExit (EE3toE2);
		E3.addExit (EE3OUT);
		E4.addExit (EE4toE3);
		E4.addExit (EE4OUT);
		room1.addExit(r1tor2);
		room2.addExit(r2tor1);
		room2.addExit(r2tor45);
		room2.addExit(r2tor4);
		room2.addExit(r2tor3);
		room2.addExit(r2tor1);
		room3.addExit(r3tor2);
		room4.addExit(r4tor5);
		room4.addExit(r4tor2);
		room4.addExit(r4tor20);
		room4.addExit(r4tor22);
		room5.addExit(r5tor6);
		room5.addExit(r5tor11);
		room5.addExit(r5tor4);
		room6.addExit(r6tor7);
		room6.addExit(r6tor9);
		room6.addExit(r6tor5);
		room7.addExit(r7tor6);
		room7.addExit(r7tor8);
		room8.addExit(r8tor7);
		room9.addExit(r9tor6);
		room9.addExit(r9tor10);
		room10.addExit(r10tor9);
		room11.addExit(r11tor5);
		room11.addExit(r11tor12);
		room11.addExit(r11tor13);
		room12.addExit(r12tor11);
		room12.addExit(r12tor14);
		room13.addExit(r13tor11);
		room14.addExit(r14tor15);
		room14.addExit(r14tor12);
		room15.addExit(r15tor14);
		room15.addExit(r15torr16);
		room16.addExit(r16tor15);
		room17.addExit(r17tor14);
		room17.addExit(r17tor19);
		room18.addExit(r18tor19);
		room19.addExit(r19tor28);
		room19.addExit(r19tor17);
		room20.addExit(r20tor4);
		room20.addExit(r20tor21);
		room21.addExit(r21tor20);
		room22.addExit(r22tor26);
		room22.addExit(r22tor23);
		room22.addExit(r22tor4);
		room23.addExit(r23tor24);
		room23.addExit(r23tor22);
		room24.addExit(r24to25);
		room24.addExit(r24tor23);
		room25.addExit(r25tor24);
		room26.addExit(r26tor22);
		room26.addExit(r26tor27);
		room27.addExit(r27tor28);
		room27.addExit(r27tor32);
		room27.addExit(r27tor26);
		room28.addExit(r28to29);
		room28.addExit(r28tor27);
		room28.addExit(r28tor30);
		room29.addExit(r29tor28);
		room30.addExit(r30to31);
		room30.addExit(r30tor28);
		room31.addExit(r31tor30);
		room32.addExit(r32tor27);
		room32.addExit(r32tor33);
		room33.addExit(r33tor34);
		room33.addExit(r33tor38);
		room33.addExit(r33to32);
		room34.addExit(r34tor33);
		room34.addExit(r34tor35);
		room35.addExit(r35tor34);
		room36.addExit(r36tor37);
		room36.addExit(r36to38);
		room37.addExit(r37tor36);
		room38.addExit(r38tor33);
		room38.addExit(r38tor41);
		room38.addExit(r38tor36);
		room39.addExit(r39tor40);
		room39.addExit(r39tor38);
		room40.addExit(r40tor39);
		room41.addExit(r41tor28);
		room41.addExit(r41tor44);
		room41.addExit(r41tor42);
		room42.addExit(r42tor43);
		room42.addExit(r42tor41);
		room43.addExit(r43tor42);
		room44.addExit(r44to41);
		room45.addExit(r45tor46);
		room45.addExit(r45tor2);
		room46.addExit(r46tor49);
		room46.addExit(r46tor45);
		room46.addExit(r46tor47);
		room47.addExit(r47tor48);
		room47.addExit(r47tor46);
		room48.addExit(r48tor47);
		room49.addExit(r49tor46);
		room49.addExit(r49tor52);
		room49.addExit(r49tor50);
		room50.addExit(r50tor51);
		room50.addExit(r50tor49);
		room51.addExit(r51tor50);
		room52.addExit(r52tor53);
		room52.addExit(r52tor49);
		room53.addExit(r53tor54);
		room53.addExit(r53tor52);
		room53.addExit(r53tor56);
		room54.addExit(r54tor55);
		room55.addExit(r55tor54);
		room56.addExit(r56tor53);
		//adding The Rooms into Game 
		
		currentLocation = R5F1E2;
		
		//Game.showinglocation();
		while (loop) {
			Scanner keyboard = new Scanner(System.in);
			System.out.println(currentLocation.getRoomName());
			System.out.println(currentLocation.getShortDescription());
			System.out.println("What do you want to do?");
			
			String command = keyboard.nextLine().toUpperCase();
			for (Enumeration e = Game.getCurrentLocation().getRoomExits().elements(); e.hasMoreElements();)
			{
				Exit an_exit = (Exit) e.nextElement();

				if ( (an_exit.getDirectionName().compareTo(command) == 0) ||
					 (an_exit.getShortDirectionName().compareTo(command) == 0 )
				   )
				{
					// Set location to the location pointed to by exit
					setCurrentLocation( an_exit.getLeadsTo() );

					break;
				} 
			if(command.equals("LOOK")) {
				validCommand = true;
				System.out.println(currentLocation.getLongDescription());
				System.out.println(currentLocation.getRoomExits());
				if(currentLocation.getRoomItems().size()<1) {
					System.out.println("There are no items that you can see here");
					break;
				}
				else {
				System.out.println("You can see the following items in the room: ");
				for(int i=0; i<currentLocation.getRoomItems().size();i++) {
					Items item = (Items) currentLocation.getRoomItems().get(i);

					System.out.println(item.getItemdescription());
				}
				

			} 
				if(command.equals("QUIT")) {
			validCommand = true;
			System.out.println ("Okay. Bye!");
			System.exit(0);
			
		}
		if (command.length() == 0)
		{
			System.out.println ("Nope");
		
		}
		if (!validCommand)
		{
			System.out.println ("Not a valid command");
			System.out.println ();
		}
				}
			}
		}}}
		
	
	
	static boolean validCommand = false;
	
		public static void showinglocation() {
			System.out.println(currentLocation.getRoomName());
			System.out.println(currentLocation.getShortDescription());
			System.out.println("The exits are: ");
			for(int i=0;i<currentLocation.getRoomExits().size();i++) {
				Exit tempexit = (Exit) currentLocation.getRoomExits().get(i);
				
				System.out.println(tempexit.getDirectionName() + " " + tempexit.getLeadsTo());
			}
			command = command.toUpperCase();
		}
			
	
	

public static StationRooms getCurrentLocation()
	{
		return currentLocation;
	}

	
	private static void addExit(Exit e) {
		// TODO Auto-generated method stub
		
	}

	private static void addLocation(StationRooms StationRoom) {
		// TODO Auto-generated method stub
		
	}
private static void setCurrentLocation(StationRooms leadsTo) {
	// TODO Auto-generated method stub
	Game.currentLocation = leadsTo;
}
}