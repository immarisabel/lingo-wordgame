
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class Scores

{

	private static int score = 0;
	private static int highScore = 0;

	private static String saveDataPath;
	private static String fileName = "SaveData";

	public static void scores(String[] args)
	{

		try
		{
			saveDataPath = Scores.class.getProtectionDomain().getCodeSource().getLocation().toURI().getPath();
		}

		catch (Exception e)
		{
			e.printStackTrace();
		}

		loadHighScore();

	}

	private static void createSaveData()
	{
		try
		{
			File file = new File(saveDataPath, fileName);
			FileWriter output = new FileWriter(file);
			BufferedWriter writer = new BufferedWriter(output);
			writer.write("" + 0);
		} catch (Exception e)
		{
			e.printStackTrace();
		}
	}

	private static void loadHighScore()
	{
		try
		{
			File f = new File(saveDataPath, fileName);
			if (!f.isFile())
			{
				createSaveData();
			}

			BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(f)));
			highScore = Integer.parseInt(reader.readLine());
			reader.close();

		} catch (Exception e)
		{
			e.printStackTrace();
		}
	}

	private static void setHighScore()
	{
		FileWriter output = null;

		try
		{
			File f = new File(saveDataPath, fileName);
			output = new FileWriter(f);
			BufferedWriter writer = new BufferedWriter(output);
			if (score >= highScore)
			{
				writer.write("" + score);

			}
			writer.close();

		} catch (

		IOException e)
		{
			e.printStackTrace();
		}

	}
}
