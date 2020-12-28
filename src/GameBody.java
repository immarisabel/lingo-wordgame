import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class GameBody {

    static int Attempt = 0;
    static int len = 5;
    static int level = 0;
    static int tries = 5;
    static int life = 3;
    static int gameNumber = 1;
    static int scoreMultiplier = 10;
    static int scoreMultiplierTwo = 30;
    static int score = 0;
    static int finalScore = 0;
    static String finalScoreDate = null;

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
            GameBody.tries = +5;
        } else if(level == 2)
        {
            GameBody.tries = +10;
        }else if(level == 1)
        {
            GameBody.tries = +20;}



         return GameBody.tries;

    }

    public static String setDate( ) {
        String pattern = "dd-MM-yyyy";
        SimpleDateFormat sdf = new SimpleDateFormat(pattern);
        finalScoreDate = sdf.format(new Date());
        return finalScoreDate;
    }

    public static void StartGame()
    {

        System.out.println("Welcome! \nLet's set up!\s");
        System.out.println("Current Score : " + (Scores.getHighScore()) + " on " +(Scores.getHighScoreDate())  + "\n");

        System.out.println("""
				1. Easy\s
				2. Medium\s
				3. Hard\s
				Enter a number for mode:\s""");

         tries = Mode(tries);
// START LOOP
        while(life >=1)
        {

// random word selected
            String strWord = Initializer.InitializeFromArray();


// TODO delete when finished
     System.out.println("***DEBUG chosen word is: \n    >>> " + strWord + " <<<\n");
/////////////// /////////////// /////////////// /////////////// ///////////////

            System.out.println("Word " + gameNumber++);
            String wordGuessed = "";

            for (Attempt = 1; Attempt <= tries; Attempt++)
            {
                Scanner guessing = new Scanner(System.in);

            Validator eval = new Validator();
            char[] cArray = new char[5];
// GUESS THE WORD
            System.out.println("Guess the word with 5 letters");
            wordGuessed = guessing.nextLine();
// CHECK LENGTH
                if (eval.CheckLength(wordGuessed, len))
                {

                } else
                {

                    System.out.println("Please only write a word with 5 letters.");
                    continue;
                }

                if (wordGuessed.equals(strWord))
                {
                    break;

                } else
                {

                    System.out.println("\nNice try for Attempt Number " + (Attempt) + " !" + "\nTry again.\n"
                            + "Attempts left: " + (tries - Attempt) + "\n");
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

// RESULT
            String result = (wordGuessed.equals(strWord)) ? "\nYES! Good job!"
                    : "\nNop. Sorry! The word was " + ">>>" + strWord + "<<<" + ".";
            System.out.println(result);

// CREDITS
            if (wordGuessed.equals(strWord))

            {
                if(gameNumber < 10){
                score = score+scoreMultiplier;}
                else
                {score = score+scoreMultiplierTwo;}

                System.out.println("Your current score is : " + (score));
                System.out.println("Credits : " + life + "\n");
            } else
            {
                life--;
                System.out.println("Credits : " + life + "\n");

            }
        }
        System.out.println("Game Over!" + "\n");
        System.out.println("Your final score is : " + score + "\n");
        finalScore = score;
        finalScoreDate = setDate();
        if (finalScore > Scores.getHighScore()){
            System.out.println("New High Score!" + "\n");
        setHighScore();}
        life = 3;

        }

        // TODO do not write if score is less than highschore!

    public static void setHighScore() {
        try {
            String filePath ="scores.txt";
            FileWriter myWriter = new FileWriter(filePath);
            myWriter.write(finalScoreDate + "\n");
            myWriter.write(Integer.toString(finalScore));
            myWriter.close();
            System.out.println("Successfully wrote to the file.");

        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
}}


