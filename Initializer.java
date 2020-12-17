import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Initializer
{

	static String[] rgWords = null;

	public static String randomWord()
	{

		Random rand = new Random();
		Scanner scan = new Scanner(System.in);
		File file = new File(
				"C:\\Users\\Administrator\\Desktop\\PROJECTS OFFICIAL\\2020\\wordgame\\src\\lingowords.txt");
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

		chosenWord = words.get(rand.nextInt(14) + 1);
		return chosenWord;
	}
	
	public static String InitializeFromArray()
	{
		System.out.println(randomWord());

	}

}
