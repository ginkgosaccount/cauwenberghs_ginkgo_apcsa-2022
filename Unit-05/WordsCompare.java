//(c) A+ Computer Science
//www.apluscompsci.com

//Name - Ginkgo Cauwenberghs
//Date - 1/27/22
//Class - AP CSA
//Lab  - Unit 5

import static java.lang.System.*;

public class WordsCompare
{
	private String wordOne, wordTwo;
    private int compare;

	public void setWords(String one, String two)
	{
		wordOne = one;
		wordTwo = two;
		compare = wordOne.compareTo(wordTwo);
	}

	public String toString()
	{
		if(compare<0)
		{
			return wordOne + " should be placed before " + wordTwo + "\n";
		}
		else
		{
			return wordOne + " should be placed after " + wordTwo + "\n";
		}
	}
}