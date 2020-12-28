// TO USE: System.out.println(dtf.format(now)); <- TIME DATE
// TO USE:


import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.stream.Stream;

public class Scores
{
	// VARIABLES

	//static int newScore = 0;
	static int highScore = 0;
	static String filePath ="scores.txt";
	static String date = null;


	// METHOD to read high score from file
	public static int getHighScore(){
		int n = 1;
		highScore = 0;
		try(Stream<String> lines = Files.lines(Paths.get(filePath))) {
			highScore = Integer.parseInt(lines.skip(n).findFirst().get());
		}
		catch(IOException e){
			System.out.println(e);
		}
		return highScore;
	}

	public static String getHighScoreDate(){
		int n = 0;
		GameBody.finalScoreDate = null;
		try(Stream<String> lines = Files.lines(Paths.get(filePath))) {
			date = lines.skip(n).findFirst().get();
		}
		catch(IOException e){
			System.out.println(e);
		}
		return date;
	}

	// WRITER SCORE TO FILE
	public static void setHighScore() {
		try {
			FileWriter myWriter = new FileWriter(filePath);
			myWriter.write(date + "\n");
			myWriter.write(Integer.toString(GameBody.finalScore));
			myWriter.close();
			System.out.println("Successfully wrote to the file.");
		} catch (IOException e) {
			System.out.println("An error occurred.");
			e.printStackTrace();
		}

	}}











