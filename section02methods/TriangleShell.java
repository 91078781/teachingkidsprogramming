package org.teachingkidsprogramming.section02methods;

import org.teachingextensions.logo.Tortoise;

@SuppressWarnings("unused")
public class TriangleShell
{
  private static int length = 1;
  public static void main(String[] args)
  {
    Tortoise.show();
    Tortoise.setSpeed(10);
    for (int i = 0; i < 60; i++)
    {
      //      Change the pen color of the line the tortoise draws to a random color --#9
      length = length + 4;
      for (int j = 0; j < 3; j++)
      {
        Tortoise.move(length);
        Tortoise.turn(360 / 3);
      }
      //
      //      Turn the tortoise 1/60th of 360 degrees to the right --#10
      Tortoise.turn(360 / 60);
    }
  }
}
