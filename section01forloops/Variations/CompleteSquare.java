package org.teachingkidsprogramming.section01forloops.Variations;

import org.teachingextensions.logo.Tortoise;
import org.teachingextensions.logo.utils.ColorUtils.PenColors;

public class CompleteSquare
{
  // use the Tortoise to draw a red square with a width and height of 40 pixels
  //
  // Write each of the English line comment (use at least 6 line comments)
  //
  // Number each comment line at the end, so your user knows the correct order
  //    to translate the code
  //
  //Verify-step one- Translate Each comment line into java code
  //
  //verify- step two Run your code after each line
  public static void main(String[] args) throws Exception
  {
    // TODO: write comments  and then code here
    // Show tortoise --#1
    Tortoise.show();
    // Make the tortoise move as fast as possible--#6
    Tortoise.setSpeed(10);
    // Do the following 4 times --#5.1
    for (int i = 0; i < 4; i++)
    {
      //      Move the tortoise 40 pixels --#2
      Tortoise.move(40);
      //      Turn the tortoise to the right 90 degrees --#3
      Tortoise.turn(90);
      //      Change the pen color the the Tortoise draws to red --#4
      Tortoise.setPenColor(PenColors.Reds.Red);
      //Repeat -- #5.2
    }
  }
}
