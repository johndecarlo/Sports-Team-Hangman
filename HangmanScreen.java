/**
   John DeCarlo
   HangmanScreen.java
   June 9th, 2019
**/

import java.util.*;
import java.io.*;
import javax.swing.*;
import java.awt.*;

public class HangmanScreen extends JPanel {
   
   private ImageIcon letter_A = new ImageIcon("letter_images/letter_A.png");  //Letter A
   private ImageIcon letter_B = new ImageIcon("letter_images/letter_B.png");  //Letter B
   private ImageIcon letter_C = new ImageIcon("letter_images/letter_C.png");  //Letter C
   private ImageIcon letter_D = new ImageIcon("letter_images/letter_D.png");  //Letter D
   private ImageIcon letter_E = new ImageIcon("letter_images/letter_E.png");  //Letter E
   private ImageIcon letter_F = new ImageIcon("letter_images/letter_F.png");  //Letter F
   private ImageIcon letter_G = new ImageIcon("letter_images/letter_G.png");  //Letter G
   private ImageIcon letter_H = new ImageIcon("letter_images/letter_H.png");  //Letter H
   private ImageIcon letter_I = new ImageIcon("letter_images/letter_I.png");  //Letter I
   private ImageIcon letter_J = new ImageIcon("letter_images/letter_J.png");  //Letter J
   private ImageIcon letter_K = new ImageIcon("letter_images/letter_K.png");  //Letter K
   private ImageIcon letter_L = new ImageIcon("letter_images/letter_L.png");  //Letter L
   private ImageIcon letter_M = new ImageIcon("letter_images/letter_M.png");  //Letter M
   private ImageIcon letter_N = new ImageIcon("letter_images/letter_N.png");  //Letter N
   private ImageIcon letter_O = new ImageIcon("letter_images/letter_O.png");  //Letter O
   private ImageIcon letter_P = new ImageIcon("letter_images/letter_P.png");  //Letter P
   private ImageIcon letter_Q = new ImageIcon("letter_images/letter_Q.png");  //Letter Q
   private ImageIcon letter_R = new ImageIcon("letter_images/letter_R.png");  //Letter R
   private ImageIcon letter_S = new ImageIcon("letter_images/letter_S.png");  //Letter S
   private ImageIcon letter_T = new ImageIcon("letter_images/letter_T.png");  //Letter T
   private ImageIcon letter_U = new ImageIcon("letter_images/letter_U.png");  //Letter U
   private ImageIcon letter_V = new ImageIcon("letter_images/letter_V.png");  //Letter V
   private ImageIcon letter_W = new ImageIcon("letter_images/letter_W.png");  //Letter W
   private ImageIcon letter_X = new ImageIcon("letter_images/letter_X.png");  //Letter X
   private ImageIcon letter_Y = new ImageIcon("letter_images/letter_Y.png");  //Letter Y
   private ImageIcon letter_Z = new ImageIcon("letter_images/letter_Z.png");  //Letter Z
   
   private ImageIcon hangman_0 = new ImageIcon("hangman_images/hangman_0.png");  //Hangman 0
   private ImageIcon hangman_1 = new ImageIcon("hangman_images/hangman_1.png");  //Hangman 1
   private ImageIcon hangman_2 = new ImageIcon("hangman_images/hangman_2.png");  //Hangman 2
   private ImageIcon hangman_3 = new ImageIcon("hangman_images/hangman_3.png");  //Hangman 3
   private ImageIcon hangman_4 = new ImageIcon("hangman_images/hangman_4.png");  //Hangman 4
   private ImageIcon hangman_5 = new ImageIcon("hangman_images/hangman_5.png");  //Hangman 5
   private ImageIcon hangman_6 = new ImageIcon("hangman_images/hangman_6.png");  //Hangman 6
   
   private ImageIcon underline = new ImageIcon("letter_images/underline.png");  //Underline
   private ImageIcon white_background = new ImageIcon("hangman_images/white_background.png");  //White background

   private static ArrayList<String> answers;    //ArrayList of strings that has our answers
   private static String[][] word_board;     //Word board that we use to display the answer
   private static int hangman_count;         //How many values we are away from full hangman
   private static String answer;             //The final answer of the string
   private static File file;           //File with all our string values
   
