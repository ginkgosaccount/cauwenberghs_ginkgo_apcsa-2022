//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Ginkgo Cauwenberghs
//Date - 2/10/22

public class RaySumLast
{
	public static int go(int[] ray)
	{
		if (ray.length == 0)
			return -1;
		
		int count = 0;

		for (int i=0;i<ray.length;i++)
		{
			if (ray[i] > ray[ray.length-1])
				count += ray[i];
		}

		if (count == 0)
			return -1;
		
		return count;
	}
}