//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Ginkgo Cauwenberghs
//Date - 2/24/22

import java.util.List;
import java.util.ArrayList;

public class ListGetNums
{
	//method go will return an array
	//containing the first 3 numbers
	//greater than 11
	public static List<Integer> go( List<Integer> ray )
	{
		ArrayList<Integer> thing = new ArrayList<Integer>();

		for (int i=0;i<ray.size();i++)
		{
			if (ray.get(i) > 11)
				thing.add(ray.get(i));

			if (thing.size() == 3)
				break;
		}
		return thing;
	}
}