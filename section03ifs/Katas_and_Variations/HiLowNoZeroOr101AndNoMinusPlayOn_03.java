package org.teachingkidsprogramming.section03ifs.Katas_and_Variations;

import org.teachingextensions.approvals.lite.util.NumberUtils;
import org.teachingextensions.logo.Sound;
import org.teachingextensions.logo.utils.EventUtils.MessageBox;
//-----------Kata Question-----------//
// How would you make sure the guess is NOT zero
//      and end the game if the guess is zero?
// How would you make sure the guess is NOT a negative number
//      but go to the next turn if the guess is negative?
// How would you make sure the guess is less than 100
//      and end the game if the guess is greater then 100?
// Write out the steps in English
// Then translate the steps into code
// Make sure to run after each line

public class HiLowNoZeroOr101AndNoMinusPlayOn_03
{
  public static void main(String[] args)
  {
    int answer = NumberUtils.getRandomInt(1, 100);
    MessageBox.showMessage("The answer is " + answer); // delete (or comment out) this line after testing the game 
    for (int i = 0; i < 2; i++)
    {
      int guess = MessageBox.askForNumericalInput("Guess a number");
      // if the guess is zero --#1
      if (guess == 0)
        // show a message saying that they can't enter the value of 0 --#2
        MessageBox.showMessage("Zero is not a valid input. Exiting Program");
      // exit the game --#3
      System.exit(0);
      // if the guess is a negative --#4
      if (guess == -answer)
      {
        // take player to the next turn--#5
        MessageBox.showMessage("You can't input a negative value.");
        break;
      }
      //if guess is greater than 100 
      if (guess > 100)
      {
        //end game
        System.exit(0);
      }
      if (guess == answer)
      {
        Sound.playBeep();
        MessageBox.showMessage("You won!");
        System.exit(0);
      }
      else if (guess > answer)
      {
        MessageBox.showMessage("Too high");
      }
      else
      {
        MessageBox.showMessage("Too low");
      }
    }
    MessageBox.showMessage("You lost");
  }
}