   private static boolean display_A;   //Display letter A
   private static boolean display_B;   //Display letter B
   private static boolean display_C;   //Display letter C
   private static boolean display_D;   //Display letter D
   private static boolean display_E;   //Display letter E
   private static boolean display_F;   //Display letter F
   private static boolean display_G;   //Display letter G
   private static boolean display_H;   //Display letter H
   private static boolean display_I;   //Display letter I
   private static boolean display_J;   //Display letter J
   private static boolean display_K;   //Display letter K
   private static boolean display_L;   //Display letter L
   private static boolean display_M;   //Display letter M
   private static boolean display_N;   //Display letter N
   private static boolean display_O;   //Display letter O
   private static boolean display_P;   //Display letter P
   private static boolean display_Q;   //Display letter Q
   private static boolean display_R;   //Display letter R
   private static boolean display_S;   //Display letter S
   private static boolean display_T;   //Display letter T
   private static boolean display_U;   //Display letter U
   private static boolean display_V;   //Display letter V
   private static boolean display_W;   //Display letter W
   private static boolean display_X;   //Display letter X
   private static boolean display_Y;   //Display letter Y
   private static boolean display_Z;   //Display letter Z

   //Constructor for HangmanScreen class
   public HangmanScreen() {
      word_board = new String[5][12];   //Initalize board
      createAnswers();
      int random = (int)(Math.random() * answers.size());
      answer = answers.get(random);
      hangman_count = 0;   //Set hangman_count to 0
      display_A = false;   //Set display_A to false
      display_B = false;   //Set display_B to false
      display_C = false;   //Set display_C to false
      display_D = false;   //Set display_D to false
      display_E = false;   //Set display_E to false
      display_F = false;   //Set display_F to false
      display_G = false;   //Set display_G to false
      display_H = false;   //Set display_H to false
      display_I = false;   //Set display_I to false
      display_J = false;   //Set display_J to false
      display_K = false;   //Set display_K to false
      display_L = false;   //Set display_L to false
      display_M = false;   //Set display_M to false
      display_N = false;   //Set display_N to false
      display_O = false;   //Set display_O to false
      display_P = false;   //Set display_P to false
      display_Q = false;   //Set display_Q to false
      display_R = false;   //Set display_R to false
      display_S = false;   //Set display_S to false
      display_T = false;   //Set display_T to false
      display_U = false;   //Set display_U to false
      display_V = false;   //Set display_V to false
      display_W = false;   //Set display_W to false
      display_X = false;   //Set display_X to false
      display_Y = false;   //Set display_Y to false
      display_Z = false;   //Set display_Z to false
      displayAnswer();
   }

   //Paint objects onto the JPanel
   public void paintComponent(Graphics g) {
      super.paintComponent(g); 	//Call super method
      showWord(g);               //Draw the word and output text
      showHangman(g);			   //draw the contents of the board on the screen
   }
   
