//(c) A+ Computer Science
// www.apluscompsci.com
//Name -  Ginkgo Cauwenberghs

import java.util.Scanner;
import static java.lang.System.*;

public class RockPaperScissors
{
	private String playChoice;
	private String compChoice;

	public RockPaperScissors()
	{
		setPlayers(' ');
	}

	public RockPaperScissors(String player)
	{
		setPlayers(player);
	}

	public void setPlayers(String player)
	{
		if (player == 'R')
			playChoice = "rock";
		if (player == 'P')
			playChoice = "paper";
		if (player == 'S')
			playChoice = "scissors";
		
		int random = (int) (math.random()*3);
		if (random == 0)
			compChoice = "rock";
		if (random == 1)
			compChoice = "paper";
		if (random == 2)
			compChoice = "scissors";
		
	}

	public String determineWinner()
	{
		if (playChoice == compChoice)
			return "!Draw Game!";

		if (playChoice.equals("rock") && compChoice.equals("paper")
		    	return "!Computer wins - paper covers rock!\n";
		if (playChoice.equals("rock") && compChoice.equals("scissors")
		    	return "!Player wins - rock breaks scissors!\n";
		if (playChoice.equals("paper") && compChoice.equals("rock")
		    	return "!Player wins - paper covers rock!\n";
		if (playChoice.equals("paper") && compChoice.equals("scissors")
		    	return "!Computer wins - scissors cuts paper!\n";
		if (playChoice.equals("scissors") && compChoice.equals("rock")
		    	return "!Copmuter wins - rock breaks scissors!\n";
		if (playChoice.equals("scissors") && compChoice.equals("paper")
		    	return "!Player wins - scissors cuts paper!\n";

	}

	public void print()
	{
		out.printf("Player had %s\n", playChoice);
		out.printf("Computer had %s\n", compChoice):
		out.print(determineWinner());
	}
}
