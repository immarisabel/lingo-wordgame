import java.util.Scanner;

public class Game
{
	public static void PrintResult(boolean result)
	{

		if (result)
			System.out.println("Yes, you guess it right!");
		else
			System.out.println("You lost.");

	}

	public static void main(String[] args)
	{

		final String strWord = "lingo";
		String playerInput = "";
		int Attempt = 0;
		System.out.println("New Game");
		Scanner scan = new Scanner(System.in);
		int tries = 1;
		System.out.println("Enter number of attempts.");
		tries = scan.nextInt();
		int len = 5; // adjust for length of word or keep on phase 1
		for (Attempt = 0; Attempt < tries; Attempt++)
		{

			System.out.println("guess a word with 5 letters");
			playerInput = scan.nextLine();
			if (CheckLength(playerInput, len))
			{

				System.out.println("Did you guess?");
			} else
			{

				System.out.println("word lenght is not " + len);
				continue;
			}
			if (playerInput.equals(strWord))
			{

				break;
			} else
			{

				System.out.println("Nice try for Attempt Number: " + (Attempt + 1));
			}
		}
		PrintResult(playerInput.equals(strWord));
		scan.close();

	}

	private static Boolean CheckLength(String str, int len)
	{

		if (str.length() == len)
			return true;
		return false;

	}
}
