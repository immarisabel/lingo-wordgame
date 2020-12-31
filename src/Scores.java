import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/* SCORE MANAGEMENT METHODS TO USE
Scores.scoreData(); //create table, run once only. Need to figure out how on first run. Or do an if statement.
Scores.hsScoreData(); // score int
Scores.hsDateData(); // date String YYYY-MM-DD
Scores.hsNameData(); // name (PK)
Scores.addData(); // update scores
Scores.delData(); // only for testing purposes. Will delete after.
ID int = unique ID++
int ID = 1;
ID = ID++;
*/


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


	/*MAIN DATABASE CODE >>>>> DO NOT TOUCH <<<<<*/


	static final String CONNECTION = "jdbc:derby:scoreData;create=true";


	public static void scoreData() {

			/*
			 * use this line to define which database protocol want to use
			 * create=true line means if the ExampleDatabase is not exists,
			 * it will be created.
			 */

			/*
			 * use try-resources to handle the database connection easly.
			 * if you declare your connection and your statement in the
			 * try-resource parentheses it will be closed all connetion
			 * automatically after the program is quit from the try-catch block
			 */
			try (Connection connection = DriverManager.getConnection(CONNECTION);
				 Statement statement = connection.createStatement()) {
				//create database with executeUpdate
				statement.executeUpdate("CREATE TABLE scoreDB (ID int, name VARCHAR(45) NOT NULL PRIMARY KEY, date DATE, score int)");
				System.out.println(">>>>>>>> Database created");
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

	public static void addData() {


		/*
		 * put data in the database, use the same try-resource
		 */
		try (Connection connection = DriverManager.getConnection(CONNECTION);
			 Statement statement = connection.createStatement()) {
			//put data in database with executeUpdate
			//statement.executeUpdate("DELETE FROM scoreDB WHERE name = 'Original Player'");
// TODO fix how to write the date from variables from a method.
			statement.executeUpdate("INSERT INTO scoreDB VALUES (GameBody.finalScoreData(ID), 'GameBody.finalScoreData(name)', 'GameBody.finalScoreData(date)', GameBody.finalScoreData(score)");
			System.out.println(">>>>>>>> Database updated");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public static void hsData() {


		 //query data from database, use the same try-resource with executeQuery

		try (Connection connection = DriverManager.getConnection(CONNECTION);
			 Statement statement = connection.createStatement();
			 ResultSet resultSet = statement.executeQuery("SELECT * FROM scoreDB")) {
			//query data from database into a ResultSet
			while (resultSet.next()) {
				//System.out.println(resultSet.getInt("score"));
				score = (resultSet.getInt("score"));
				//System.out.println(resultSet.getString("date"));
				date = (resultSet.getString("date"));
				//System.out.println(resultSet.getString("name"));
				name = (resultSet.getString("name"));
			}
			//System.out.println(">>>>>>>> Database query completed");

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public static void delData() {

		/*
			 * delete table from database with executeUpdate
			 */
			try(Connection connection = DriverManager.getConnection(CONNECTION);
				Statement statement = connection.createStatement()){
				statement.executeUpdate("DROP TABLE scoreDB");
				System.out.println("Database deleted");
			}catch(SQLException e) {
				e.printStackTrace(); }
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











