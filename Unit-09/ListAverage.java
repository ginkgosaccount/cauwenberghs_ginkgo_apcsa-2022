//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Ginkgo Cauwenberghs
//Date - 2/24/22

import  java.util.Collections;
import java.util.List;
import java.util.ArrayList;

public class ListAverage
{
	public static double go( List<Integer> ray)
	{
		Collections.sort(ray);
		return (double)(ray.get(0) + ray.get(ray.size()-1))/2;
	}
}