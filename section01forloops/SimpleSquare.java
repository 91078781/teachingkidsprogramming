package org.teachingkidsprogramming.section01forloops;

import org.teachingextensions.logo.Tortoise;
import org.teachingextensions.logo.utils.ColorUtils.PenColors;
import org.teachingextensions.virtualproctor.VirtualProctor;

//
// ------ Kata Question ------
//
//How would you make an equilateral triangle with a
// horizontal base?
//Write the steps out in English
//Then translate the steps into code
//make sure to run after every line
//
public class SimpleSquare
{
  public static void main(String[] args) throws Exception
  {
    VirtualProctor.setName("Jaqueline and Anthony");
    VirtualProctor.setClassName("Mr. C");
    Tortoise.show();
    Tortoise.setSpeed(10);
    // Make all the 3 sides equal -- #1
    int sides = 900;
    for (int i = 0; i < sides; i++)
    {
      Tortoise.setPenColor(PenColors.Blues.Blue);
      Tortoise.move(50);
      // Make all the angles equal --#2
      Tortoise.turn(360 / sides);
    }
  }
}
