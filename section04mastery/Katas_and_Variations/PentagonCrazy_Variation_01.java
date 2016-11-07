package org.teachingkidsprogramming.section04mastery.Katas_and_Variations;

import org.teachingextensions.logo.Tortoise;
import org.teachingextensions.logo.utils.ColorUtils.ColorWheel;
import org.teachingextensions.logo.utils.ColorUtils.PenColors.Blues;
import org.teachingextensions.logo.utils.ColorUtils.PenColors.Purples;

public class PentagonCrazy_Variation_01
{
  public static void main(String[] args)
  {
    Tortoise.show();
    Tortoise.setSpeed(10);
    createColorPalette();
    drawPentagon();
  }
  private static void drawPentagon()
  {
    for (int i = 0; i < 200; i++)
    {
      adjustPen();
      int sides = 6;
      int length = i;
      Tortoise.move(length / 2);
      Tortoise.turn(360 / sides);
      Tortoise.turn(1);
    }
  }
  private static void adjustPen()
  {
    Tortoise.setPenColor(ColorWheel.getNextColor());
    Tortoise.setPenWidth(Tortoise.getPenWidth() + 1);
    if (Tortoise.getPenWidth() > 3)
    {
      Tortoise.setPenWidth(1);
    }
    //
  }
  private static void createColorPalette()
  {
    ColorWheel.addColor(Blues.SteelBlue);
    ColorWheel.addColor(Purples.DarkMagenta);
    ColorWheel.addColor(Blues.DarkCyan);
    ColorWheel.addColor(Blues.Teal);
    ColorWheel.addColor(Purples.Indigo);
  }
}
