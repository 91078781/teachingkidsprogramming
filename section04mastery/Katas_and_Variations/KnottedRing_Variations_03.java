package org.teachingkidsprogramming.section04mastery.Katas_and_Variations;

import org.teachingextensions.logo.Tortoise;
import org.teachingextensions.logo.utils.ColorUtils.ColorWheel;
import org.teachingextensions.logo.utils.ColorUtils.PenColors;

public class KnottedRing_Variations_03
{
  public static void main(String[] args)
  {
    Tortoise.show();
    Tortoise.setSpeed(10);
    createColorPalette();
    for (int i = 0; i < 30; i++)
    {
      Tortoise.setPenColor(ColorWheel.getNextColor());
      drawOctagonwithOverLap();
      Tortoise.turn(360 / 30);
      Tortoise.turn(5);
    }
  }
  private static void drawOctagonwithOverLap()
  {
    for (int i = 0; i < 7 + 1; i++)
    {
      Tortoise.move(100);
      Tortoise.turn(360 / 10);
    }
  }
  private static void createColorPalette()
  {
    ColorWheel.addColor(PenColors.Pinks.HotPink);
    ColorWheel.addColor(PenColors.Reds.Red);
    ColorWheel.addColor(PenColors.Pinks.Fuchsia);
    ColorWheel.addColor(PenColors.Reds.OrangeRed);
    ColorWheel.addColor(PenColors.Pinks.DeepPink);
    ColorWheel.addColor(PenColors.Reds.MediumVioletRed);
    ColorWheel.addColor(PenColors.Reds.Crimson);
    ColorWheel.addColor(PenColors.Reds.Tomato);
  }
}
