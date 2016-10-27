package org.teachingkidsprogramming.section02methods.Kata_and_Variations;

import org.teachingextensions.logo.Tortoise;
//------------FourSquare Kata---------------//
import org.teachingextensions.logo.utils.ColorUtils.PenColors;

//  Use the Tortoise to draw four squares, each with a width and height of 50 pixels
// Write out the steps in English
// Then translate the steps into code
// Make sure to run after each line
public class CompleteFourSquare
{
  // finish main method--#1
  public static void main(String[] args)
  {
    System.out.println("be sure to complete the main method to start");
    //TODO: write comments and then code here
    //show tortoise--#2
    Tortoise.show();
    //move as fast as possible--#8
    Tortoise.setSpeed(10);
    //      repeat 4 times--#3.1
    for (int i = 0; i < 4; i++)
    {
      // make the color of the lines random--#9
      Tortoise.setPenColor(PenColors.getRandomColor());
      //  repeat the following 4 times--#4.1
      for (int j = 0; j < 4; j++)
      {
        //  move 50 pixels up--#5
        Tortoise.move(50);
        //  turn 90 degrees right--#6
        Tortoise.turn(90);
        // Repeat--#3.2
      }
      //turn 90 degrees--#7
      Tortoise.turn(90);
      //  Repeat--#4.2
    }
  }
}