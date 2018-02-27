import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Scanner;
public class BMIFromFile {

	//variables 
	static String name;
	static double feet; //double
	static double inch; //double
	static double inchtofeet;
	static double height = 0; //double
	static double weightLBS = 0; // double
	static double weightKG = weightLBS/2.2046; //double 
	static double BMI = weightKG/ (height* height); //double
	static DecimalFormat Deci = new DecimalFormat("0.##"); // format for the BMI

	static File BMIdata = new File("BMI.txt"); // The file where the data is written to 



	public static void main (String[] args ) {
		filechecker(); // checks for file
		try {
			z(BMIdata); // begins the file writing method
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} //ends up being the whole code
		System.out.println("BMI completed!");

	}
	public static void filechecker() { // Checks for BMI file 
		if (!BMIdata.exists() || !(BMIdata.length() > 0)) { // creates file if file does not exists
			filecreator(BMIdata);
			System.out.println("BMI data file Created.");
		}  else if ((BMIdata.exists() || (BMIdata.length() > 0))) // if file is found and as data written into it then it will do nothing
			System.out.println("BMI data Found!");
	}

	// Creates the file for combining all of the testfiles
	public static void filecreator(File file) {
		try {
			FileWriter creator = new FileWriter(file);
			//creator.write("");
			creator.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void z(File file) throws IOException {

		// this is for scanning all files in the folder I put test files in. It will scan for .txt files in the folder
		File[] fileArray = new File("Test").listFiles();    // looks for the correct folder, put files in a arraylist     

		for(File Tests: fileArray) { // a loop for looking into files in the array.

			if(Tests.getName().endsWith(".txt")) // only get files that are text files
			{                 
				try {
					ArrayList<String[]> Namer = new ArrayList<String[]>();
					Scanner Testfinder = new Scanner(Tests); // find the the files
					while(Testfinder.hasNext()) {
						String token = Testfinder.nextLine(); // Temporarily sets the line as the variable
						if (token.contains("Name: ") ) { // gets the text after Name: for later saving into BMI.txt
							name = token.substring(6); // gets name

						} else if (token.contains("Feet: ")) { // token does the same thing for feet
							feet = Double.parseDouble(token.substring(5));
							//System.out.println(feet);
						} else if (token.contains("Inches: ")) {
							inch = Double.parseDouble(token.substring(8));
							inchtofeet = inch/12;

						} else if (token.contains("Weight (Pounds): ")) {
							weightLBS = Double.parseDouble(token.substring(17));
							weightKG = weightLBS/2.2046; // have to convert it here

							height = (feet + inchtofeet) * 0.3048;

							BMI = weightKG/ (height* height); 
							System.out.println(name + ": " + Deci.format(BMI) ); // shows each persons BMI

							// fw,bw,pw are for writing each file's data separately
							FileWriter fw = new FileWriter(file, true); // check if file exists again
							BufferedWriter BuffWriter = new BufferedWriter(fw); 
							PrintWriter Writer = new PrintWriter(BuffWriter); 

							Writer.write(name + ": " + Deci.format(BMI) + "\n"); // saves name and BMI to BMI.txt
							Writer.close();
							BuffWriter.close();
							fw.close(); //closing the writers
						}

					}

				} catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}  
			} 
		}    

	}
}
