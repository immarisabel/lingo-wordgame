import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.stream.Stream;

public class Scores
{
	// VARIABLES
	static String date = null;
	static int highScore = 0;

	// FILE for storing score
	static String filePath ="scores.txt";


	// METHODS to read high score from file
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


	}











