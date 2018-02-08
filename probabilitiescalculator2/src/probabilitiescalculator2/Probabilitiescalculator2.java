package probabilitiescalculator2;
import java.text.DecimalFormat;
import java.util.*;
public class Probabilitiescalculator2 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String input;
		DecimalFormat df = new DecimalFormat("#.###%");
		long num;
		long total;
		long totalTwo;
		long choice;
		long choiceTwo;
		long sub;
		long subTwo;
		long subthree;
		long thirdfact = 1;
		long factorial = 1;
		long secondfactorial = 1;
		long factorialThree = 1;
		long thirdfactTwo = 1;
		long thirdfactThree = 1;
		long factorialTwo = 1;
		long secondfactorialTwo = 1;
		long thirdfactorialtwo = 1;
		long cone;
		long ctwo;
		float probability;
		System.out.println("What do you want to find out \n"
				+ "(1 factorial \n" + "(2 combinations \n" + "(3 permutations \n");
		input = in.nextLine();
		if (input.equals("1")) {
			System.out.println("Input what you want a factorial of");
			num = in.nextInt();
			
			
		for(long i = 1; i <= num; i++) {
			factorial = Math.abs(factorial * i);
		}
		System.out.println(factorial);
		}
		if (input.equals("2")) {
			
			
		System.out.println("what do you want to do? \n" + 
		"(1 Find out probability \n" + "(2 Probability two outcomes of same thing" );
		input = in.nextLine();
		if (input.equals("1")) {
			System.out.println("How many numbers");
			total = in.nextLong();
			System.out.println("whats the choice");
			choice = in.nextLong();
			
			
			sub = (total - choice);
			
			for(long i = 1; i <= total; i++) {
				factorial = factorial * i;
			}
			for(long i = 1; i <= choice; i++) {
				secondfactorial = secondfactorial * i;
			}
			for(long i = 1; i <= sub; i++) {
				thirdfact =thirdfact * i;
			}
			
			System.out.println("How many numbers");
			totalTwo = in.nextLong();
			System.out.println("whats the choice");
			choiceTwo = in.nextLong();
			
			
			subTwo = (totalTwo - choiceTwo);
			
			for(long i = 1; i <= totalTwo; i++) {
				factorialTwo = factorialTwo * i;
			}
			for(long i = 1; i <= choiceTwo; i++) {
				secondfactorialTwo = secondfactorialTwo * i;
			}
			for(long i = 1; i <= subTwo; i++) {
				thirdfactTwo = thirdfactTwo * i;
			}
			cone = factorial / (secondfactorial * (thirdfact));
			ctwo = factorialTwo / (secondfactorialTwo * (thirdfactTwo));
			probability = (float) cone / ctwo;
			System.out.println(df.format(probability));
		
		}
		if (input.equals("2")) {
			System.out.println("How many numbers");
			total = in.nextLong();
			System.out.println("whats the choice");
			choice = in.nextLong();
			
			
			sub = (total - choice);
			
			for(long i = 1; i <= total; i++) {
				factorial = factorial * i;
			}
			for(long i = 1; i <= choice; i++) {
				secondfactorial = secondfactorial * i;
			}
			for(long i = 1; i <= sub; i++) {
				thirdfact =thirdfact * i;
			}
			
			System.out.println("How many numbers");
			totalTwo = in.nextLong();
			System.out.println("whats the choice");
			choiceTwo = in.nextLong();
			
			
			subTwo = (totalTwo - choiceTwo);
			
			for(long i = 1; i <= totalTwo; i++) {
				factorialTwo = factorialTwo * i;
			}
			for(long i = 1; i <= choiceTwo; i++) {
				secondfactorialTwo = secondfactorialTwo * i;
			}
			for(long i = 1; i <= subTwo; i++) {
				thirdfactTwo = thirdfactTwo * i;
			}
			
		long c3;
		long totalThree = total + totalTwo;
		long choiceThree = choice + choiceTwo;
		 subthree = (totalThree - choiceThree);
		 
		for(long i = 1; i <= totalThree; i++) {
			factorialThree = factorialThree * i;
		}
		for(long i = 1; i <= choiceThree; i++) {
			thirdfactorialtwo = thirdfactorialtwo * i;
		}
		for(long i = 1; i <= subthree; i++) {
			thirdfactThree = thirdfactThree * i;
		}

			c3 =  factorialThree / (thirdfactorialtwo * (thirdfactThree));
			cone = factorial / (secondfactorial * (thirdfact));
			ctwo = factorialTwo / (secondfactorialTwo * (thirdfactTwo));
			//probability = ((float) cone * ctwo) / ((float) c3);
			
			probability = ((float) cone / ctwo);
			System.out.println(df.format(probability));
			
		}
		}
		if (input.equals("3")) {
			System.out.println("How many numbers");
			total = in.nextLong();
			System.out.println("whats the choice");
			choice = in.nextLong();
			
			
			sub = (total - choice);
			
			for(long i = 1; i <= total; i++) {
				factorial = factorial * i;
			}
			for(long i = 1; i <= choice; i++) {
				secondfactorial = secondfactorial * i;
			}
			for(long i = 1; i <= sub; i++) {
				thirdfact =thirdfact * i;
			}
			System.out.println(factorial / (thirdfact)); 
			
			}
		
	} 
}

	







/*

package probabilitiescalculator2;
import java.util.*;
public class Probabilitiescalculator2 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		long num;
		long factorial = 1;
		System.out.println("Input what you want a factorial of");
		num = in.nextInt();
		
	for(long i = 1; i <= num; i++) {
		factorial = factorial * i;
	}
	System.out.println(factorial);
	} 
	} 
*/