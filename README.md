 # Lingo Word Game
 ## Project 01
 ### NOV 26, 2020

This is my first repository. I am totally new to this, so ignore most here unless you think I can learn from it.


*(these notes are for me to use as reference of my learning and keep the code clean once something is fixed.*
- [ ] :heavy_exclamation_mark: these are found issues to work on, found under the date of header
- [x] :heavy_check_mark: these are fixed [and date]
- :pencil2: * notes and thoughts*

# Currently Working on:
### DEC 19 - JAN 30, 2020
##Database and Score implentation
- I will be working now on the scores. But I figured I might need to start with user storing. This will be a good practice on how to implement database, storing data, accessing the data and updating it. I got a new job finally so I will be realistic about my timeline. Hence a bit over a month should be ok to learn how databases work with Java.

**TO DO:**
- [ ] Integrate a database 
- [ ] Register User name in database 
- [ ] Score per guess 10 
- [ ] Score per hint -5
- [ ] 5 word streak = +50 bonus
- [ ] 10 word streak = +100 bonus
- [ ] Words score after the 10th streak is 20 points instead of 10
- [ ] If streak finishes, then score per word is again 10
- [ ] End game? Then display total and store in user name

# challenges to fix
### Week 1 Notes:

- [x] need to be able to restart game
- [x] cuts tries remaining at +1
- [x] cuts attempts at half the tries
- [x] does not counts how many attempts are left
- [x] it does not run the rest of the game.
- [x] loops infinite when you write non-int elements
- [x] still crashes on other input.
- [x] jump to end of game with other numbers.

### DEC 3, 2020
- [ ] game does not run after letter input, not crash, not end, just shows blank and game stops
- *will postpone fixing this until the end as using GUI might fix this by limiting selection of options*

- [x] when repeating the game, the same word is always chosen. [10 DEC]

### DEC 4, 2020
- [x] won't repeat game after it ends, again. [10 DEC]

### DEC 5, 2020
- *spent most day trying to fix the restart loop without success...*

- [x] levels were backwards :sweat_smile: [DEC 5]
- [x] replace end booleans with actual ints

### DEC 10, 2020
- :pencil2: *I managed to run the restart game loop! It was simple... I was just ignoring converting the answer into Boolean! Now I still need to fix the random word to actually reset.*



# planned implementations
- [x] be able to play as many times as you wish
- [x] have a big word list to choose from
- *word list in files, but will replace it at the end, else it is annoying to test with so many words*
- *14/12 in progress*
- *17/12 finally got the word to randomize from file!*
- [ ] hints
- [ ] multiplayer function
- [ ] scoring system 
- *19/12 working on this now*
- [ ] store the player's progress and scores
- [ ] GUI
