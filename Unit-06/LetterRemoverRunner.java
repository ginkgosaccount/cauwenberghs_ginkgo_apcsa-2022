//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Ginkgo Cauwenberghs

import static java.lang.System.*;

public class LetterRemoverRunner
{
	public static void main( String args[] )
	{
		LetterRemover thing = new LetterRemover();
		
		thing.setRemover("I am Sam I am",'a');
		thing.print();
		
		thing.setRemover("ssssssssxssssesssssesss",'s');
		thing.print();
		
		thing.setRemover("qwertyqwertyqwerty",'a');
		thing.print();
		
		thing.setRemover("abababababa",'b');
		thing.print();
		
		thing.setRemover("abaababababa",'x');
		thing.print();									
	}
}
