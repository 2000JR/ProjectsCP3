package readinfile;
import java.util.*;
import java.io.*;

public class CoinFlipSave {
	
	static String Bestname;
	static int BestScore;
	static File file = new File("SaveData.txt");
	static int points = 0;
	static String name;
	
	
	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		boolean playing;
		int input;
		String answer;
		Scanner in = new Scanner(System.in); 
		
		if (file.exists()&&file.length() > 0) {
			System.out.println("Found a save");
			System.out.flush();
			Bestname = Bestname;
			BestScore = BestScore;
		} else {
			fileCreator();
			System.out.println("Created a save");
		}
		
		
		
		
		System.out.println("Lets play coin flip! What do you want to do?");
		System.out.println("1) Play the game" + "\n2) Scoreboard");
		input = in.nextInt();
		playing = true;
		while(playing) {
if (input == 1) {
	//System.out.println("Whats your name");
	//name = in.nextLine();
			
			System.out.println("Flip the coin, heads is a point tails is no point.");
			
			
			float num = (float) Math.random();
			
			//System.out.println(num);
			if (num > .5) {
				System.out.println("You got heads, you got a point");
				points = ++points;
			} 
						System.out.println("You have " + points + " points!"); 
						Scanner savereader = new Scanner(file);
						try {
							savereader = new Scanner(file);
							Bestname = savereader.nextLine();
							BestScore = savereader.nextInt();
						
							savereader.close();
						} catch (FileNotFoundException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						System.out.println("Want to test your luck again?");
						answer = in.next();
						if (answer.equals("no")) {
							
							if (points > BestScore) {
								
								System.out.println("you got the highest score! Type your name.");
								name = in.next();
								Bestname = name;
								BestScore = points;
								Saver();
							} else {
								System.out.println("You didnt beat the highest score. Try again next time.");
							}
							break;
						}
						if (num < .5 ) {
							System.out.println("Tails, no points for you!");
							System.out.println("You have " + points + " points!"); 
							System.out.println("Want to test your luck again?");
							answer = in.next();
						}
						if (answer.equals("no")) {
							
							if (points > BestScore) {
								
								System.out.println("you got the highest score! Type your name.");
								name = in.next();
								Bestname = name;
								BestScore = points;
								Saver();
							} else {
								System.out.println("You didnt beat the highest score. Try again next time.");
							}
							break;
						}
						

						
	}
		
		
if (input == 2) {
	//System.err.println(file.getAbsolutePath()); check where the file is located
	legend(file);
	savereader(file);
	break;
	}	
		}					
}
	
	public static void savereader(File file) {

		// try catch for reading the save Scanner
		try {
			Scanner savereader = new Scanner(file);
			Bestname = savereader.nextLine();
			BestScore = savereader.nextInt();
			//System.out.println( Bestname ); Debug
			savereader.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void fileCreator() {
		// try catch for FileWriter
				try {
					FileWriter Reader = new FileWriter(file);
					
					Reader.write("NONE" + "\n" + 0);
					
					Reader.flush();
					Reader.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
					
				}
	}
	
	
	public static void Saver() {
		// try catch for PrintWriter
		try {
			Scanner savereader = new Scanner(file);
			Bestname = name;
			BestScore = points;
			Bestname = savereader.next();
			BestScore = savereader.nextInt(); 
			
			//System.out.println( Bestname ); Debug
			savereader.close();		
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			PrintWriter Saver = new PrintWriter(file);
			Bestname = name;
			BestScore = points;
			Saver.write(Bestname);
			Saver.write("\n" + points);
			Saver.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Save completed!");
	}
	
public static void legend(File file) {
	// Leaderboard version of savereader
	try {
		Scanner savereader = new Scanner(file);
		Bestname = savereader.nextLine();
		BestScore = savereader.nextInt();
		System.out.println("The highest score is " + BestScore);
		System.out.println("And was achieved by " + Bestname);
		savereader.close();
		
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}	
	}
}
