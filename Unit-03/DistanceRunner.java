//(c) A+ Computer Science
//www.apluscompsci.com

//Name - Ginkgo Cauwenberghs
//Date - 1/21/22
//Class - AP CSA
//Lab  - Unit 03

import java.util.Scanner; 
import static java.lang.System.*;
import static java.lang.Math.*;

public class DistanceRunner
{
	public static void main( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);

		System.out.print("Enter X1 :: ");
		int x1 = keyboard.nextInt();
		System.out.print("Enter Y1 :: ");
		int y1 = keyboard.nextInt();
		System.out.print("Enter X2 :: ");
		int x2 = keyboard.nextInt();
		System.out.print("Enter Y2 :: ");
		int y2 = keyboard.nextInt();

		Distance distance = new Distance(x1,y1,x2,y2);
		distance.calcDistance();
		distance.print();
	}
}