//(c) A+ Computer Science 
//www.apluscompsci.com

//Name - Ginkgo Cauwenberghs
//Date - 1/21/22
//Class - AP CSA
//Lab  - Unit 03

import java.util.Scanner; 
import static java.lang.System.*;
import static java.lang.Math.*;

public class Distance
{
	private double xOne,yOne,xTwo,yTwo;
	private double distance;

	public Distance()
	{
		xOne=0; yOne=0; xTwo=0; yTwo=0;
	}

	public Distance(int x1, int y1, int x2, int y2)
	{
		xOne=x1; yOne=y1; xTwo=x2; yTwo=y2;
	}

	public void calcDistance()
	{
		double x = (xTwo-xOne) * (xTwo-xOne);
		double y = (yTwo-yOne) * (yTwo-yOne);
		double total = x + y;
		distance = Math.sqrt(total);
	}
	
	public void print()
	{
		System.out.printf("distance == %.3f\n", distance);
	}
}