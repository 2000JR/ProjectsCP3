package game;

import java.util.*;

public final class StationRooms {
	 
	private String shortDescription;
	private String longDescription;
	private String roomName;
	private ArrayList roomExits;
	private ArrayList itemsInRoom;
	private boolean power;
	
	

	public StationRooms() {
		shortDescription = new String();
		longDescription = new String();
		roomName = new String();
		roomExits = new ArrayList();
		itemsInRoom = new ArrayList();
		power = false;
		
	}
	
	public StationRooms(String title) {
		shortDescription = new String();
		longDescription = new String();
		roomName = title;
		roomExits = new ArrayList();
		itemsInRoom = new ArrayList();
		power = false;
	}
	public StationRooms(String title, String shortdescrition) {
		shortDescription = shortDescription;
		longDescription = new String();
		roomName = title;
		roomExits = new ArrayList();
		itemsInRoom = new ArrayList();
		power = false;
	}
	public StationRooms(String title, String shortdescrition, String longdescription) {
		shortDescription = shortDescription;
		longDescription = longDescription;
		roomName = title;
		roomExits = new ArrayList();
		itemsInRoom = new ArrayList();
		power = false;
	}
	public void addExit(Exit exit) {
	roomExits.add(exit);
	}
	public void removeExit(Exit exit) {
		if(roomExits.contains(exit)) {
			roomExits.remove(exit);
		}
	}
	
	
	
	
	
	
	
	
	
	

}

