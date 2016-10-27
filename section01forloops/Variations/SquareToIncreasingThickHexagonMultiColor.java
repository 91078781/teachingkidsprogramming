package org.teachingkidsprogramming.section01forloops.Variations;

import org.teachingextensions.logo.Tortoise;
import org.teachingextensions.logo.utils.ColorUtils.PenColors;
import org.teachingextensions.virtualproctor.VirtualProctor;

public class SquareToIncreasingThickHexagonMultiColor
{
  //----Kata Question----
  //  How would you make an hexagon...
  // with 20 pixel thick sides
  // and multi-colored lines
  // and with side lengths of 25 that increase y 2 times?
  // Write out steps in English
  // Then translate the steps into code
  // Make sure to run after each line
  public static void main(String[] args) throws Exception
  {
    VirtualProctor.setName("Jaqueline and Anthony");
    VirtualProctor.setClassName("Palm Digital");
    Tortoise.setPenWidth(20);
    Tortoise.show();
    Tortoise.setSpeed(10);
    //make a variable named length
    // initialize length to 25
    int length = 5;
    //Change number of side to 6
    int sides = 6;
    for (int i = 0; i < sides; i++)
    {
      // Change the color of the line to multicolor
      Tortoise.setPenColor(PenColors.getRandomColor());
      // Start side length at 25 pixels
      Tortoise.move(length);
      // every time through the loop double length
      length = length * 2;
      Tortoise.turn(360 / sides);
    }
  }
}
