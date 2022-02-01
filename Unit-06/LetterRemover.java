//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Ginkgo Cauwenberghs

import static java.lang.System.*;

public class LetterRemover
{
   private String sentence;
   private char lookFor;

	public LetterRemover()
	{
		sentence = "";
		lookFor = "";
	}

	public LetterRemover(String s, char rem)
	{
		sentence = s;
		lookFor = rem;
	}
	
	public void setRemover(String s, char rem)
	{
		sentence = s;
		lookFor = rem;
	}

	public String removeLetters()
	{
		String cleaned;
		
		for (int i=0;i<sentence.length();i++)
		{
			if (sentence.charAt(i) != lookFor)
				cleaned += sentence.charAt(i);
		}	
		return cleaned;
	}

	public void print()
	{
		System.out.println(sentence + " - letter to remove " + lookFor);
		System.out.println(removeLetters());
	}
}
