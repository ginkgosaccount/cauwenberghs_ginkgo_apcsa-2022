//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

public class Grid
{
   private String[][] grid;

   //load vals into the rows x cols grid randomly
	public Grid(int rows, int cols, String[] vals)
	{
		grid = new String[rows][cols];
		int[] things = new int[rows*cols];
		int count = 0;
		
		for (int i=0;i<things.length;i++)
		}
			things[i] = Math.random() * vals.length;
		}

		for (int i=0;i<grid.length;i++)
		{
			for (int j=0;j<grid[i].length;j++)
			{
				grid[i][j] = vals[things[count]];
				count++;
			}
		}
	}

	//find out which of the vals occurs the most
	public String findMax(String[] vals)
	{
		int max = 0;
		String thing = "";
		
		for (int i=0;i<vals.length;i++)
		{
			if (countVals(vals[i])>max)
			{
				max = countVals(vals[i]);
				thing = vals[i];
			}
		}
		return thing;
	}

	//returns a count of how many times val occurs in the matrix
	private int countVals( String val )
	{
		int count = 0;
		
		for (int i=0;i<grid.length;i++)
		{
			for (int j=0;j<grid[i].length;j++)
			{
				if (grid[i][j].equals(val))
					count++;
			}
		}
		return count;
	}

	//display the grid
	public String toString()
	{
		String output="";
		for (int i=0;i<grid.length;i++)
		{
			for (int j=0;j<grid[i].length;j++)
			{
				string += grid[i][j];
				string += " ";
			}
			string += "\n";
		}
		return output;
		
	}
}
