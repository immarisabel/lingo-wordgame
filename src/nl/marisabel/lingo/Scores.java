package nl.marisabel.lingo;

import java.sql.*;


public class Scores
{
// METHODS FOR USING DATA
	static String date = "";
	static String name = "";
	static int score = 0;
	public static String hsDateData(){
		return date;
	}
	public static int hsScoreData(){
		return score;
	}
	public static String hsNameData(){
		return name;
	}

	public static void createTable() throws ClassNotFoundException {
		Class.forName("org.sqlite.JDBC");
		Connection connection = null;
		try
		{
			// create a database connection
			connection = DriverManager.getConnection("jdbc:sqlite:scoresDB.db");
			Statement statement = connection.createStatement();
			statement.setQueryTimeout(30);  // set timeout to 30 sec.
			statement.executeUpdate("drop table if exists scores");
			statement.executeUpdate("create table scores (id integer PRIMARY KEY AUTOINCREMENT NOT NULL UNIQUE, name string, score integer, date string)");
			statement.executeUpdate("insert into scores values(NULL, 'OP', 10, '02.01.2021')");
					}
		catch(SQLException e)
		{
			// if the error message is "out of memory",
			// it probably means no database file is found
			System.err.println(e.getMessage());
		}
		finally
		{
			try
			{
				if(connection != null)
					connection.close();
			}
			catch(SQLException e)
			{
				// connection close failed.
				System.err.println(e.getMessage());
			}
		}
	}

	public static void addNS() throws ClassNotFoundException {
		Class.forName("org.sqlite.JDBC");
		String newName = GameBody.finalScoreName();
		String newDate = GameBody.setDate();
		int newScore = GameBody.finalScoreScore();
		Connection connection = null;
		try
		{
			connection = DriverManager.getConnection("jdbc:sqlite:scoresDB.db");
			Statement statement = connection.createStatement();
			statement.setQueryTimeout(30);
			PreparedStatement prep = connection.prepareStatement("INSERT INTO scores (name, score, date) VALUES (?,?,?)"); /* TIME FORMAT! */
			prep.setString(1, newName);
			prep.setInt(2, newScore);
			prep.setString(3, newDate);
			prep.execute();

			System.out.println(">>>>>>>> High Score Updated");
		}
		catch(SQLException e)
		{
			// if the error message is "out of memory",
			// it probably means no database file is found
			System.err.println(e.getMessage());
		}
		finally
		{
			try
			{
				if(connection != null)
					connection.close();
			}
			catch(SQLException e)
			{
				// connection close failed.
				System.err.println(e.getMessage());
			}
		}
	}

	public static int getHSscore() throws ClassNotFoundException {

		Class.forName("org.sqlite.JDBC");
		Connection connection = null;
		try		{
			connection = DriverManager.getConnection("jdbc:sqlite:scoresDB.db");
			Statement statement = connection.createStatement();
			statement.setQueryTimeout(30);
			String q = "SELECT * FROM scores WHERE score = (SELECT MAX(score) FROM scores)";
			ResultSet rs = statement.executeQuery(q);

			if(rs.next())
			{
				return rs.getInt("score");
			}

		}
		catch(SQLException e)		{
			System.err.println(e.getMessage());
		}
		finally		{
			try
			{
				if(connection != null)
					connection.close();
			}
			catch(SQLException e)
			{
				// connection close failed.
				System.err.println(e.getMessage());
			}
		}
		return 0;
	}

	public static String getHSname() throws ClassNotFoundException {

		Class.forName("org.sqlite.JDBC");
		Connection connection = null;
		try		{
			connection = DriverManager.getConnection("jdbc:sqlite:scoresDB.db");
			Statement statement = connection.createStatement();
			statement.setQueryTimeout(30);
			String q = "SELECT * FROM scores WHERE score = (SELECT MAX(score) FROM scores)";
			ResultSet rs = statement.executeQuery(q);

			if(rs.next())
			{
				return (rs.getString("name"));
			}

		}
		catch(SQLException e)		{
			System.err.println(e.getMessage());
		}
		finally		{
			try
			{
				if(connection != null)
					connection.close();
			}
			catch(SQLException e)
			{
				// connection close failed.
				System.err.println(e.getMessage());
			}
		}
		return null;
	}





//	// FILE for storing score
//	static String filePath ="scores.txt";
//
//
//	// METHODS to read high score from file
//	public static int getHighScore(){
//		int n = 1;
//		highScore = 0;
//		try(Stream<String> lines = Files.lines(Paths.get(filePath))) {
//			highScore = Integer.parseInt(lines.skip(n).findFirst().get());
//		}
//		catch(IOException e){
//			System.out.println(e);
//		}
//		return highScore;
//	}
//	public static String getHighScoreDate(){
//		int n = 0;
//		GameBody.finalScoreDate = null;
//		try(Stream<String> lines = Files.lines(Paths.get(filePath))) {
//			date = lines.skip(n).findFirst().get();
//		}
//		catch(IOException e){
//			System.out.println(e);
//		}
//		return date;
//	}


	}