   //Display the word solved or not on the JPanel
   public void showWord(Graphics g) {
      g.drawImage(white_background.getImage(), 25, 25, 650, 300, null); //Draw Board Background
      g.drawImage(white_background.getImage(), 100, 350, 500, 50, null); //Draw Text Background
      for(int r = 0; r < word_board.length; r++) {
         for(int c = 0; c < word_board[0].length; c++) {
            if(word_board[r][c] != null) {
               if(!word_board[r][c].equals(" ")) {         
                  g.drawImage(underline.getImage(), (c*50)+50, (r*60)+100, 45, 5, null); //Draw underline for Letter
                  if(word_board[r][c].equals("A") && display_A) {
                     g.drawImage(letter_A.getImage(), (c*50)+50, (r*60)+50, 45, 50, null); //Draw Letter A
                  } else if(word_board[r][c].equals("B") && display_B) {
                     g.drawImage(letter_B.getImage(), (c*50)+50, (r*60)+50, 45, 50, null); //Draw Letter B
                  } else if(word_board[r][c].equals("C") && display_C) {
                     g.drawImage(letter_C.getImage(), (c*50)+50, (r*60)+50, 45, 50, null); //Draw Letter C
                  } else if(word_board[r][c].equals("D") && display_D) {
                     g.drawImage(letter_D.getImage(), (c*50)+50, (r*60)+50, 45, 50, null); //Draw Letter D
                  } else if(word_board[r][c].equals("E") && display_E) {
                     g.drawImage(letter_E.getImage(), (c*50)+50, (r*60)+50, 45, 50, null); //Draw Letter E
                  } else if(word_board[r][c].equals("F") && display_F) {
                     g.drawImage(letter_F.getImage(), (c*50)+50, (r*60)+50, 45, 50, null); //Draw Letter F
                  } else if(word_board[r][c].equals("G") && display_G) {
                     g.drawImage(letter_G.getImage(), (c*50)+50, (r*60)+50, 45, 50, null); //Draw Letter G
                  } else if(word_board[r][c].equals("H") && display_H) {
                     g.drawImage(letter_H.getImage(), (c*50)+50, (r*60)+50, 45, 50, null); //Draw Letter H
                  } else if(word_board[r][c].equals("I") && display_I) {
                     g.drawImage(letter_I.getImage(), (c*50)+50, (r*60)+50, 45, 50, null); //Draw Letter I
                  } else if(word_board[r][c].equals("J") && display_J) {
                     g.drawImage(letter_J.getImage(), (c*50)+50, (r*60)+50, 45, 50, null); //Draw Letter J
                  } else if(word_board[r][c].equals("K") && display_K) {
                     g.drawImage(letter_K.getImage(), (c*50)+50, (r*60)+50, 45, 50, null); //Draw Letter K
                  } else if(word_board[r][c].equals("L") && display_L) {
                     g.drawImage(letter_L.getImage(), (c*50)+50, (r*60)+50, 45, 50, null); //Draw Letter L
                  } else if(word_board[r][c].equals("M") && display_M) {
                     g.drawImage(letter_M.getImage(), (c*50)+50, (r*60)+50, 45, 50, null); //Draw Letter M
                  } else if(word_board[r][c].equals("N") && display_N) {
                     g.drawImage(letter_N.getImage(), (c*50)+50, (r*60)+50, 45, 50, null); //Draw Letter N
                  } else if(word_board[r][c].equals("O") && display_O) {
                     g.drawImage(letter_O.getImage(), (c*50)+50, (r*60)+50, 45, 50, null); //Draw Letter O
                  } else if(word_board[r][c].equals("P") && display_P) {
                     g.drawImage(letter_P.getImage(), (c*50)+50, (r*60)+50, 45, 50, null); //Draw Letter P
                  } else if(word_board[r][c].equals("Q") && display_Q) {
                     g.drawImage(letter_Q.getImage(), (c*50)+50, (r*60)+50, 45, 50, null); //Draw Letter Q
                  } else if(word_board[r][c].equals("R") && display_R) {
                     g.drawImage(letter_R.getImage(), (c*50)+50, (r*60)+50, 45, 50, null); //Draw Letter R
                  } else if(word_board[r][c].equals("S") && display_S) {
                     g.drawImage(letter_S.getImage(), (c*50)+50, (r*60)+50, 45, 50, null); //Draw Letter S
                  } else if(word_board[r][c].equals("T") && display_T) {
                     g.drawImage(letter_T.getImage(), (c*50)+50, (r*60)+50, 45, 50, null); //Draw Letter T
                  } else if(word_board[r][c].equals("U") && display_U) {
                     g.drawImage(letter_U.getImage(), (c*50)+50, (r*60)+50, 45, 50, null); //Draw Letter U
                  } else if(word_board[r][c].equals("V") && display_V) {
                     g.drawImage(letter_V.getImage(), (c*50)+50, (r*60)+50, 45, 50, null); //Draw Letter V
                  } else if(word_board[r][c].equals("W") && display_W) {
                     g.drawImage(letter_W.getImage(), (c*50)+50, (r*60)+50, 45, 50, null); //Draw Letter W
                  } else if(word_board[r][c].equals("X") && display_X) {
                     g.drawImage(letter_X.getImage(), (c*50)+50, (r*60)+50, 45, 50, null); //Draw Letter X
                  } else if(word_board[r][c].equals("Y") && display_Y) {
                     g.drawImage(letter_Y.getImage(), (c*50)+50, (r*60)+50, 45, 50, null); //Draw Letter Y
                  } else if(word_board[r][c].equals("Z") && display_Z) {
                     g.drawImage(letter_Z.getImage(), (c*50)+50, (r*60)+50, 45, 50, null); //Draw Letter Z
                  }
               }
            }
         }
      }    
   }
   
