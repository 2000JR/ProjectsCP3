import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;
import java.util.Date;
public class ZiplineGas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		String firstinput;
		double gallons = 0;
		double regular = 2.54;
		double Midgrade = 2.81;
		double Premium = 3.06;
		double total = 0;
		double fuelgrade = 0;
		String fuelgradename = "";
		
		 Date date = new Date();
		 SimpleDateFormat dt = new SimpleDateFormat("yyyyy-mm-dd hh:mm:ss"); 
		PrintWriter fileout = null;
		try {
			fileout = new PrintWriter("reciept.txt");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Disk is read-only mode, cannot create file.");
		}
		
		System.out.println("Welcome to Zipline gas please select the fuel grade. \n"
				+ "Regular $2.54" + " Midgrade $2.81" + " Premium $3.06");
		firstinput = in.nextLine().toUpperCase() ;
		
		if (firstinput.equals("REGULAR")) {
			fuelgrade = regular;
			fuelgradename = "Regular";
							
			System.out.println("You selected the " +fuelgradename+ " fuel grade at the price of $"+fuelgrade+ "\n"
					+ "How many many gallons do you plan to refuel?");
			gallons = in.nextDouble();			
			total = gallons * fuelgrade;	
		}
		if (firstinput.equals("MIDGRADE")) {
			fuelgrade = Midgrade;
			fuelgradename = "Midgrade";
							
			System.out.println("You selected the " +fuelgradename+ " fuel grade at the price of $"+fuelgrade+ "\n"
					+ "How many many gallons do you plan to refuel?");
			gallons = in.nextDouble();			
			total = gallons * fuelgrade;		
		}
		if (firstinput.equals("PREMIUM")) {
			fuelgrade = Premium;
			fuelgradename = "Premium";
							
			System.out.println("You selected the " +fuelgradename+ " fuel grade at the price of $"+fuelgrade+ "\n"
					+ "How many many gallons do you plan to refuel?");
			gallons = in.nextDouble();			
			total = gallons * fuelgrade;		
		}
		System.out.println("Your total is " + total + " Thank you for stopping by Zipline Gas.");
		fileout.println("  		 		  		/= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =\\\r\n" + 
				"					  /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = \\\r\n" + 
				"					 ||                                                               						||\r\n" + 
				"					 ||                    " +     "ZipLine Gas" +"                   							        ||\r\n" + 
				"					 ||                   " +"Date: " +date.toString()+  "                       			||\r\n" + 
				"					 ||                                                               						||\r\n" + 
				"					 ||    "+  " 			    Items            Gallons	    Price per (G)    	Total " + " 		||\r\n" + 
				"					 ||                                                               						||\r\n" + 
				"					 ||   "+ "Fuel Grade:       " + fuelgradename + "          $" + gallons +"          $"+ fuelgrade +"  				"+ total+" 	    ||\r\n" + 
				"					 ||                                                               						||\r\n" + 
				"					 ||                                                               						||\r\n" + 
				"					 ||                                                            "+ "Total:     " +  total +" 	    ||\r\n" + 
				"					 ||                                                               						||\r\n" + 
				"					 ||                                                               						||\r\n" + 
				"					 ||                                                               						||\r\n" + 
				"					 ||                                                               						||\r\n" + 
				"					 ||                                                               						||\r\n" + 
				"					 ||                                                               						||\r\n" + 
				"					  \\= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = /\r\n" + 
				"					   \\= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = / ");

		fileout.close();
	}

}
