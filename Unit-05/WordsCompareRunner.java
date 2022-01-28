//(c) A+ Computer Science
//www.apluscompsci.com

//Name - Ginkgo Cauwenberghs
//Date - 1/27/22
//Class - AP CSA
//Lab  - Unit 5

import static java.lang.System.*;

public class WordsCompareRunner
{
   public static void main( String args[] )
   {
		WordsCompare thing = new WordsCompare();

      thing.setWords("abe","ape");
      System.out.println(thing);

      thing.setWords("giraffe","gorilla");
      System.out.println(thing);

      thing.setWords("one","two");
      System.out.println(thing);

      thing.setWords("fun","funny");
      System.out.println(thing);

      thing.setWords("123","19");
      System.out.println(thing);

      thing.setWords("193","1910");
      System.out.println(thing);

      thing.setWords("goofy","godfather");
      System.out.println(thing);

      thing.setWords("funnel","fun");
      System.out.println(thing);
	}
}