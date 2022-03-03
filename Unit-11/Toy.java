//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class Toy
{
	private String name;
	private int count;

	public Toy()
	{
		setCount(0);
		setName("");
	}

	public Toy( String nm )
	{
		setCount(1);
		setName(nm);
	}
	
	public int getCount()
	{
		return 0;
	}
	
	public void setCount( int cnt )
	{
		count = cnt;
	}
	
	public String getName()
	{
		return null;
	}
	
	public void setName( String nm )
	{
		name = nm;
	}

	public String toString()
	{
	   return "" + name + " " + count;
	}
}