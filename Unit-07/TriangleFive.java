//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Ginkgo Cauwenberghs

import static java.lang.System.*;

public class TriangleFive
{
   	private char letter;
   	private int amount;

	public TriangleFive()
	{
		setLetter(' ');
		setAmount(0);
	}

	public TriangleFive(char c, int amt)
	{
		setLetter(c);
		setAmount(amt);
	}

	public void setLetter(char c)
	{
		letter = c;
	}

	public void setAmount(int amt)
	{
		amount = amt;
	}

	public void print()
	{
		for (int y=0;y<amount;y++)
		{
			char thing = letter;
			for (int i=amount;i>y;i--)
			{
				for (int x=0;x<i;x++)
					out.print(thing);
				out.print(" ");
				if (thing == 'Z')
					thing = 'A';
				else
					thing++;
			}
			out.print("\n");
		}
	}
}
