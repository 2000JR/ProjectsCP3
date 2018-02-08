package mathproject;

import java.util.Scanner;

public class tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b,c;
		Scanner in = new Scanner(System.in); 
		
		System.out.println("Type a number");
		a = in.nextInt();
		System.out.println("Type a number");
		b = in.nextInt();
		System.out.println("Sum is " + addtwonums(a,b));
	}


	public static int addtwonums(int first, int sec) {
		return first + sec;
	}
}
