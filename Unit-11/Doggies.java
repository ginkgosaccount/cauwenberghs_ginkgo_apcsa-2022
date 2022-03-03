//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Arrays;

public class Doggies
{
	private Dog[] pups;

	public Doggies(int size)
	{
		pups = new Dog[size];
	}
	
	public void set(int spot, int age, String name)
	{
		pups[spot] = new Dog(age,name);	
	}

	public String getNameOfOldest()
	{
		int max = 0;
		String thing = "";
		for (int i=0;i<pups.length;i++)
		{
			if (pups[i].getAge() > max)
			{
				max = pups[i].getAge();
				thing = pups[i].getName();
			}
		}
		return thing;
	}

	public String getNameOfYoungest()
	{
		int max = 100000;
		String thing = "";
		for (int i=0;i<pups.length;i++)
		{
			if (pups[i].getAge() < max)
			{
				max = pups[i].getAge();
				thing = pups[i].getName();
			}
		}
		return thing;
	}

	public String toString()
	{
		return ""+Arrays.toString(pups);
	}
}