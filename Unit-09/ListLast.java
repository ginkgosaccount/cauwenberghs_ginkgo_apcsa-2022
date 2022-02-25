//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Ginkgo Cauwenberghs
//Date - 2/24/22

import java.util.ArrayList;
import java.util.List;

public class ListLast
{
	public static boolean go(List<Integer> ray)
	{
		if (ray.size() == 0)
			return false;

		for (int i=0;i<ray.size()-1;i++)
		{
			if (ray.get(i) == ray.get(ray.size()-1))
				return true;
		}
		return false;
	}
}