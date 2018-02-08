
public class Room {
	private String roomName;
	private String roomShrtDesc;
	private String roomLngDesc;
	private int exitnum;
	int[] exitlist=new int[exitnum];
	
		public Room() {
			roomName="ERROR";
			roomShrtDesc="ERROR";
			roomLngDesc="ERROR";
		}
		
		public Room(String n, String ld, int e) {
			roomName=n;
			roomLngDesc=ld;
			exitnum=e;
		}

		public String getRoomName() {
			return roomName;
		}

		public void setRoomName(String roomName) {
			this.roomName = roomName;
		}

		public void setRoomShrtDesc(String roomShrtDesc) {
			this.roomShrtDesc = roomShrtDesc;
		}

		public String getRoomLngDesc() {
			return roomLngDesc;
		}

		public void setRoomLngDesc(String roomLngDesc) {
			this.roomLngDesc = roomLngDesc;
		}

		public int getExitnum() {
			return exitnum;
		}

		public void setExitnum(int exitnum) {
			this.exitnum = exitnum;
		}
		
/*		
Getters and Setters

public String getLocation() {
			return location;
		}
		public void setLocation(String location) {
			this.location = location;
		}
*/
				
}