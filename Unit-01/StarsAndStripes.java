//© A+ Computer Science
//www.apluscompsci.com

//Name - Ginkgo Cauwenberghs
//Date - 1/18/22
//Class - AP CSA
//Lab  - Unit 01

import static java.lang.System.*;

public class StarsAndStripes
{
   public StarsAndStripes()
   {
      out.println("StarsAndStripes");
      printTwoBlankLines();
   }

   public void printTwentyStars()
   {
       out.println("********************");
   }

   public void printTwentyDashes()
   {
        out.println("--------------------");
   }

   public void printTwoBlankLines()
   {
    out.println("                    ");
    out.println("                    ");
   }
   
   public void printASmallBox()
   {	
    out.println(" _____");
    out.println("|    |");
    out.println("|    |");
    out.println("|____|");
   }
 
   public void printABigBox()
   { 	
    out.println(" __________");
    out.println("|         |");
    out.println("|         |");
    out.println("|         |");
    out.println("|         |");
    out.println("|_________|");
   }   
}
