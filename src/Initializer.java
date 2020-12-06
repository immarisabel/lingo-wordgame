import java.util.Random;

public class Initializer {

	static String[] rgWords = null;

	public static String InitializeFromArray() {
		rgWords = new String[]
		{ "lingo" };
		int random = new Random().nextInt(rgWords.length);
		return rgWords[random];
	}

}
