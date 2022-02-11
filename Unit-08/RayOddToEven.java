//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Ginkgo Cauwenberghs
//Date - 2/10/22

public class RayOddToEven
{
	public static int go(int[] ray)
	{
		int first = -1;
		int last = -1;

		for (int i=0;i<ray.length;i++)
		{
			if (ray[i]%2 == 1)
			{
				first = i;
				break;
			}
		}
		if (first == -1)
			return -1;

		for (int j=first+1;j<ray.length;j++)
		{
			if (ray[j]%2 == 0)
			{
				last = j;
				break;
			}
		}
		if (last == -1)
			return -1;

		return last-first;
	}
}