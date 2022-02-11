//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Ginkgo Cauwenberghs
//Date - 2/10/22

public class SumLastRunner
{
	public static void main( String args[] )
	{
		RaySumLast array = new RaySumLast();
		int[] thing = {-99,1,2,3,4,5,6,7,8,9,10,5};
		System.out.print(array.go(thing));

		int[] thing2 = {10,9,8,7,6,5,4,3,2,1,-99};
		System.out.print(array.go(thing2));
	}
}