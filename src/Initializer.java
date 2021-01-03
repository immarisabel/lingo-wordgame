import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Initializer
{

	static String[] rgWords = null;

	public static String InitializeFromArray()
	{
		Random rand = new Random();
		Scanner scan = new Scanner(System.in);
		File file = new File("src/words.dic");
		Scanner s = null;
		try
		{
			s = new Scanner(file);
		} catch (FileNotFoundException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ArrayList<String> words = new ArrayList<>();
		while (s.hasNextLine())
		{
			words.add(s.nextLine());
		}
		String chosenWord = null;

		chosenWord = words.get(rand.nextInt(99) + 1);
		return chosenWord;

	}

}
