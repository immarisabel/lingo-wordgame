import java.util.Scanner;

public class LingoGame
{

	public static void main(String[] args)
	{
		Scanner playAgain = new Scanner(System.in);

		// START WORK AREA
		System.out.println("\nWanna play ? type 'true' or 'false'\n");

		playAgain.nextBoolean();

		while (playAgain(true))
			;
		{

			Game.StartGame();
			System.out.println("\nWanna play again? Yes or no?\n");
			playAgain.nextBoolean();

		}

	}

	// END WORK AREA

	private static boolean playAgain(boolean b)
	{
		return false;
	}
}
