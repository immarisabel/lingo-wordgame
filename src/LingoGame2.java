public class LingoGame2
{

	public static void mainOne(String[] args)
	{

		new LingoGame2();
		while (Game.Life(0) >= 1)
			;
		{
			Game.StartGame();
			System.out.println("\n");
		}

		System.out.println("game over");
	}

}
