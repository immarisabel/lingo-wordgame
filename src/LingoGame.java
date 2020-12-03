
import java.util.Scanner;

//using arraylist
public class LingoGame {

	public static void PrintResult(boolean result) {

		System.out.println("Success? " + (result ? true : false));

	}

	public static void main(String[] args) {
		// char again = 'y';
		// while (again == 'y') {
		Scanner scan = new Scanner(System.in);
		// get words
		final String strWord = Initializer.InitializeFromArray();
		String wordGuessed = "";
		int Attempt = 0;
		int level = 0;
		int tries = 0;
		// GAME START!
		System.out.println("New Game");
		System.out.println("1. Easy" + "\n" + "2. Medium" + "\n" + "3. Hard"
				+ "\n" + "Enter a mode:");
		// SELECT LEVEL

		while (level > 0 || level < 4 && scan.hasNextInt()) {

			// set tries according to level
			level = scan.nextInt();

			if (level == 1) {
				tries = 5;
			} else if (level == 2) {
				tries = 15;
			} else if (level == 3) {
				tries = 30;
			} else {
				System.out.println("Invalid level entered, please use:" + "\n"
						+ "1. Easy" + "\n" + "2. Medium" + "\n" + "3. Hard"
						+ "\n" + "Enter a mode:");

			}

			// START WORDS
			int len = 5;
			Validator eval = new Validator();
			char[] cArray = new char[5];
			for (Attempt = 1; Attempt <= tries; Attempt++) {
				Scanner guessing = new Scanner(System.in);

				System.out.println("Guess the word with 5 letters");
				wordGuessed = guessing.nextLine();

				if (eval.CheckLength(wordGuessed, len)) {

					System.out.println("Did you guess it?");
				} else {

					System.out.println(
							"Please only write a word with 5 letters.");
					continue;
				}
				if (wordGuessed.equals(strWord)) {

					break;
				} else {

					System.out.println("\n" + "Nice try for Attempt Number "
							+ (Attempt) + " !" + "\n" + "Try again." + "\n"
							+ "Attempts left: " + (tries - (Attempt)) + "\n");
				}
				for (int i = 0; i < 5; i++) {

					if (wordGuessed.toCharArray()[i] == strWord
							.toCharArray()[i]) {

						cArray[i] = strWord.toCharArray()[i];
					} else
						cArray[i] = '?';
				}

				System.out.println("Your attempt is now something like "
						+ String.valueOf(cArray));
			}
			PrintResult(wordGuessed.equals(strWord));

		}
	}
}