   //Show the Hangman on the JPanel
   public void showHangman(Graphics g) {
      if(hangman_count == 0) {
         g.drawImage(hangman_0.getImage(), 725, 75, 200, 300, null); //Draw Hangman 0
      } else if(hangman_count == 1) {
         g.drawImage(hangman_1.getImage(), 725, 75, 200, 300, null); //Draw Hangman 1
      }else if(hangman_count == 2) {
         g.drawImage(hangman_2.getImage(), 725, 75, 200, 300, null); //Draw Hangman 2
      }else if(hangman_count == 3) {
         g.drawImage(hangman_3.getImage(), 725, 75, 200, 300, null); //Draw Hangman 3
      }else if(hangman_count == 4) {
         g.drawImage(hangman_4.getImage(), 725, 75, 200, 300, null); //Draw Hangman 4
      }else if(hangman_count == 5) {
         g.drawImage(hangman_5.getImage(), 725, 75, 200, 300, null); //Draw Hangman 5
      } else {
         g.drawImage(hangman_6.getImage(), 725, 75, 200, 300, null); //Draw Hangman 6
      }
   }
   
   //Call File to create the ArrayList of answers
   public static void createAnswers() {
      try {
         int random = (int)(Math.random() * 4) + 1;
         if(random == 1) {
            file = new File("answers/mlb_answers.txt");  //List of MLB Teams
         } else if(random == 2) {   
            file = new File("answers/nba_answers.txt");  //List of NBA Teams
         } else if(random == 3) {   
            file = new File("answers/nfl_answers.txt");  //List of NFL Teams
         } else {
            file = new File("answers/nhl_answers.txt");  //List of NHL Teams
         }
         answers = new ArrayList<String>();
         BufferedReader reader = new BufferedReader(new FileReader(file));
         String line = null;
         while ((line = reader.readLine()) != null) {
            answers.add(line);   //Add the line to the array
         }
      } catch(IOException e) {
         System.out.println("File not found");  //Throw an exception
      }
   }
   
   public static void displayAnswer() {
      int count = 0;
      int word = 0;
      String[] array = answer.split(" "); //Split the line by spaces
      for(int r = 0; r < word_board.length; r++) {    //For the rows on our display
         for(int c = 0; c < word_board[0].length; c++) {    //For the col on our display
            if(count < answer.length()) {
               if(Character.toString(answer.charAt(count)).equals(" ")) {     //If there is a space
                  word++;                                                     //Get the next word
                  if(array[word].length() > word_board[0].length - c - 1) {   //If the word will not fit in the remaining spaces
                     r++;                                                     //Increase the row we are in
                     c = -1;                                                  //Go to the starting column
                     count++;                                                 //Increment our place in the array
                  } else if(c == 0) {                                         //Else if we are at the start of the column
                     c--;                                                     //Skip over the space
                     count++; 
                  }else {
                     word_board[r][c] = Character.toString(answer.charAt(count));   //Set the location to the character
                     count++;                //Increase the count
                  }
               } else {
                  word_board[r][c] = Character.toString(answer.charAt(count));   //Set the location to the character
                     count++;                //Increase the count
               }
            } else {
               break;   //We have reached the end of the answer, break out of the loop
            }
         }
      }
   }
   
