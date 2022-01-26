//(c) A+ Computer Science
//www.apluscompsci.com

//Name - Ginkgo Cauwenberghs
//Date - 1/25/22
//Class - AP CSA
//Lab  - Unit 4

import static java.lang.System.*;
import java.util.Scanner;

public class DiscountRunner
{
	public static void main( String args[] )
	{
		Scanner keyboard = new Scanner(System.in);
		Discount Discount = new Discount();
		
		out.print("Enter the original bill amount :: ");
		double amt = keyboard.nextDouble();
		System.out.printf("Bill after discount :: %.2f\n", Discount.getDiscountedBill(amt));
		

	}
}