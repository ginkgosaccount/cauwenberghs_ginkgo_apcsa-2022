//(c) A+ Computer Science
//www.apluscompsci.com

//Name - Ginkgo Cauwenberghs
//Date - 1/27/22
//Class - AP CSA
//Lab  - Unit 5

import static java.lang.System.*;

public class StringEquality
{
	private String wordOne, wordTwo;
	private boolean thing;

	public void setWords(String one, String two)
	{
		wordOne = one;
		wordTwo = two;
		if (one.equals(two))
			thing = true;
		else
			thing = false;
	}

	public boolean checkEquality( )
	{
		return false;
	}

	public String toString()
	{
		if (thing)
			return wordOne + " has the same letters as " + wordTwo + "\n";

		return wordOne + " does not have the same letters as " + wordTwo + "\n";
	}
}