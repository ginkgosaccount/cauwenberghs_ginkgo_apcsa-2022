//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Ginkgo Cauwenberghs

import static java.lang.System.*;

public class TriangleFiveRunner
{
   public static void main(String args[])
   {
	   TriangleFive triangle = new TriangleFive();
	   
	   triangle.setLetter('C'); triangle.setAmount(4);
	   triangle.print();
	   
	   triangle.setLetter('A'); triangle.setAmount(5);
	   triangle.print();
	   
	   triangle.setLetter('B'); triangle.setAmount(6);
	   triangle.print();
	   
	   triangle.setLetter('X'); triangle.setAmount(7);
	   triangle.print();
	   
	   triangle.setLetter('Z'); triangle.setAmount(8);
	   triangle.print();
   }
}
