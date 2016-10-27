package org.teachingkidsprogramming.section03ifs.Katas_and_Variations;

import org.teachingextensions.approvals.lite.util.NumberUtils;
import org.teachingextensions.logo.Sound;
import org.teachingextensions.logo.utils.EventUtils.MessageBox;
//-----------Kata Question-----------//
// What happens when you enter letter(i.e. 'abc') as your guess?
//  How can you see what your guess is exactly
// Write out the steps in English
// Then translate the steps into code
// Make sure to run after each line

// check the players guess
// if guess is a letter
public class HiLowSeeBugInfo_04
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