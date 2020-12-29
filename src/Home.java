import java.util.Scanner;

public class Home
{


	public static void main(String[] args)
	{
		new Home();
		@SuppressWarnings("resource")
		Scanner play = new Scanner(System.in);
		System.out.println("Wanna play ? \n >>> #1 YES\n >>> #2 NO\n type 1 or 2");
		int wannaPlay = play.nextInt();
		while (wannaPlay > 2)
		{
			System.out.println("\ntype 1 or 2");
			wannaPlay = play.nextInt();
		}
		while (wannaPlay == 1)
		{
			GameBody.StartGame();
			System.out.println("\n");
		}
		{
			if (wannaPlay == 2)
				System.out.println("\nOkThanksBye!\n");
		}
	}
}
