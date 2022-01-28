//(c) A+ Computer Science
//www.apluscompsci.com

//Name - Ginkgo Cauwenberghs
//Date - 1/22/27
//Class - AP CSA
//Lab  - Unit 5

import static java.lang.System.*;
import java.util.Scanner;

public class StringRunner
{
	public static void main ( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);

		System.out.print("Enter a word :: ");
		String str = keyboard.next();

		StringOddOrEven thing = new StringOddOrEven(str);

		System.out.printf("%s is %s\n", str, thing.isEven());
	}
}