import java.io.*;
import java.text.DecimalFormat;
import java.util.*;
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
	static DecimalFormat Deci = new DecimalFormat("0.##"); 
	//file creation testing
	/*File Test = new File("test.txt"); 
	File Test2 = new File("test2.txt");
	File Test3 = new File("test3.txt");
	File Test4 = new File("test4.txt");
	File Test5 = new File("test5.txt");
	File Test6 = new File("test6.txt");
	File Test7 = new File("test7.txt");
	File Test8 = new File("test8.txt");*/
	
	static File BMIdata = new File("BMI.txt");
	
	public static void main (String[] args ) {
	filechecker(); // checks for file
	try {
		z(BMIdata);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} //ends up being the whole code
	System.out.println("BMI completed!");
  
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

public static void reader(File file) { // reads file
	try {
		Scanner reader = new Scanner(file);
		name = reader.next();
		reader.close();
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
public static void writer(File file) { // writes file
	try {
		PrintWriter writer = new PrintWriter(file);
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
public static void filechecker() { // Checks for BMI file
	if (!BMIdata.exists() || !(BMIdata.length() > 0)) {
		filecreator(BMIdata);
		System.out.println("BMI data file Created.");
	}  else if ((BMIdata.exists() || (BMIdata.length() > 0)))
		System.out.println("BMI data Found!");
}
public static void z(File file) throws IOException {
	boolean scan = true;

	
	
	
		// this is for scanning all files in the folder I put test files in. It will scan for .txt files in the folder
		File[] fileArray = new File("Test").listFiles();    // looks for the correct folder     
		
	    for(File Tests: fileArray) { // a loop for looking into files in the array.

	       if(Tests.getName().endsWith(".txt")) // only get files that are text files
	        {                 
	         try {
	        	ArrayList<String[]> Namer = new ArrayList<String[]>();
				Scanner Testfinder = new Scanner(Tests); // find the the files
				while(Testfinder.hasNext()) {
					String token = Testfinder.nextLine();
					if (token.contains("Name: ") ) { // gets the text after Name: for later saving into BMI.txt
						name = token.substring(6);
						
						
					
						
						//System.out.println(name); //debugging
					} else if (token.contains("Feet: ")) {
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
					System.out.println(name + ": " + Deci.format(BMI) );
						
					// fw,bw,pw are for writing each file's data separately
					FileWriter fw = new FileWriter(file, true);
					BufferedWriter BuffWriter = new BufferedWriter(fw);
						PrintWriter Writer = new PrintWriter(BuffWriter); 
						if (BMIdata.length() < 250)
						Writer.write(name + ": " + Deci.format(BMI)); // saves name and BMI to BMI.txt
						Writer.close();
						BuffWriter.close();
						fw.close();
					
					
						
					
						
						
					}
					
				}
				
				//name = Testfinder.nextLine();
				//feet = Testfinder.nextLine();
				/*inch = Testfinder.nextLine();
				weightLBS = Testfinder.nextLine();
				
				System.out.println(feet);
				System.out.println(inch);
				System.out.println(weightLBS);*/
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}  
	        } 
	        }    
	   
	}
}
 