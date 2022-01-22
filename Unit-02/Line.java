//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Ginkgo Cauwenberghs
//Date - 1/21/22

public class Line
{
	public static double getSlope( int x1, int y1, int x2, int y2 )
	{
		double diffY = y2 - y1;
		double diffX = x2 - x1;
		return diffY/diffX;
	}
}
