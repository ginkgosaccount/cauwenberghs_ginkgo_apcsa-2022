//(c) A+ Computer Science
//www.apluscompsci.com

//Name - Ginkgo Cauwenberghs
//Date - 1/27/22
//Class - AP CSA
//Lab  - Unit 5

import static java.lang.System.*;
import java.util.Scanner;

public class StringOddOrEven
{
	private String word;

	public StringOddOrEven()
	{
		word = "";
	}

	public StringOddOrEven(String s)
	{
		word = s;
	}

 	public String isEven()
 	{
		if (word.length()%2 == 0)
			return "even";
		else
			return "odd";
	}
}