# Lingo Word Game

Archiving as Read Only for preservation. I will probably restart this with more knowledge.


##  Project 01
 
### NOV 26, 2020 to DEC 28, 2020
 
**Maven added in JUN 2021**

This is my first repository. I am totally new to this, so ignore most here unless you think I can learn from it.

Build with Maven and Java 16
Database for score: Sqlite

### structure
Home.java - main method
GameBody.java - runs the game logic
Initializer.java - retrieves random word from .dic file
Scores.java - handles the JDBC connections
Validator.java - ensures player only inputs 4 letters as a guess

###  issues
- unable to loop with InvalidInpuitException
- even if player inputs <or > than 5 characters, it counts as an attempt
