import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class FilePrinter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PrintWriter fileout = null;
		try {
			fileout = new PrintWriter("reciept.txt");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Disk is read-only mode, cannot create file.");
		}
		
		fileout.println("text"); 
		fileout.close();
		
	}

}
