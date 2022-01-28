//(c) A+ Computer Science
//www.apluscompsci.com

//Name - Ginkgo Cauwenberghs
//Date - 1/27/22
//Class - AP CSA
//Lab  - Unit 5

import static java.lang.System.*;

public class StringEqualityRunner
{
	public static void main( String args[] )
	{
		StringEquality thing = new StringEquality();

		thing.setWords("hello","goodbye");
		System.out.println(thing);

		thing.setWords("one","two");
		System.out.println(thing);

		thing.setWords("three","four");
		System.out.println(thing);

		thing.setWords("TCEA","UIL");
		System.out.println(thing);

		thing.setWords("State","Champions");
		System.out.println(thing);

		thing.setWords("ABC","ABC");
		System.out.println(thing);

		thing.setWords("ABC","CBA");
		System.out.println(thing);

		thing.setWords("Same","Same");
		System.out.println(thing);
	}
}