package wordgame;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class randomWord
{

	private static Random rWord = new Random();
	{

		List<String> list = new ArrayList<>();
		list.add("");
		for (int i = 0; i < 10; i++)
		{
			getRandomItem(list);
		}

	}

	private void getRandomItem(List<String> list)
	{

		int word = get(random.nextInt());

	}
}
