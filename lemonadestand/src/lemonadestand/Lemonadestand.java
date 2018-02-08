package lemonadestand;

import java.text.DecimalFormat;
import java.util.*;

public class Lemonadestand {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.##");
		float a,b,c,d,e,f,g,h;

		System.out.println("What is the cost of lemons?");
		a = input.nextFloat();
		System.out.println("How much lemons are you making?");
		b = input.nextFloat();
		System.out.println("What is the cost of cups?");
		c = input.nextFloat();
		System.out.println("How many cups are you making?");
		d = input.nextFloat();
		System.out.println("What is the cost of sugar?");
		e = input.nextFloat();
		System.out.println("How much sugar are you making?");
		f = input.nextFloat();
		System.out.println("What is the price of lemmonade?");
		g = input.nextFloat();
		System.out.println("How many did you sell?");
		h = input.nextFloat();
		
		float lemonCost = a;
		float lemonAmount = b;
		float cupCost = c;
		float cupAmount = d;
		float sugarCost = e;
		float sugarAmount = f;
		float amountMade = g;
		float amountSold = h;
		float total = (lemonCost * lemonAmount) + (cupCost * cupAmount) + (sugarCost * sugarAmount);
		float sales = (amountMade * amountSold);
		float profit = sales - total ;
	
		if (profit < 0) {
			profit = Math.abs(profit);
		}
		System.out.println("Your total sales is $" + total + "0");
		System.out.println("Your profit is $" + profit + "0");
	
	}

}


