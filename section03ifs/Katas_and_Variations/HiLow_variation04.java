package org.teachingkidsprogramming.section03ifs.Katas_and_Variations;

import org.teachingextensions.approvals.lite.util.NumberUtils;
import org.teachingextensions.logo.Sound;
import org.teachingextensions.logo.utils.EventUtils.MessageBox;

public class HiLow_variation04
{
  public static void main(String[] args)
  {
    int answer = NumberUtils.getRandomInt(1, 100);
    MessageBox.showMessage("The answer is " + answer);
    int numGuess = MessageBox.askForNumericalInput("How many guess do you need?");;
    int guess = MessageBox.askForNumericalInput("Guess an integer between 1 and 100");
    for (int i = 0; i < numGuess; i++)
    {
      // test for bad input
      if (guess <= 0)
      {
        MessageBox.showMessage("You cannot enter values less than 1 -- you lose!");
        System.exit(0);
      }
      if (guess >= 100)
      {
        MessageBox.showMessage("You cannot enter values more than 100 -- you lose!");
        System.exit(0);
      }
      if (guess == answer)
      {
        Sound.playBeep();
        MessageBox.showMessage("You won!");
        System.exit(0);
      }
      else if (guess > answer)
        MessageBox.showMessage("Too high!");
      else
      {
        MessageBox.showMessage("Too low!");
      }
    }
    MessageBox.showMessage("You lost");
  }
}
