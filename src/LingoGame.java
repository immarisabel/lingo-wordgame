import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class LingoGame
{
	// GAME WINDOW SET UP
	JFrame window;
	Container con;
	Font normal = new Font("Tahoma", Font.PLAIN, 16);
	JPanel titleNamePanel;
	JLabel titleNameLabel;
	Font titleFont = new Font("Arial", Font.PLAIN, 28);

	JPanel startButtonPanel;
	JButton startButton;

	public LingoGame()
	{
		// WINDOW
		window = new JFrame();
		window.setSize(400, 400);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.getContentPane().setBackground(Color.DARK_GRAY);
		window.setLayout(null);
		con = window.getContentPane();

		// CONTAINER
		titleNamePanel = new JPanel();
		titleNamePanel.setBounds(50, 80, 300, 50);
		titleNamePanel.setBackground(Color.DARK_GRAY);
		titleNameLabel = new JLabel("Lets Lingo");
		titleNameLabel.setForeground(Color.white);
		titleNameLabel.setFont(titleFont);

		startButtonPanel = new JPanel();
		startButtonPanel.setBounds(100, 200, 200, 50);
		startButtonPanel.setBackground(Color.DARK_GRAY);

		startButton = new JButton("START");
		startButton.setBackground(Color.PINK);
		startButton.setForeground(Color.DARK_GRAY);
		startButton.setFont(normal);

		// Add title inside panel
		titleNamePanel.add(titleNameLabel);
		startButtonPanel.add(startButton);

		con.add(titleNamePanel);
		con.add(startButtonPanel);

		window.setVisible(true); // IMPORTANT! even if we create if, we need ot make it show with this

	}

	public static String[] guesses = new String[6];
	public static String wrongGuess;

	public static void main(String[] args)
	{
		new LingoGame();

		@SuppressWarnings("resource")
		Scanner play = new Scanner(System.in);
		System.out.println("\nWanna play ? \n >>> #1 YES\n >>> #2 NO\n type 1 or 2");
		int wannaPlay = play.nextInt();
		while (wannaPlay > 2)
		{
			System.out.println("\ntype 1 or 2");
			wannaPlay = play.nextInt();
		}
		while (wannaPlay == 1)
		{

			Game.StartGame();
			System.out.println("\n");
			System.out.println("\nWanna play ? \n >>> #1 YES\n >>> #2 NO\n type 1 or 2");
			wannaPlay = play.nextInt();
		}

		{
			if (wannaPlay == 2)
				System.out.println("\nOkThanksBye!\n");
		}

	}

}
