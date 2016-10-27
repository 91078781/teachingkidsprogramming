package org.teachingkidsprogramming.section02methods.Kata_and_Variations;

import org.teachingextensions.logo.Tortoise;
import org.teachingextensions.logo.utils.ColorUtils.PenColors;
//----------------Kata Question----------------//
//Where do you see duplicate lines of code?
//  and how can you refactor to make this code more readable?
// right out the steps in English
// then translate the steps into code
// make sure to run after each line
//----------------Kata Question----------------//
//Where do you see duplicate lines of code?
//and how can you refactor to make this code more readable?
//right out the steps in English
//then translate the steps into code
//make sure to run after each line
//----------------Kata Question----------------//
//Where do you see duplicate lines of code?
//and how can you refactor to make this code more readable?
//right out the steps in English
//then translate the steps into code
//make sure to run after each line
//----------------Kata Question----------------//
//Where do you see duplicate lines of code?
//and how can you refactor to make this code more readable?
//right out the steps in English
//then translate the steps into code
//make sure to run after each line

// be aware: this is an example of to much refactoring, 
// when we are done with refactoring it will be less readable than before, that's bad
//
public class PyramidsOfGizaRemoveEvenMoreDuplication_04
{
  public static void main(String[] args) throws Exception
  {
    setUpPyramidLand();
    // bad refactoring
    int[][] degreesAndLength = {{-90, 220},
                                {135, 100},
                                {90, 100},
                                {-90, 100},
                                {90, 100},
                                {-90, 100},
                                {90, 100},
                                {135, 210}};
    for (int[] i : degreesAndLength)
    {
      Tortoise.turn(i[0]);
      Tortoise.move(i[1]);
    }
  }
  private static void setUpPyramidLand()
  {
    Tortoise.show();
    Tortoise.setSpeed(10);
    Tortoise.getBackgroundWindow().setBackground(PenColors.Blues.AliceBlue);
    Tortoise.setPenColor(PenColors.Yellows.DarkGoldenrod);
    Tortoise.setPenWidth(2);
    Tortoise.hide();
  }
}
