package org.teachingkidsprogramming.section03ifs.Katas_and_Variations;

import java.awt.Color;

import org.teachingextensions.approvals.lite.util.ThreadUtils;
import org.teachingextensions.logo.Tortoise;
import org.teachingextensions.logo.utils.ColorUtils.PenColors;
import org.teachingextensions.logo.utils.EventUtils.MessageBox;

public class ChooseYourOwnAdventure_02
{
  public static void main(String[] args)
  {
    startStory();
  }
  private static void startStory()
  {
    tellMoreStory("One morning the Tortoise woke up from a dream.");
    animateStartStory();
    String action = askAQuestion("Do you want to 'get up' or 'go back to sleep'?");
    if ("get up".equalsIgnoreCase(action))
    {
      tellMoreStory("You get up and have a boring day. The end.");
    }
    else if ("go back to sleep".equalsIgnoreCase(action))
    {
      tellMoreStory(
          "You go back to sleep and end up in a Wonder land. You see a path ahead and a path to the right.");
      String input = askAQuestion("Do you want to take the 'path ahead' or the 'path to the right' ?");
      if ("path ahead".equalsIgnoreCase(input))
      {
        adventureUpAhead();
      }
      else if ("backyard".equalsIgnoreCase(input))
        ;
      {
        pourIntoBackyard();
      }
      System.exit(0);
    }
    else
    {
      tellMoreStory("You don't know how to read directions. You can't play this game. The end.");
    }
  }
  private static void pourIntoBackyard()
  {
    tellMoreStory(
        "As you walk into the backyard a net scoops you up and a giant takes you to a boiling pot of water.");
    String ask = askAQuestion("As the man starts to prepare you as soup, do you...'Scream' or 'Faint'?");
    if ("faint".equalsIgnoreCase(ask))
    {
      tellMoreStory("You made a delicious soup! Yum! The end.");
    }
    else if ("scream".equalsIgnoreCase(ask))
    {
      startStory();
    }
    else
    {
      System.exit(0);
    }
  }
  private static void adventureUpAhead()
  {
    MessageBox.showMessage("As you walk up ahead you find a box.");
    String action = askAQuestion("Do you want to 'open it' or 'leave it alone'?");
    if ("open it".equalsIgnoreCase(action))
    {
      tellMoreStory("Awesome! You open the box to reveal a treasure");
    }
    else if ("heck yes".equalsIgnoreCase(action))
    {
      tellMoreStory("Awesome dude!  You live out the rest of your life fighting crimes and eating pizza!");
    }
    else
    {
      System.exit(0);
    }
  }
  private static void animateStartStory()
  {
    Tortoise.show();
    Color color = PenColors.Grays.Black;
    for (int i = 0; i < 25; i++)
    {
      Tortoise.getBackgroundWindow().setColor(color);
      color = PenColors.lighten(color);
      ThreadUtils.sleep(100);
    }
  }
  private static void tellMoreStory(String message)
  {
    MessageBox.showMessage(message);
  }
  private static String askAQuestion(String question)
  {
    String answer = MessageBox.askForTextInput(question);
    return answer;
  }
}
