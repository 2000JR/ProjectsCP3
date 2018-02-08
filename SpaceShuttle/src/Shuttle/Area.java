package Shuttle;

import java.util.*;

public class Area {
	
	// Floor 1
	ShuttleRooms R1F1E1 = new ShuttleRooms(" ", "", " ", false);
	ShuttleRooms R2F1E1  = new ShuttleRooms(" ", "", " ", false);
	ShuttleRooms R3F1E1  = new ShuttleRooms(" ", "", " ", false);
	ShuttleRooms R4F1E2  = new ShuttleRooms(" ", "", " ", false);
	ShuttleRooms R5F1E2  = new ShuttleRooms(" ", "", " ", false);
	ShuttleRooms R6F1E1  = new ShuttleRooms(" ", "", " ", false);
	// Floor 2
	ShuttleRooms R7F2E1  = new ShuttleRooms(" ", "", " ", false);
	ShuttleRooms R8F2E1  = new ShuttleRooms(" ", "", " ", false);
	ShuttleRooms R9F2E1  = new ShuttleRooms(" ", "", " ", false);
	ShuttleRooms R10F2E1  = new ShuttleRooms(" ", "", " ", false);
	// Floor 3
	ShuttleRooms R11F3E1  = new ShuttleRooms(" ", "", " ", false);
	ShuttleRooms R12F3E1  = new ShuttleRooms(" ", "", " ", false);
	ShuttleRooms R13F3E1 = new ShuttleRooms(" ", "", " ", false);
	ShuttleRooms R14F3E1  = new ShuttleRooms(" ", "", " ", false);
	ShuttleRooms R15F3E1  = new ShuttleRooms(" ", "", " ", false);
	ShuttleRooms R16F3E1  = new ShuttleRooms(" ", "", " ", false);
	// Floor 4
	ShuttleRooms R17F4E1  = new ShuttleRooms(" ", "", " ", false);
	ShuttleRooms R18F4E1  = new ShuttleRooms(" ", "", " ", false);
	ShuttleRooms R19F4E1  = new ShuttleRooms(" ", "", " ", false);
	ShuttleRooms R20F4E1  = new ShuttleRooms(" ", "", " ", false);
	// Elevators
	ShuttleRooms E1  = new ShuttleRooms(" ", "", " ", false);
	ShuttleRooms E2  = new ShuttleRooms(" ", "", " ", false);
	ShuttleRooms E3  = new ShuttleRooms(" ", "", " ", false);
	ShuttleRooms E4  = new ShuttleRooms(" ", "", " ", false); 
	
	currentlocation = room41;
	showlnglocation() 
	while (loop) {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("What do you want to do?");
		String command = keyboard.nextLine().toUpperCase();
		if(command.equals("LOOK")) {
				showinglocation();
		}
	public static void showinglocation() {
		System.out.println(currentlocation.getRoomName());
		System.out.println(currentlocation.getRoomLngDesc());
}
	if (command.equals) {
		
}
}
}