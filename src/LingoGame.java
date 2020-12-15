import java.util.Scanner;

public class LingoGame
{

	public static String[] guesses = new String[6];
	public static String wrongGuess;

	public static void main(String[] args)
	{
		@SuppressWarnings("resource")
		Scanner play = new Scanner(System.in);
		System.out.println("\nWanna play ? type 'true' or 'false'\n");
		Boolean wannaPlay = play.nextBoolean();

		while (wannaPlay == true)
		{

			Game.StartGame();
			System.out.println("\n");
			System.out.println("\nWanna play ? type 'true' or 'false'\n");
			wannaPlay = play.nextBoolean();
		}

		{

			System.out.println("\nBye!\n");
		}

	}

}
