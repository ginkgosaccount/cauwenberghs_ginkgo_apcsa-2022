//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Ginkgo Cauwenberghs
//Date - 1/27/22


public class FirstLastVowel
{
   public static String go( String a )
	{
		String vowels = "AEIOUaeiou";

		for (int i=0;i<10;i++)
		{
			if (a.charAt(0) == vowels.charAt(i))
				return "yes";
			if (a.charAt(a.length()-1) == vowels.charAt(i))
				return "yes";
		}
		return "no";
	}
}