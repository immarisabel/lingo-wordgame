import java.util.Scanner;

public class LingoGame
{

	public static void main(String[] args)
	{
		Scanner playAgain = new Scanner(System.in);
		System.out.println("Wanna play? Yes or no?");
		String play = playAgain.next();

		while (play == "yes")
			;
		{
			Game.StartGame();

		}

		// if (play == "no"){ System.out.println("Thank you for playing!"); }

		playAgain.close();
	}
}
