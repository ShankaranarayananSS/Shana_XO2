**_Hello everyone!_**

I am happy to present One of my Mini Project Modules here.
The Title of this Mini Project is **_Simple Games in Android_**, and was developed in **Android Studio 2024.3.2 Patch 1**.

**I am proud to say that I re-created the Tic-Tac-Toe (Also knows as XO) Two player logic on my own.**



***
Let me go through the whole program:
1. The Module-1 simply starts with the Plain screen with a **Button** saying **"Start Game"**.
2. Once we press the **Button**, the **Intent** will start a **New activity**, where the actual game is presented.

   ***<Concepts: Button OnClickListener, Intent Activity>***
3. Once the Activity is started a **Dialog Box** will display a message **X moves fitst!** and there is a **Button** with the text **OK** to confirm.

   ***<Concept: Alert Dialog Builder>***
4. The Interface has **Nine Buttons**, which plays the major role for each player's move. All the Button has same function to call and triggered using its ID.

   ***<Concepts: View.OnClickListener Class, R.id.***

5. If any of the **Button** is pressed, the following actions will happen:
   1. The Pressed button becomes invisible.

      ***<Concept: View.INVISIBLE>***.
   2. The Corresponding Text on the Button will placed on the **TextView**.
  
      ***<Concept: SetText()>***
   3. If the Text is "X" the Color of the Text is **RED**, If the Text is "O" the Color of the Text is **GREEN**.

      ***<Concepts: If-Else, graphics.Color>***.
   4. The Text View is made Visible.

      ***<Concept: View.VISIBLE>***.
   5. The Value of each Player's Move is stored in **Array** to keep track of the Game.

      ***<Concept: Array>***.
   6. The Buttons will call a **Function** named **TextChange()** to **Change the Text** displayed on the Button.

      ***<Concept: Function, SetText()>***

6. The **TextChange()** function will perform the following actions:
   1. If the Button Text is "X" then it will change it to "O" and Vice-Versa.

      ***<Concept: If-Else>***
   2. A variable will increment by 1 everytime the function is called, to track the Game Status.

      ***<Concept: Variable Assignment>***
   3. Two functions named: **WinCheck()** and **DrawCheck()** will be called after each time **TextChange()** is called.
  
      ***<Concept: Function>***
7. **Draw Check()** Function check if the condition if the value is "9" then it will perform the following actions:
   
      ***<Concept: If-Else>***.

   1. The button which **Resets the game** becomes visible.

      ***<Concept: View.VISIBLE>***.
   2.  The textview which **Displays the result** becomes visible.

      ***<Concept: View.VISIBLE>***.
   3.  The textview text is changed to **Game Draw!**.

      ***<Concept: SetText()>***.
   4. **WinCheck** is still called to check if is there any possible even in the last move i.e. Match Point.

      ***<Concept: Function>***.

   

  ***
