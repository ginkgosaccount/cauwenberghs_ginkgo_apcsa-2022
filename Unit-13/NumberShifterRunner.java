//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Arrays;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import static java.lang.System.*;

public class NumberShifterRunner
{
	public static void main( String args[] ) throws IOException
	{
		//add test cases
		NumberShifter thing = new NumberShifter();

		int[] one = thing.makeLucky7Array(10);
		System.out.println(Arrays.toString(one));
		thing.shiftEm(one);
		System.out.println(Arrays.toString(one));
		System.out.println("");

		int[] two = thing.makeLucky7Array(10);
		System.out.println(Arrays.toString(two));
		thing.shiftEm(two);
		System.out.println(Arrays.toString(two));
		System.out.println("");

		int[] three = thing.makeLucky7Array(10);
		System.out.println(Arrays.toString(three));
		thing.shiftEm(three);
		System.out.println(Arrays.toString(three));
	}
}



