package probabilitiescalculator;
import java.util.*;
public class ProbabilitiesCalculator {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		float firstEvent; 
		float secondEvent;
		float Union; // mutual exclusive
		float intersect; // not mutual exclusive
		float entry;
		String secondEntry;
		float E1totalOutcomes;
		float E2totalOutcomes;
		
		System.out.println("How many events are planning? (1 or 2).");
		entry = input.nextInt();
		if (entry == 1) {
			System.out.println("What is the desired outcomes");
			firstEvent = input.nextFloat();
			System.out.println("What is it out of");
			E1totalOutcomes = input.nextFloat();
			System.out.println("The expectancy of that is " + firstEvent / E1totalOutcomes);
		}
		if (entry == 2) {
			System.out.println("What is the desired outcomes of the first event?");
			firstEvent = input.nextFloat();
			System.out.println("What is it out of");
			E1totalOutcomes = input.nextFloat();
			System.out.println("What is the desired outcomes of the second event?");
			secondEvent = input.nextFloat();
			System.out.println("What is it out of");
			E2totalOutcomes = input.nextInt();
			System.out.println("Mutally exclusive? Yes or No.");
			secondEntry = input.next();
			
			if (secondEntry.contains("yes")) {
				//Union = (firstEvent / E1totalOutcomes) + (secondEvent / E2totalOutcomes) - ((firstEvent / E1totalOutcomes) * (secondEvent / E2totalOutcomes));
				Union = (firstEvent / E1totalOutcomes) + (secondEvent / E2totalOutcomes);
				System.out.println("here it is " + Union);
			}
			if (secondEntry.contains("no")) {
				intersect = (firstEvent / E1totalOutcomes) * (secondEvent / E2totalOutcomes);
				System.out.println("here it is " + intersect);
			}
		}
	}
}
