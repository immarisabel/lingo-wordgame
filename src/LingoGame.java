import java.util.Scanner;

public class LingoGame {


	public static void main(String[] args)
	{
		Game.StartGame();

		String playAgain = "yes";
		do
		{
			Scanner play = new Scanner(
					playAgain
			);
			System.out.println(
					"Play again? Yes or no?"
			);
			play.nextLine();
			play.close();
		} while (false);
	}
	}


