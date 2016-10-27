package org.teachingkidsprogramming.section03ifs.Katas_and_Variations;

import org.teachingextensions.approvals.lite.util.NumberUtils;
import org.teachingextensions.logo.Sound;
import org.teachingextensions.logo.utils.EventUtils.MessageBox;

public class HiLow_variation03
{
  public static void main(String[] args)
  {
    int answer = NumberUtils.getRandomInt(50, 100);
    MessageBox.showMessage("The answer is " + answer);
    int numGuess = MessageBox.askForNumericalInput("How many guess do you need?");;
    for (int i = 0; i < numGuess; i++)
    {
      int guess = MessageBox.askForNumericalInput(" Guess an integer between 50 and 100");
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
