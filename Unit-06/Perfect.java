//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Ginkgo Cauwenberghs

import static java.lang.System.*;

public class Perfect
{
   	private int number;

	public Perfect()
	{
		number = 0;
	}
	
	public Perfect(int num)
	{
		number = num;
	}

	public void setNumber(int num)
	{
		number = num;
	}

	public boolean isPerfect()
	{
		int sum = 0;
		for (int i=1;i<number;i++)
		{
			if (number%i == 0)
				sum += i;
		}
		if (sum == number)
			return true;
		return false;
	}

	public string toString()
	{
		if (isPerfect)
			return "" + number + "is perfect.";
		return "" + number + "is not perfect.";
	}
}
