package readinfile;


import java.util.*;
import java.io.*;
public class  Readingfile {
	static String name;
	static int highScore, favoritenumber;
	static Scanner in = null;
		public static void main (String[] args ) {
			String file = null;
			System.out.println("hey");
			name = in.next();
			highScore = in.nextInt();
			favoritenumber = in.nextInt();
			in.close();
			//declare
			file = "text.txt";
			// run read file
			readingfile(file);
			// finish i want to print to the screen
			System.out.println();
			
			//declare
			file = "text.txt";
			
			//File newfile = new File(file);
			try {
				Scanner in = new Scanner(new File(file));
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				System.out.println("ERROR 798");
			}
			
			
		}
		public static void readingfile(String filename) {
			System.out.println();
		}
		public static void printinformation() {
			System.out.println("name of file is " + name);
			System.out.println("highscore " + highScore);
			System.out.println(name + "favorite number is" + favoritenumber);
		}
 }
