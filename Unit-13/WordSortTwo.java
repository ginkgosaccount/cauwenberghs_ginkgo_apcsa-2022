//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Arrays;
import java.util.Scanner;
import static java.lang.System.*;

public class WordSortTwo
{
	private String[] wordRay;

	public WordSortTwo(String sentence)
	{
		int count = 1;
		for (int i=0;i<sentence.length();i++)
		{
			if (sentence.charAt(i).equals(" "))
				count++;
		}
		
		wordRay = new String[count];
		
		String word = "";
		int x = 0;
		
		for (int i=0;i<sentence.length();i++)
		{
			if (sentence.charAt(i).equals(' '))
			{
				wordRay[x] = word;
				word = "";
				x++;
			}
			else
			{
				word += sentence.charAt(i);
			}
		}
	}

	public void sort()
	{
		for (int i=1; i< wordRay.length; ++i)
   		{
      			String val = wordRay[i];
      			String j=i;
      			while(j>0&&val<wordRay[j-1])
			{         
         			wordRay[j]=wordRay[j-1];
         			j--;
      			}
      			wordRay[j]=val;
   		}

	}

	public String toString()
	{
		String output="";
		for (int i=0;i<wordRay.length;i++)
		{
			output += wordRay[i];
			output += "\n";
		}
		
		return output+"\n\n";
	}
}