   //Determine whether the selected string is in the answer or not
   public void setDisplay(String letter) {
      if(answer.contains(letter)) {
         HangmanDriver.setOutputText("Correct, that letter is in the answer");
         if(letter.equals("A"))   //If letter is equal to A
            display_A = true;    //Set display_A to true
         else if(letter.equals("B"))   //If letter is equal to B
            display_B = true;    //Set display_B to true
         else if(letter.equals("C"))   //If letter is equal to C
            display_C = true;    //Set display_C to true
         else if(letter.equals("D"))   //If letter is equal to D
            display_D = true;    //Set display_D to true
         else if(letter.equals("E"))   //If letter is equal to E
            display_E = true;    //Set display_E to true
         else if(letter.equals("F"))   //If letter is equal to F
            display_F = true;    //Set display_F to true
         else if(letter.equals("G"))   //If letter is equal to G
            display_G = true;    //Set display_G to true
         else if(letter.equals("H"))   //If letter is equal to H
            display_H = true;    //Set display_H to true
         else if(letter.equals("I"))   //If letter is equal to I
            display_I = true;    //Set display_I to true
         else if(letter.equals("J"))   //If letter is equal to J
            display_J = true;    //Set display_J to true
         else if(letter.equals("K"))   //If letter is equal to K
            display_K = true;    //Set display_K to true
         else if(letter.equals("L"))   //If letter is equal to L
            display_L = true;    //Set display_L to true
         else if(letter.equals("M"))   //If letter is equal to M
            display_M = true;    //Set display_M to true
         else if(letter.equals("N"))   //If letter is equal to N
            display_N = true;    //Set display_N to true
         else if(letter.equals("O"))   //If letter is equal to O
            display_O = true;    //Set display_O to true
         else if(letter.equals("P"))   //If letter is equal to P
            display_P = true;    //Set display_P to true
         else if(letter.equals("Q"))   //If letter is equal to Q
            display_Q = true;    //Set display_Q to true
         else if(letter.equals("R"))   //If letter is equal to R
            display_R = true;    //Set display_R to true
         else if(letter.equals("S"))   //If letter is equal to S
            display_S = true;    //Set display_S to true
         else if(letter.equals("T"))   //If letter is equal to T
            display_T = true;    //Set display_T to true
         else if(letter.equals("U"))   //If letter is equal to U
            display_U = true;    //Set display_U to true
         else if(letter.equals("V"))   //If letter is equal to V
            display_V = true;    //Set display_V to true
         else if(letter.equals("W"))   //If letter is equal to W
            display_W = true;    //Set display_W to true
         else if(letter.equals("X"))   //If letter is equal to X
            display_X = true;    //Set display_X to true
         else if(letter.equals("Y"))   //If letter is equal to Y
            display_Y = true;    //Set display_Y to true
         else if(letter.equals("Z"))   //If letter is equal to Z
            display_Z = true;    //Set display_Z to true
      } else {
         HangmanDriver.setOutputText("That letter isn't in our final answer");
         hangman_count++;  //Increase Hangman count
         if(hangman_count == 6) {
            HangmanDriver.setOutputText("You lose");
            HangmanDriver.disableAll();   //Disable all buttons to not keep playing
         }
      }
   }
   
