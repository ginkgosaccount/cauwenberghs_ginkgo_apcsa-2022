//(c) A+ Computer Science
// www.apluscompsci.com
//Name -  Ginkgo Cauwenberghs

import java.util.Scanner;
import static java.lang.System.*;

public class RPSRunner
{
	public static void main(String args[])
	{
		Scanner keyboard = new Scanner(System.in);
		char response;
		char playing = 'Y';
		
		do
		{
			String player = "";
		
			out.print("type in your prompt [R,P,S] :: ");
			
			response = keyboard.next().charAt(0);
		
			RockPaperScissors game = new RockPaperScissors(response);
			
			game.print();
			
			out.print("Would you like to play again? Enter "Y" or "N" ");
			playing = keyboard.next().charAt(0);
		} while (playing == 'Y');
	}
}



