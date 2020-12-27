// TO USE: System.out.println(dtf.format(now)); <- TIME DATE
// TO USE:


import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.stream.Stream;

public class Scores
{
	// VARIABLES

	static String date = setDate();
	static int finalScore = 0;
	static int highScore = 0;
	static String filePath ="scores.txt";


	//GET RESULT FROM GAME
	public static int newScore() {
		finalScore = 21;
		return finalScore;
	}

// METHOD to read high score from file
	public static String getHighScore(){
	int n = 1;
	String strscore = "";
	try(Stream<String> lines = Files.lines(Paths.get(filePath))) {
	strscore = lines.skip(n).findFirst().get();
	}
	catch(IOException e){
		System.out.println(e);
		}
		return strscore;
	}

// METHOD to return highscore as int // data is being deleted everytime it is read.
	//reading: https://stackoverflow.com/questions/35887667/why-does-introducing-a-filewriter-delete-all-the-content-in-the-file
//The problem is that you're trying to write to the file while you're reading from it. A better solution would be to create a second file, put the transformed data into it, then replace the first file with it when you're done. Or if you don't want to do that, read all of the data out of the file first, then open it for writing and write the transformed data.
	public static int HighScore() {
		highScore = 30;
		System.out.println("DEBUG: High score is set to " + highScore);


		String strhighScore = getHighScore();
		System.out.println("DEBUG: High score string is set to " + strhighScore);
		int noninthighScore = Integer.parseInt(strhighScore);
		System.out.println("DEBUG: High score integer is set to " + noninthighScore);
		highScore = noninthighScore;

		return highScore;
	}

	//TEST THE RESULTS
	public static void main(String[] args) throws FileNotFoundException {
/* TODO delete when working code and return the Home.java to main */
	System.out.println("DATE : " +date);
	System.out.println("FINAL SCORE : " + newScore());
	System.out.println("HIGH SCORE : " + HighScore());
setHighScore();




//TODO GOOD! DON'T TOUCH!///////////////////////////////////////////


// FLOW OK! (To be used in main game file)
		if (newScore() > HighScore()){
			System.out.println("New high score!");
			setHighScore();
		}
		else {System.out.println("your scores was ok.");}
}

// METHOD to write high score to file
	public static void setHighScore()
		{
			try {
			FileWriter myWriter = new FileWriter(filePath);
			myWriter.write(date+ "\n" );
			myWriter.write(Integer.toString(HighScore()));
			myWriter.close();
			System.out.println("Successfully wrote to the file.");
		} catch (IOException e) {
			System.out.println("An error occurred.");
			e.printStackTrace();
		}

	}

	public static String setDate() {

		// define date pattern
		String pattern = "yyyy-MM-dd";

// declare that the variable is a date
		SimpleDateFormat sdf = new SimpleDateFormat(pattern);

// format the date
		date = sdf.format(new Date());
		return date;

	}

	}









