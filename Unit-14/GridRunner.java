//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import static java.lang.System.*;

public class GridRunner
{
	public static void main( String args[] ) throws IOException
	{
		String[] thing = {"a","b","c","7","9","x","2"};
		
		Grid x = new Grid(20,20,thing);
		
		System.out.print(x);
		System.out.println("");
		System.out.println(x.findMax + "occurs the most.")
	}
}
