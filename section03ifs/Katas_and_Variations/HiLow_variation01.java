package org.teachingkidsprogramming.section03ifs.Katas_and_Variations;

import org.teachingextensions.approvals.lite.util.NumberUtils;
import org.teachingextensions.logo.Sound;
import org.teachingextensions.logo.utils.EventUtils.MessageBox;

public class HiLow_variation01
{
  public static void main(String[] args)
  {
    for (int i = 0; i < 8; i++)
    {
      int guess = MessageBox.askForNumericalInput(" What is your guess?");
      //         If the guess is correct --#4
      int answer = NumberUtils.getRandomInt(1, 100);
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
