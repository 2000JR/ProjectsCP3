
public class Smallestmultiple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 1; i <= 20; i++) {
		int n = Math.max(0, 25200);
			if( n % i == 0) {
				
				System.out.println(i);
			}
		}
	}

}
/*2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.

What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?*/