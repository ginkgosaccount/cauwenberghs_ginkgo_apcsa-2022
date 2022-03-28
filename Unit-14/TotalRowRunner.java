//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

public class TotalRowRunner
{
	public static void main( String args[] ) throws Exception
	{
		TotalRow x = new TotalRow();
		
		int[][] one = { {1,2,3},{5,5,5,5} };
		int[][] two = { {1,2,3},{5},{1},{2,2} };
		int[][] three = { {1,2},{5,5},{5,5},{4,5,6,7},{123124,12312} };
		
		System.out.println("Row totals are :: " + x.getRowTotals(one));
		System.out.println("Row totals are :: " + x.getRowTotals(two));
		System.out.println("Row totals are :: " + x.getRowTotals(three));
	}
}



