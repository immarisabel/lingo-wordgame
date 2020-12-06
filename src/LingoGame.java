import java.util.Scanner;

public class LingoGame
{

	public static void main(String[] args)
	{
		Scanner playAgain = new Scanner(System.in);
		System.out.println("Wanna play? Yes or no?");
		Boolean play = playAgain.nextBoolean();

		if (play == true)
		{
			Game.StartGame();

		}

		else if (play == false)
		{
			System.out.println("Thank you for playing!");

		}
		playAgain.close();
	}
}
