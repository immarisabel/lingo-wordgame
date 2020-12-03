import java.util.Random;

public class Initializer {

	static String[] rgWords = null;

	public static String InitializeFromArray() {
		rgWords = new String[]{"lungo", "lingo", "rodeo", "radio", "label",
				"libel", "tango", "never", "hover"};
		int random = new Random().nextInt(rgWords.length);
		return rgWords[random];
	}

}
