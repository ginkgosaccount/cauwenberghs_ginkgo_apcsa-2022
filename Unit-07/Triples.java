//(c) A+ Computer Science
// www.apluscompsci.com
//Name -  

import static java.lang.System.*;

public class Triples
{
   private int number;

	public Triples()
	{
		setNum(0);
	}

	public Triples(int num)
	{
		setNum(num);
	}

	public void setNum(int num)
	{
		number = num;
	}
	
	private int greatestCommonFactor(int a, int b, int c)
	{
		int max = 1;

		for (int i=1;i<number;i++)
		{
			if ((a%i == 0) && (b%i == 0) && (c%i == 0))
				max = i;
		}

		return max;
	}

	public String toString()
	{
		String output="";
		
		for (int one=1;one<number;one++)
			for (int two=1;two<number;two++)
				for (int three=1;three<number;three++)
				{
					if ((greatestCommonFactor(one,two,three)==1) && ((one+two)%2 == 1) && (one*one + two*two == three*three))
					    	output += one + " " + two + " " + three + "\n";
				}

		return output;
	}
}
