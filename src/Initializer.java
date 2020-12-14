import java.util.Random;

import wordgame.wordlist;

public class Initializer
{

	static String[] rgWords = null;

	public static String InitializeFromArray()
	{
		rgWords = new String[]
		{ wordlist.loadFile() };
		int random = new Random().nextInt(rgWords.length);
		return rgWords[random];
	}

}
