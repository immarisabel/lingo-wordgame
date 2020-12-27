// TO USE: System.out.println(dtf.format(now)); <- TIME DATE
// TO USE:


import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Scores
{
	// VARIABLES
	static String date = setDate();
	static int finalScore = 0;
	static int highScore = 0;
	static String filePath ="scores.txt";

	//GET RESULT FROM GAME
	public static int newHighScore() {
		finalScore = 15;
		return finalScore;
	}

	//TEST THE RESULTS
	public static void main(String[] args) throws FileNotFoundException {
	// TODO delete when working code and return the Home.java to main
	System.out.println("DATE : " +date);
	System.out.println("FINAL SCORE : " + newHighScore());
	System.out.println("HIGH SCORE : " + readHighScore());
		if (newHighScore() > highScore){
			System.out.println("New high score!");
			setHighScore();}
		else {System.out.println("your scores was ok.");}

	//setHighScore();
}
//TODO load date as well
	public static void readHighScoreDate( ) {
		String lineDate;
		try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {

				br.readLine();
			lineDate = br.readLine();
			System.out.println("DATE IN FILE");

			System.out.println(lineDate);
		}
		catch(IOException e){
			System.out.println(e);
		}
}

//TODO add this HS to variable initiator
		public static String readHighScore() {
			int score = 1; // int score

			String line = null;
			try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
				for (int i = 0; i < score; i++)
					br.readLine();
				line = br.readLine();
				highScore = Integer.parseInt(line);
						}
			catch(IOException e){
				System.out.println(e);
			}

			return line;
 	}

//	public static void createFile() throws IOException {
//
//		try {
//			File myObj = new File("scores.txt");
//			if (myObj.createNewFile()) {
//				System.out.println("File created: " + myObj.getName());
//			} else {
//				System.out.println("File already exists.");
//			}
//		} catch (IOException e) {
//			System.out.println("An error occurred.");
//			e.printStackTrace();
//		}
//
//		FileWriter finalScore = new FileWriter("scores.txt");
//		PrintWriter scoreObject = new PrintWriter(finalScore);
//
//		scoreObject.println(finalScore);
//		scoreObject.println(date);
//
//		System.out.println("Score updated!");
//	}

	public static void setHighScore( )
		{
			try {
			FileWriter myWriter = new FileWriter(filePath);
			myWriter.write(date+ "\n" );
			myWriter.write(
					highScore);
			myWriter.close();
			System.out.println("Successfully wrote to the file.");
		} catch (IOException e) {
			System.out.println("An error occurred.");
			e.printStackTrace();
		}

	}

	public static void resetHighScore(){}



	//GOOD! DON'T TOUCH!
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









