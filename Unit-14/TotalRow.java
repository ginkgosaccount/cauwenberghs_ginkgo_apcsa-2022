//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.*;

public class TotalRow
{
    public static List<Integer> getRowTotals( int[][] m )
    {
    	List<Integer> thing = new List<Integer>;
	
	for (int i=0;i<m.length();i++)
	{
		int x=0;
		for (int y=0;y<m[i].length();y++)
		{
			x+= m[i][y];
		}
		thing.add(x);
	}
	
	return thing;
    }
}
