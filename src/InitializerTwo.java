import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class InitializerTwo
{

	static String[] rgWords = null;

	public static String InitializeFromArray()
	{
		ArrayList<String> lines = new ArrayList<>(Files.readAllLines(Paths.get(/P001/src/lingowords.txt)));
		List<String> result = Files.readAllLines(Paths.get(lingowords.txt));

		int random = new Random().nextInt(rgWords.length);
		return rgWords[random];
	}

}