   //Check our answer to see if we solved it all
   public static boolean checkAnswer() {
      boolean correct = true;
      for(int i = 0; i < answer.length(); i++) {
         if(Character.toString(answer.charAt(i)).equals("A") && display_A == false) { //If letter is equal to A
            correct = false;    //Set correct to false
            break;               //Break out of loop
         } else if(Character.toString(answer.charAt(i)).equals("B") && !display_B) { //If letter is equal to B
            correct = false;    //Set correct to false
            break;               //Break out of loop
         } else if(Character.toString(answer.charAt(i)).equals("C") && !display_C) { //If letter is equal to C
            correct = false;    //Set correct to false
            break;               //Break out of loop
         } else if(Character.toString(answer.charAt(i)).equals("D") && !display_D) { //If letter is equal to D
            correct = false;    //Set correct to false
            break;               //Break out of loop
         } else if(Character.toString(answer.charAt(i)).equals("E") && !display_E) { //If letter is equal to E
            correct = false;    //Set correct to false
            break;               //Break out of loop
         } else if(Character.toString(answer.charAt(i)).equals("F") && !display_F) { //If letter is equal to F
            correct = false;    //Set correct to false
            break;               //Break out of loop
         } else if(Character.toString(answer.charAt(i)).equals("G") && !display_G) { //If letter is equal to G
            correct = false;    //Set correct to false
            break;               //Break out of loop
         } else if(Character.toString(answer.charAt(i)).equals("H") && !display_H) { //If letter is equal to H
            correct = false;    //Set correct to false
            break;               //Break out of loop
         } else if(Character.toString(answer.charAt(i)).equals("I") && !display_I) { //If letter is equal to I
            correct = false;    //Set correct to false
            break;               //Break out of loop
         } else if(Character.toString(answer.charAt(i)).equals("J") && !display_J) { //If letter is equal to J
            correct = false;    //Set correct to false
            break;               //Break out of loop
         } else if(Character.toString(answer.charAt(i)).equals("K") && !display_K) { //If letter is equal to K
            correct = false;    //Set correct to false
            break;               //Break out of loop
         } else if(Character.toString(answer.charAt(i)).equals("L") && !display_L) { //If letter is equal to L
            correct = false;    //Set correct to false
            break;               //Break out of loop
         } else if(Character.toString(answer.charAt(i)).equals("M") && !display_M) { //If letter is equal to M
            correct = false;    //Set correct to false
            break;               //Break out of loop
         } else if(Character.toString(answer.charAt(i)).equals("N") && !display_N) { //If letter is equal to N
            correct = false;    //Set correct to false
            break;               //Break out of loop
         } else if(Character.toString(answer.charAt(i)).equals("O") && !display_O) { //If letter is equal to O
            correct = false;    //Set correct to false
            break;               //Break out of loop
         } else if(Character.toString(answer.charAt(i)).equals("P") && !display_P) { //If letter is equal to P
            correct = false;    //Set correct to false
            break;               //Break out of loop
         } else if(Character.toString(answer.charAt(i)).equals("Q") && !display_Q) { //If letter is equal to Q
            correct = false;    //Set correct to false
            break;               //Break out of loop
         } else if(Character.toString(answer.charAt(i)).equals("R") && !display_R) { //If letter is equal to R
            correct = false;    //Set correct to false
            break;               //Break out of loop
         } else if(Character.toString(answer.charAt(i)).equals("S") && !display_S) { //If letter is equal to S
            correct = false;    //Set correct to false
            break;               //Break out of loop
         } else if(Character.toString(answer.charAt(i)).equals("T") && !display_T) { //If letter is equal to T
            correct = false;    //Set correct to false
            break;               //Break out of loop
         } else if(Character.toString(answer.charAt(i)).equals("U") && !display_U) { //If letter is equal to U
            correct = false;    //Set correct to false
            break;               //Break out of loop
         } else if(Character.toString(answer.charAt(i)).equals("V") && !display_V) { //If letter is equal to V
            correct = false;    //Set correct to false
            break;               //Break out of loop
         } else if(Character.toString(answer.charAt(i)).equals("W") && !display_W) { //If letter is equal to W
            correct = false;    //Set correct to false
            break;               //Break out of loop
         } else if(Character.toString(answer.charAt(i)).equals("X") && !display_X) { //If letter is equal to X
            correct = false;    //Set correct to false
            break;               //Break out of loop
         } else if(Character.toString(answer.charAt(i)).equals("Y") && !display_Y) { //If letter is equal to Y
            correct = false;    //Set correct to false
            break;               //Break out of loop
         } else if(Character.toString(answer.charAt(i)).equals("Z") && !display_Z) { //If letter is equal to Z
            correct = false;    //Set correct to false
            break;               //Break out of loop
         }
      }
      return correct;
   }
   
   //Restart the game over again
   public static void restart() {
      word_board = new String[5][12];   //Initalize board
      createAnswers();
      int random = (int)(Math.random() * answers.size());
      answer = answers.get(random);
      hangman_count = 0;   //Set hangman_count to 0
      display_A = false;   //Set display_A to false
      display_B = false;   //Set display_B to false
      display_C = false;   //Set display_C to false
      display_D = false;   //Set display_D to false
      display_E = false;   //Set display_E to false
      display_F = false;   //Set display_F to false
      display_G = false;   //Set display_G to false
      display_H = false;   //Set display_H to false
      display_I = false;   //Set display_I to false
      display_J = false;   //Set display_J to false
      display_K = false;   //Set display_K to false
      display_L = false;   //Set display_L to false
      display_M = false;   //Set display_M to false
      display_N = false;   //Set display_N to false
      display_O = false;   //Set display_O to false
      display_P = false;   //Set display_P to false
      display_Q = false;   //Set display_Q to false
      display_R = false;   //Set display_R to false
      display_S = false;   //Set display_S to false
      display_T = false;   //Set display_T to false
      display_U = false;   //Set display_U to false
      display_V = false;   //Set display_V to false
      display_W = false;   //Set display_W to false
      display_X = false;   //Set display_X to false
      display_Y = false;   //Set display_Y to false
      display_Z = false;   //Set display_Z to false
      displayAnswer();
   }
}
