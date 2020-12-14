import java.io.File;
import java.io.FileNotFoundException;
import java.util.Random;
import java.util.Scanner;

public class InitializerTwo
{

	static String[] randomWords = null;

	public static String InitializeFromArray()
	{

		File file = new File(
				"C:\\Users\\Administrator\\Desktop\\PROJECTS OFFICIAL\\2020\\wordgame\\src\\lingowords.txt");
		Scanner scan = null;
		try
		{
			scan = new Scanner(file);
		} catch (FileNotFoundException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		randomWords = new String[]
		{ scan.nextLine() };
		int random = new Random().nextInt();
		return randomWords[random];

	}
}
