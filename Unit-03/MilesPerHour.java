//(c) A+ Computer Science
//www.apluscompsci.com

//Name - Ginkgo Cauwenberghs
//Date - 1/21/22
//Class - AP CSA
//Lab  - Unit 03

import java.util.Scanner; 
import static java.lang.System.*;
import static java.lang.Math.*;

public class MilesPerHour
{
	private double distance, hours, minutes;
	private double mph;

	public MilesPerHour()
	{
		setNums(0,0,0);
		mph=0.0;
	}

	public MilesPerHour(int dist, int hrs, int mins)
	{
		distance = dist;
		hours = hrs;
		minutes = mins;
	}

	public void setNums(int dist, int hrs, int mins)
	{
		distance = dist;
		hours = hrs;
		minutes = mins;
	}

	public void calcMPH()
	{
		double total = hours + (minutes/60);
		mph = (distance/total);
	}

	public void print()
	{
		System.out.printf("%.0f miles in %.0f hour and %.0f minutes = %.0f MPH.\n",distance,hours,minutes,mph);
	}
	
}