//(c) A+ Computer Science
//www.apluscompsci.com

//Name - Ginkgo Cauwenberghs
//Date - 1/21/22
//Class - AP CSA
//Lab  - Unit 03

import java.util.Scanner; 
import static java.lang.System.*;
import static java.lang.Math.*;

public class MPHRunner
{
	public static void main( String[] args )
	{
		Scanner keyboard = new Scanner(in);

		out.print("Enter the distance :: ");
		int dist = keyboard.nextInt();

		out.print("Enter the hours :: ");
		int hrs = keyboard.nextInt();

		out.print("Enter the minutes :: ");
		int mins = keyboard.nextInt();
		out.println("");

		MilesPerHour test = new MilesPerHour(dist, hrs, mins);
		test.calcMPH();
		test.print();

		//add more test cases

		MilesPerHour test1 = new MilesPerHour(45, 0, 32);
		test1.calcMPH();
		test1.print();
		
		MilesPerHour test2 = new MilesPerHour(96, 1, 43);
		test2.calcMPH();
		test2.print();

		MilesPerHour test3 = new MilesPerHour(100, 2, 25);
		test3.calcMPH();
		test3.print();

		MilesPerHour test4 = new MilesPerHour(50, 2, 25);
		test4.calcMPH();
		test4.print();
	}
}