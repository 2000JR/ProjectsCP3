
public class BattleDummy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ships S1 = new Ships("S1asdklfjl;ksdjf", 3, 0, 1);
		Ships s2 = new Ships("WazUp", 2, 5, 2);
		for(Ships ship: Ships.shiplist) {
			System.out.println( ship.getShipname() + "  " + ship.getX());
		}
		//System.out.println(Ships.shiplist);
	}
	
}
