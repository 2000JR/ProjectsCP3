package readinfile;


import java.util.*;
import java.io.*;
public class  Readingfile {
	static String name;
	static int highScore, favoritenumber;
	
	static Scanner readfile;
		public static void main(String[] args ) {
			String file;
			System.out.println("hey");
			//declare
			file = "C:\\Users\\22074\\eclipse-workspace\\Readafile\\src\\readinfile\\text.txt";
			// run read file
			readingfile(file);
			
			
		
			
			// finish i want to print to the screen
			printinformation();
			
		
			
			//File newfile = new File(file);
			
			
		}
		public static void readingfile(String filename) {
			try {
				readfile = new Scanner(new File(filename));
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				
			}
			name = readfile.next();
			highScore = readfile.nextInt();
			favoritenumber = readfile.nextInt();
			readfile.close();
			System.out.println();
		}
		public static void printinformation() {
			System.out.println("name of file is " + name);
			System.out.println("highscore " + highScore);
			System.out.println(name + " favorite number is " + favoritenumber);
		}
 }
