package nameselector;

import java.util.*;

public class Nameselector {

	public static void main(String[]args) {
	ArrayList<String> Name = new ArrayList<String>(); 
	
	Name.add("Javan");
	Name.add("Bobby");
	Name.add("Spencer");
	Name.add("Nick");
	Name.add("Ryan");
	Name.add("Chris");
	Name.add("Owen");
	Name.add("Darth Nick");
	
	
	Collections.shuffle(Name);
	
	System.out.println();
}
}