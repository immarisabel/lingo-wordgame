import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;

// TO USE: System.out.println(dtf.format(now)); <- TIME DATE
// TO USE:


public class Scores
{
	// VARIABLES
	static int score = 0;
	static LocalDateTime now = LocalDateTime.now();
	static String Name = null;
public static void main(String[] args){


	scoreWriter();
}

	public static void createFile(){

		try {
			File myObj = new File("scores.txt");
			if (myObj.createNewFile()) {
				System.out.println("File created: " + myObj.getName());
			} else {
				System.out.println("File already exists.");
			}
		} catch (IOException e) {
			System.out.println("An error occurred.");
			e.printStackTrace();
		}



//		FileWriter newScore = new FileWriter("scores.txt");
//		PrintWriter scoreObject = new PrintWriter(newScore);
//
//		scoreObject.println(score);
//		scoreObject.println(Scores.Timestamp(dtf.format(now)));
//		scoreObject.println(name);
//		System.out.println("Score updated!");
	}

	public static void scoreWriter(){
		try {
			FileWriter myWriter = new FileWriter("scores.txt");
			myWriter.write(Scores.Timestamp(Scores.Timestamp(dtf.format(now))));
			myWriter.close();
			System.out.println("Successfully wrote to the file.");
		} catch (IOException e) {
			System.out.println("An error occurred.");
			e.printStackTrace();
		}

	}

	public static void Timestamp (String[] args) {

		LocalDateTime now = LocalDateTime.now();
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy at HH:mm");
		System.out.println(dtf.format(now));

	}

	}



