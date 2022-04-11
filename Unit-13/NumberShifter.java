//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Arrays;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import static java.lang.System.*;

public class NumberShifter
{
	public static int[] makeLucky7Array( int size)
	{
		int[] x = new int[size];

		for (int i=0;i<size;i++)
		{
			x[i] = (int)(Math.random() * 10) + 1;
		}

		return x;
	}
	public static void shiftEm(int[] array)
	{
		//int[] thing = new int[array.length];
		//int count = 0;

		for (int i=0;i<array.length;i++)
		{
			if (array[i] == 7)
			{
				for (int j=0;j<array.length;j++)
				{
					if (array[j] != 7)
					{
						int place = array[j];
						array[j] = array[i];
						array[i] = place;
						break;
					}
				}
			}
		}

		/*for (int i=0;i<array.length;i++)
		{
			if (array[i] == 7)
				count++;
		}

		for (int i=0;i<count;i++)
		{
			thing[i] = 7;
		}

		for (int i=0;i<array.length;i++)
		{
			if (array[i] != 7)
			{
				thing[count] = array[i];
				count++;
			}
		}
		array = thing;*/
	}
}