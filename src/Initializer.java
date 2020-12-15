import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Random;

public class Initializer
{

	static String[] rgWords = null;

	public static String InitializeFromArray()
	{
		String line = null;
		String fileName = null;
		try
		{
			// file to open.
			fileName = "C:\\Users\\Administrator\\Desktop\\PROJECTS OFFICIAL\\2020\\wordgame\\src\\lingowords.txt"; // words
			FileReader fileReader = new FileReader(fileName);
			BufferedReader bufferedReader = new BufferedReader(fileReader);

			while ((line = bufferedReader.readLine()) != null)
			{
				// results.add(line);

				// TODO Return a random word from file

				Random random = new Random(rgWords.length);

				int word = get(random.nextInt()); // picks random word from list

			}

			bufferedReader.close();
		} catch (FileNotFoundException ex)
		{
			System.out.println("Unable to open file '" + fileName + "'");
		} catch (IOException ex)
		{
			System.out.println("Error reading file '" + fileName + "'");
		}
		return line;

	}

	private static int get(int nextInt)
	{
		// TODO Auto-generated method stub
		return 0;
	}

}
