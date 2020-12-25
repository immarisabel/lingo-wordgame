import java.util.Scanner;

public class Game
{
	static int Attempt = 0;
	static int len = 5;
	static int level = 0;
	static int tries = 0;
	static int life = 3;
	static int gameNumber = 1;

	public static int Mode(int tries)
	{
		Scanner scan = new Scanner(System.in);

		// SELECT LEVEL
		level = scan.nextInt();


			if(level == 0 || level > 3) {
				System.out.println("Invalid level entered, please 1, 2 or 3 only.");
			}

			if (level == 3)
			{
				tries = 5;
			} else if(level == 2)
			{
				tries = 10;
			}
			else if(level == 1)
		{
			tries = 20;}

System.out.println("tries set " + tries);
		return tries;

	}

	public static String Word(String word)
	{
		word = Initializer.InitializeFromArray();
		return word;
	}

	public static void StartGame()
	{
		// VARIABLES

		System.out.println("""
				1. Easy\s
				2. Medium\s
				3. Hard\s
				Enter a number for mode:\s""");


		Scanner scan = new Scanner(System.in);
		do
		{
			// get words
			String strWord = Game.Word(null);

// TODO delete when finished
			System.out.println("***DEBUG chosen word is: \n    >>> " + strWord + " <<<\n");
/////////////// /////////////// /////////////// /////////////// ///////////////

			System.out.println("Word " + gameNumber++);
			String wordGuessed = "";
// START WORDS
			if (wordGuessed.equals(strWord))
				;
			{
				Validator eval = new Validator();
				char[] cArray = new char[5];
System.out.println("DEBUG: tries " + tries);
				for (Attempt = 1; Attempt <= Mode(tries); Attempt++)
				{
					Scanner guessing = new Scanner(System.in);

					System.out.println("Guess the word with 5 letters");
					wordGuessed = guessing.nextLine();

					if (eval.CheckLength(wordGuessed, len))
					{
System.out.println("DEBUG word length check OK");
					} else
					{

						System.out.println("Please only write a word with 5 letters.");
						continue;
					}
					if (wordGuessed.equals(strWord))
					{
System.out.println("DEBUG word guessed correct");
						break;

					} else
					{
System.out.println("DEBUG word guessed wrong");
						System.out.println(Attempt);
						System.out.println(tries);
					//	System.out.println("\nNice try for Attempt Number " + (Attempt) + " !" + "\nTry again.\n"
					//			+ "Attempts left: " + (Mode(tries) - (Attempt)) + "\n");
					}
					for (int i = 0; i < 5; i++)
					{

						if (wordGuessed.toCharArray()[i] == strWord.toCharArray()[i])
						{

							cArray[i] = strWord.toCharArray()[i];
						} else{
							cArray[i] = '?';}
					}

					System.out.println("Your attempt is now something like " + String.valueOf(cArray));
				}

				String result = (wordGuessed.equals(strWord)) ? "\nYES! Good job!"
						: "\nNop. Sorry! The word was " + strWord + ".";
				System.out.println(result);

				/// CREDIT COUNT

				if (wordGuessed.equals(strWord))

				{

					System.out.println("Credits : " + life);
				} else
				{
					life--;
					System.out.println("Credits : " + life);

				}
			}
		//	System.out.println("GAME OVER");

		}while (Game.life != 0);
	}
}

//TODO make a return value for score 0 + 1++
// for life is >=3 repeat and if 0, = game over, but only -1 when it is
// !=strWord
// for each =strWord 10+
// When life reach 0 go to GAME OVER
