//(c) A+ Computer Science
//www.apluscompsci.com

//Name - Ginkgo Cauwenberghs
//Date - 1/25/22
//Class - AP CSA
//Lab  - Unit 04

import static java.lang.System.*;
import java.util.Scanner;

public class NumberVerifyRunner
{
	public static void main ( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);
		NumberVerify NumberVerify = new NumberVerify();

		System.out.print("Enter a Whole Number :: ");
		int x = keyboard.nextInt();

		System.out.printf("%d is odd :: %s\n", x, NumberVerify.isOdd(x));
		System.out.printf("%d is odd :: %s\n", x, NumberVerify.isEven(x));
	}
}