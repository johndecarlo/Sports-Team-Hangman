/**
   John DeCarlo
   HangmanDriver.java
   June 9th, 2019
**/

import java.util.*;
import java.io.*;
import javax.swing.*;
import java.awt.*;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class HangmanDriver {
   
   public static HangmanScreen screen; //Screen for Hangman
   
   public static JButton letter_A;  //JButton for Letter A
   public static JButton letter_B;  //JButton for Letter B
   public static JButton letter_C;  //JButton for Letter C
   public static JButton letter_D;  //JButton for Letter D
   public static JButton letter_E;  //JButton for Letter E
   public static JButton letter_F;  //JButton for Letter F
   public static JButton letter_G;  //JButton for Letter G
   public static JButton letter_H;  //JButton for Letter H
   public static JButton letter_I;  //JButton for Letter I
   public static JButton letter_J;  //JButton for Letter J
   public static JButton letter_K;  //JButton for Letter K
   public static JButton letter_L;  //JButton for Letter L
   public static JButton letter_M;  //JButton for Letter M
   public static JButton letter_N;  //JButton for Letter N
   public static JButton letter_O;  //JButton for Letter O
   public static JButton letter_P;  //JButton for Letter P
   public static JButton letter_Q;  //JButton for Letter Q
   public static JButton letter_R;  //JButton for Letter R
   public static JButton letter_S;  //JButton for Letter S
   public static JButton letter_T;  //JButton for Letter T
   public static JButton letter_U;  //JButton for Letter U
   public static JButton letter_V;  //JButton for Letter V
   public static JButton letter_W;  //JButton for Letter W
   public static JButton letter_X;  //JButton for Letter X
   public static JButton letter_Y;  //JButton for Letter Y
   public static JButton letter_Z;  //JButton for Letter Z
   
   public static JButton play_again;   //Restart the game
   public static JLabel output_text;   //Output text
   
   public static void main(String[]args) throws Exception {
      JFrame board = new JFrame("Hangman");    //Create our JFrame
      screen = new HangmanScreen();             //Create a scrabbleBoard
      createKeyboard();                    //Side bar with all our options and messages
               
      board.setSize(1000, 625);			   //Size of game window
      board.setLocation(350, 100);				//location of game window on the screen
      board.setResizable(false);          //Cannot change size of the screen
      board.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Exit when close out 
      board.setContentPane(screen);       //Set contentPanel to our board
      board.setVisible(true);             //Make the screen visible
   }
 
   //Initalize all the JButtons on our JPanel
   public static void createKeyboard() {
      screen.setLayout(null); 
      //Create Row #1 of our keyboard
      letter_Q = new JButton("Q");           //Letter Q
      letter_Q.addActionListener(            //Create action listener for letter Q
         new ActionListener() { 
            public void actionPerformed(ActionEvent e) {
               letter_Q.setEnabled(false);   //Disable the button
               screen.setDisplay("Q");       //Display letter if we have it
               screen.repaint();             //Repaint the screen
               check();                      //Check to see if we've guessed the right answer
            } 
         } );
      letter_Q.setBounds(100, 425, 50, 50);  //Set bounds for button
      screen.add(letter_Q);
      letter_W = new JButton("W");           //Letter W
      letter_W.addActionListener(            //Create action listener for letter W
         new ActionListener() { 
            public void actionPerformed(ActionEvent e) {
               letter_W.setEnabled(false);   //Disable the button
               screen.setDisplay("W");       //Display letter if we have it
               screen.repaint();             //Repaint the screen
               check();                      //Check to see if we've guessed the right answer
            } 
         } );
      letter_W.setBounds(150, 425, 50, 50);  //Set bounds for button
      screen.add(letter_W);
      letter_E = new JButton("E");           //Letter E
      letter_E.addActionListener(            //Create action listener for letter E
         new ActionListener() { 
            public void actionPerformed(ActionEvent e) {
               letter_E.setEnabled(false);   //Disable the button
               screen.setDisplay("E");       //Display letter if we have it
               screen.repaint();             //Repaint the screen
               check();                      //Check to see if we've guessed the right answer
            } 
         } );
      letter_E.setBounds(200, 425, 50, 50);  //Set bounds for button
      screen.add(letter_E);
      letter_R = new JButton("R");           //Letter R
      letter_R.addActionListener(            //Create action listener for letter R
         new ActionListener() { 
            public void actionPerformed(ActionEvent e) {
               letter_R.setEnabled(false);   //Disable the button
               screen.setDisplay("R");       //Display letter if we have it
               screen.repaint();             //Repaint the screen
               check();                      //Check to see if we've guessed the right answer
            } 
         } );
      letter_R.setBounds(250, 425, 50, 50);  //Set bounds for button
      screen.add(letter_R);
      letter_T = new JButton("T");           //Letter T
      letter_T.addActionListener(            //Create action listener for letter T
         new ActionListener() { 
            public void actionPerformed(ActionEvent e) {
               letter_T.setEnabled(false);   //Disable the button
               screen.setDisplay("T");       //Display letter if we have it
               screen.repaint();             //Repaint the screen
               check();                      //Check to see if we've guessed the right answer
            } 
         } );
      letter_T.setBounds(300, 425, 50, 50);  //Set bounds for button
      screen.add(letter_T);
      letter_Y = new JButton("Y");           //Letter Y
      letter_Y.addActionListener(            //Create action listener for letter Y
         new ActionListener() { 
            public void actionPerformed(ActionEvent e) {
               letter_Y.setEnabled(false);   //Disable the button
               screen.setDisplay("Y");       //Display letter if we have it
               screen.repaint();             //Repaint the screen
               check();                      //Check to see if we've guessed the right answer
            } 
         } );
      letter_Y.setBounds(350, 425, 50, 50);  //Set bounds for button
      screen.add(letter_Y);
      letter_U = new JButton("U");           //Letter U
      letter_U.addActionListener(            //Create action listener for letter U
         new ActionListener() { 
            public void actionPerformed(ActionEvent e) {
               letter_U.setEnabled(false);   //Disable the button
               screen.setDisplay("U");       //Display letter if we have it
               screen.repaint();             //Repaint the screen
               check();                      //Check to see if we've guessed the right answer
            } 
         } );
      letter_U.setBounds(400, 425, 50, 50);  //Set bounds for button
      screen.add(letter_U);
      letter_I = new JButton("I");           //Letter I
      letter_I.addActionListener(            //Create action listener for letter I
         new ActionListener() { 
            public void actionPerformed(ActionEvent e) {
               letter_I.setEnabled(false);   //Disable the button
               screen.setDisplay("I");       //Display letter if we have it
               screen.repaint();             //Repaint the screen
               check();                      //Check to see if we've guessed the right answer
            } 
         } );
      letter_I.setBounds(450, 425, 50, 50);  //Set bounds for button
      screen.add(letter_I);
      letter_O = new JButton("O");           //Letter O
      letter_O.addActionListener(            //Create action listener for letter O
         new ActionListener() { 
            public void actionPerformed(ActionEvent e) {
               letter_O.setEnabled(false);   //Disable the button
               screen.setDisplay("O");       //Display letter if we have it
               screen.repaint();             //Repaint the screen
               check();                      //Check to see if we've guessed the right answer
            } 
         } );
      letter_O.setBounds(500, 425, 50, 50);  //Set bounds for button
      screen.add(letter_O);
      letter_P = new JButton("P");           //Letter P
      letter_P.addActionListener(            //Create action listener for letter P
         new ActionListener() { 
            public void actionPerformed(ActionEvent e) {
               letter_P.setEnabled(false);   //Disable the button
               screen.setDisplay("P");       //Display letter if we have it
               screen.repaint();             //Repaint the screen
               check();                      //Check to see if we've guessed the right answer
            } 
         } );
      letter_P.setBounds(550, 425, 50, 50);  //Set bounds for button
      screen.add(letter_P);
      //Create Row #2 of our keyboard
      letter_A = new JButton("A");           //Letter A
      letter_A.addActionListener(            //Create action listener for letter A
         new ActionListener() { 
            public void actionPerformed(ActionEvent e) {
               letter_A.setEnabled(false);   //Disable the button
               screen.setDisplay("A");       //Display letter if we have it
               screen.repaint();             //Repaint the screen
               check();                      //Check to see if we've guessed the right answer
            } 
         } );
      letter_A.setBounds(125, 475, 50, 50);  //Set bounds for button
      screen.add(letter_A);
      letter_S = new JButton("S");           //Letter S
      letter_S.addActionListener(            //Create action listener for letter S
         new ActionListener() { 
            public void actionPerformed(ActionEvent e) {
               letter_S.setEnabled(false);   //Disable the button
               screen.setDisplay("S");       //Display letter if we have it
               screen.repaint();             //Repaint the screen
               check();                      //Check to see if we've guessed the right answer
            } 
         } );
      letter_S.setBounds(175, 475, 50, 50);  //Set bounds for button
      screen.add(letter_S);
      letter_D = new JButton("D");           //Letter D
      letter_D.addActionListener(            //Create action listener for letter D
         new ActionListener() { 
            public void actionPerformed(ActionEvent e) {
               letter_D.setEnabled(false);   //Disable the button
               screen.setDisplay("D");       //Display letter if we have it
               screen.repaint();             //Repaint the screen
               check();                      //Check to see if we've guessed the right answer
            } 
         } );
      letter_D.setBounds(225, 475, 50, 50);  //Set bounds for button
      screen.add(letter_D);
      letter_F = new JButton("F");           //Letter F
      letter_F.addActionListener(            //Create action listener for letter F
         new ActionListener() { 
            public void actionPerformed(ActionEvent e) {
               letter_F.setEnabled(false);   //Disable the button
               screen.setDisplay("F");       //Display letter if we have it
               screen.repaint();             //Repaint the screen
               check();                      //Check to see if we've guessed the right answer
            } 
         } );
      letter_F.setBounds(275, 475, 50, 50);  //Set bounds for button
      screen.add(letter_F);
      letter_G = new JButton("G");           //Letter G
      letter_G.addActionListener(            //Create action listener for letter G
         new ActionListener() { 
            public void actionPerformed(ActionEvent e) {
               letter_G.setEnabled(false);   //Disable the button
               screen.setDisplay("G");       //Display letter if we have it
               screen.repaint();             //Repaint the screen
               check();                      //Check to see if we've guessed the right answer
            } 
         } );
      letter_G.setBounds(325, 475, 50, 50);  //Set bounds for button
      screen.add(letter_G);
      letter_H = new JButton("H");           //Letter H
      letter_H.addActionListener(            //Create action listener for letter H
         new ActionListener() { 
            public void actionPerformed(ActionEvent e) {
               letter_H.setEnabled(false);   //Disable the button
               screen.setDisplay("H");       //Display letter if we have it
               screen.repaint();             //Repaint the screen
               check();                      //Check to see if we've guessed the right answer
            } 
         } );
      letter_H.setBounds(375, 475, 50, 50);  //Set bounds for button
      screen.add(letter_H);
      letter_J = new JButton("J");           //Letter J
      letter_J.addActionListener(            //Create action listener for letter J
         new ActionListener() { 
            public void actionPerformed(ActionEvent e) {
               letter_J.setEnabled(false);   //Disable the button
               screen.setDisplay("J");       //Display letter if we have it
               screen.repaint();             //Repaint the screen
               check();                      //Check to see if we've guessed the right answer
            } 
         } );
      letter_J.setBounds(425, 475, 50, 50);  //Set bounds for button
      screen.add(letter_J);
      letter_K = new JButton("K");           //Letter K
      letter_K.addActionListener(            //Create action listener for letter K
         new ActionListener() { 
            public void actionPerformed(ActionEvent e) {
               letter_K.setEnabled(false);   //Disable the button
               screen.setDisplay("K");       //Display letter if we have it
               screen.repaint();             //Repaint the screen
               check();                      //Check to see if we've guessed the right answer
            } 
         } );
      letter_K.setBounds(475, 475, 50, 50);  //Set bounds for button
      screen.add(letter_K);
      letter_L = new JButton("L");           //Letter L
      letter_L.addActionListener(            //Create action listener for letter L
         new ActionListener() { 
            public void actionPerformed(ActionEvent e) {
               letter_L.setEnabled(false);   //Disable the button
               screen.setDisplay("L");       //Display letter if we have it
               screen.repaint();             //Repaint the screen
               check();                      //Check to see if we've guessed the right answer
            } 
         } );
      letter_L.setBounds(525, 475, 50, 50);  //Set bounds for button
      screen.add(letter_L);
      //Create Row #3 of our keyboard
      letter_Z = new JButton("Z");           //Letter Z
      letter_Z.addActionListener(            //Create action listener for letter Z
         new ActionListener() { 
            public void actionPerformed(ActionEvent e) {
               letter_Z.setEnabled(false);   //Disable the button
               screen.setDisplay("Z");       //Display letter if we have it
               screen.repaint();             //Repaint the screen
               check();                      //Check to see if we've guessed the right answer
            } 
         } );
      letter_Z.setBounds(150, 525, 50, 50);  //Set bounds for button
      screen.add(letter_Z);
      letter_X = new JButton("X");           //Letter X
      letter_X.addActionListener(            //Create action listener for letter X
         new ActionListener() { 
            public void actionPerformed(ActionEvent e) {
               letter_X.setEnabled(false);
               letter_X.setEnabled(false);   //Disable the button
               screen.setDisplay("X");       //Display letter if we have it
               screen.repaint();             //Repaint the screen
               check();                      //Check to see if we've guessed the right answer
            } 
         } );
      letter_X.setBounds(200, 525, 50, 50);  //Set bounds for button
      screen.add(letter_X);
      letter_C = new JButton("C");           //Letter C
      letter_C.addActionListener(            //Create action listener for letter C
         new ActionListener() { 
            public void actionPerformed(ActionEvent e) {
               letter_C.setEnabled(false);   //Disable the button
               screen.setDisplay("C");       //Display letter if we have it
               screen.repaint();             //Repaint the screen
               check();                      //Check to see if we've guessed the right answer
            } 
         } );
      letter_C.setBounds(250, 525, 50, 50);  //Set bounds for button
      screen.add(letter_C);
      letter_V = new JButton("V");           //Letter V
      letter_V.addActionListener(            //Create action listener for letter V
         new ActionListener() { 
            public void actionPerformed(ActionEvent e) {
               letter_V.setEnabled(false);   //Disable the button
               screen.setDisplay("V");       //Display letter if we have it
               screen.repaint();             //Repaint the screen
               check();                      //Check to see if we've guessed the right answer
            } 
         } );
      letter_V.setBounds(300, 525, 50, 50);  //Set bounds for button
      screen.add(letter_V);
      letter_B = new JButton("B");           //Letter B
      letter_B.addActionListener(            //Create action listener for letter B
         new ActionListener() { 
            public void actionPerformed(ActionEvent e) {
               letter_B.setEnabled(false);   //Disable the button
               screen.setDisplay("B");       //Display letter if we have it
               screen.repaint();             //Repaint the screen
               check();                      //Check to see if we've guessed the right answer
            } 
         } );
      letter_B.setBounds(350, 525, 50, 50);  //Set bounds for button
      screen.add(letter_B);
      letter_N = new JButton("N");           //Letter N
      letter_N.addActionListener(            //Create action listener for letter N
         new ActionListener() { 
            public void actionPerformed(ActionEvent e) {
               letter_N.setEnabled(false);   //Disable the button
               screen.setDisplay("N");       //Display letter if we have it
               screen.repaint();             //Repaint the screen
               check();                      //Check to see if we've guessed the right answer
            } 
         } );
      letter_N.setBounds(400, 525, 50, 50);  //Set bounds for button
      screen.add(letter_N);
      letter_M = new JButton("M");           //Letter M
      letter_M.addActionListener(            //Create action listener for letter M
         new ActionListener() { 
            public void actionPerformed(ActionEvent e) {
               letter_M.setEnabled(false);   //Disable the button
               screen.setDisplay("M");       //Display letter if we have it
               screen.repaint();             //Repaint the screen
               check();                      //Check to see if we've guessed the right answer
            } 
         } );
      letter_M.setBounds(450, 525, 50, 50);  //Set bounds for button
      screen.add(letter_M);
      play_again = new JButton("Play again");
      play_again.addActionListener(            //Create action listener for play_again
         new ActionListener() { 
            public void actionPerformed(ActionEvent e) {
               HangmanScreen.restart();
               letter_A.setEnabled(true);   //Enable letter_A button
               letter_B.setEnabled(true);   //Enable letter_B button
               letter_C.setEnabled(true);   //Enable letter_C button
               letter_D.setEnabled(true);   //Enable letter_D button
               letter_E.setEnabled(true);   //Enable letter_E button
               letter_F.setEnabled(true);   //Enable letter_F button
               letter_G.setEnabled(true);   //Enable letter_G button
               letter_H.setEnabled(true);   //Enable letter_H button
               letter_I.setEnabled(true);   //Enable letter_I button
               letter_J.setEnabled(true);   //Enable letter_J button
               letter_K.setEnabled(true);   //Enable letter_K button
               letter_L.setEnabled(true);   //Enable letter_L button
               letter_M.setEnabled(true);   //Enable letter_M button
               letter_N.setEnabled(true);   //Enable letter_N button
               letter_O.setEnabled(true);   //Enable letter_O button
               letter_P.setEnabled(true);   //Enable letter_P button
               letter_Q.setEnabled(true);   //Enable letter_Q button
               letter_R.setEnabled(true);   //Enable letter_R button
               letter_S.setEnabled(true);   //Enable letter_S button
               letter_T.setEnabled(true);   //Enable letter_T button
               letter_U.setEnabled(true);   //Enable letter_U button
               letter_V.setEnabled(true);   //Enable letter_V button
               letter_W.setEnabled(true);   //Enable letter_W button
               letter_X.setEnabled(true);   //Enable letter_X button
               letter_Y.setEnabled(true);   //Enable letter_Y button
               letter_Z.setEnabled(true);   //Enable letter_Z button
               output_text.setText("<html>Choose a letter</html>");
               screen.repaint();
            } 
         } );
      play_again.setBounds(750, 415, 150, 125);  //Set bounds for button
      screen.add(play_again);
      output_text = new JLabel("<html>Choose a letter</html>", SwingConstants.CENTER);
      output_text.setBounds(100, 350, 500, 50);
      Font font = new Font("",Font.BOLD,25);
      output_text.setFont(font);
      screen.add(output_text);
   }  
   
   //Set the output text to our message
   public static void setOutputText(String message) {
      output_text.setText("<html>" + message + "</html>");
   }
   
   //Disable all the buttons
   public static void disableAll() {
      letter_A.setEnabled(false);   //Disable letter_A button
      letter_B.setEnabled(false);   //Disable letter_B button
      letter_C.setEnabled(false);   //Disable letter_C button
      letter_D.setEnabled(false);   //Disable letter_D button
      letter_E.setEnabled(false);   //Disable letter_E button
      letter_F.setEnabled(false);   //Disable letter_F button
      letter_G.setEnabled(false);   //Disable letter_G button
      letter_H.setEnabled(false);   //Disable letter_H button
      letter_I.setEnabled(false);   //Disable letter_I button
      letter_J.setEnabled(false);   //Disable letter_J button
      letter_K.setEnabled(false);   //Disable letter_K button
      letter_L.setEnabled(false);   //Disable letter_L button
      letter_M.setEnabled(false);   //Disable letter_M button
      letter_N.setEnabled(false);   //Disable letter_N button
      letter_O.setEnabled(false);   //Disable letter_O button
      letter_P.setEnabled(false);   //Disable letter_P button
      letter_Q.setEnabled(false);   //Disable letter_Q button
      letter_R.setEnabled(false);   //Disable letter_R button
      letter_S.setEnabled(false);   //Disable letter_S button
      letter_T.setEnabled(false);   //Disable letter_T button
      letter_U.setEnabled(false);   //Disable letter_U button
      letter_V.setEnabled(false);   //Disable letter_V button
      letter_W.setEnabled(false);   //Disable letter_W button
      letter_X.setEnabled(false);   //Disable letter_X button
      letter_Y.setEnabled(false);   //Disable letter_Y button
      letter_Z.setEnabled(false);   //Disable letter_Z button
   }
   
   //Check to see if we have found the correct answer
   public static void check() {
      if(HangmanScreen.checkAnswer()) {
         disableAll();
         output_text.setText("You win!!!");
      }
   }
}
