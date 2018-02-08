package Shuttle;

import java.util.*;

	public class ShuttleRooms {
	private String RoomName;
	private String ShortDescription;
	private String LongDescription;
	private ArrayList ItemsInRoom;
	private ArrayList Exits;
	private boolean Power;
	
	
	public void ShuttleRooms() {
	RoomName = new String();
	ShortDescription = new String();
	LongDescription = new String();
	ItemsInRoom = new ArrayList();
	Exits = new ArrayList();
	Power = new Boolean;
}
	public ShuttleRooms(String Title, String SD, String LD, Boolean Power  ) {
		RoomName = Title;
		ShortDescription = SD;
		LongDescription = LD;
		ItemsInRoom = ID;
		Exits =  E;
		Power = null;
	}
	public String getRoomName() {
		return RoomName;
	}
	public void setRoomName(String roomName) {
		RoomName = roomName;
	}
	public String getShortDescription() {
		return ShortDescription;
	}
	public void setShortDescription(String shortDescription) {
		ShortDescription = shortDescription;
	}
	public String getLongDescription() {
		return LongDescription;
	}
	public void setLongDescription(String longDescription) {
		LongDescription = longDescription;
	}
	public ArrayList getItemsInRoom() {
		return ItemsInRoom;
	}
	public void setItemsInRoom(ArrayList itemsInRoom) {
		ItemsInRoom = itemsInRoom;
	}
	public ArrayList getExits() {
		return Exits;
	}
	public void setExits(ArrayList exits) {
		Exits = exits;
	}
	public boolean isPower() {
		return Power;
	}
	public void setPower(boolean power) {
		Power = power;
	}
}
